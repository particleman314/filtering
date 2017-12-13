package measurements;

import bias.Bias;
import features.Feature;
import mathwrapper.MathMatrix;
import mathwrapper.MathVector;
import measurements.exceptions.BadMeasurementTypeException;

import java.util.HashMap;

abstract public class Measurement implements MeasurementInterface {

    protected MeasurementType _measType;

    private MathVector _measurementData;
    private MathMatrix _measurementNoise;

    private Bias _measSystematicBias;
    private HashMap<String, Feature> _measFeatures;

    public String getMeasurementType() throws BadMeasurementTypeException {
        return this._measType.getTypeID();
    }

    public MathVector getMeasurement() {
        return this._measurementData;
    }

    protected void setMeasurement(Integer size) {
        this._measurementData = new MathVector(3);
    }

    protected void setMeasurement(MathVector data) {
        this._measurementData = data;
    }

    public Feature getFeature( String featureType ) {
        return this._measFeatures.get(featureType);
    }

    public Boolean hasFeature( String featureType ) {
        return this._measFeatures.containsKey(featureType);
    }

    public MathMatrix getMeasurementError() throws BadMeasurementTypeException {
        if ( this._measurementNoise == null ) {
            Integer size = this._measType.size();
            MathMatrix D = new MathMatrix(size, size,0.0);
            return D;
        } else {
            return this._measurementNoise;
        }
    }
}
