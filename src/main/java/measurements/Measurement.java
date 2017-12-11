package measurements;

import bias.Bias;
import features.Feature;
import measurements.exceptions.BadMeasurementTypeException;
import org.jblas.DoubleMatrix;

import java.util.HashMap;

abstract public class Measurement implements MeasurementInterface {

    protected MeasurementType _measType;

    private DoubleMatrix _measurementData;
    private DoubleMatrix _measurementNoise;

    private Bias _measSystematicBias;
    private HashMap<String, Feature> _measFeatures;

    public String getMeasurementType() throws BadMeasurementTypeException {
        return this._measType.getTypeID();
    }

    public DoubleMatrix getMeasurement() {
        return this._measurementData;
    }

    protected void setMeasurement(Integer size) {
        this._measurementData = new DoubleMatrix(3);
    }

    protected void setMeasurement(DoubleMatrix data) {
        this._measurementData = data;
    }

    public Feature getFeature( String featureType ) {
        return this._measFeatures.get(featureType);
    }

    public Boolean hasFeature( String featureType ) {
        return this._measFeatures.containsKey(featureType);
    }

    public DoubleMatrix getMeasurementError() throws BadMeasurementTypeException {
        if ( this._measurementNoise == null ) {
            Integer size = this._measType.size();
            DoubleMatrix D = new DoubleMatrix(size);
            D.fill(0.0);
            return D;
        } else {
            return this._measurementNoise;
        }
    }
}
