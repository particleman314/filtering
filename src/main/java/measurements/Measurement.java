package measurements;

import features.Feature;
import math.matrices.Matrix;
import math.matrices.ZeroMatrix;
import math.vectors.Vector;
import measurements.exceptions.BadMeasurementTypeException;

import java.util.HashMap;

abstract public class Measurement implements MeasurementInterface {

    protected MeasurementType _measType;

    private Vector _measurementData;
    private Matrix _measurementNoise;
    private Vector _measSystematicBias;
    private Vector _measRandomBias;
    private HashMap<String, Feature> _measFeatures;

    public String getMeasurementType() throws BadMeasurementTypeException {
        return this._measType.getTypeID();
    }

    public Vector getMeasurement() {
        return this._measurementData;
    }

    protected void setMeasurement(Integer size) {
        this._measurementData = new Vector(3, false);
    }

    protected void setMeasurement(Vector data) {
        this._measurementData = data;
    }

    public Feature getFeature( String featureType ) {
        return this._measFeatures.get(featureType);
    }

    public Boolean hasFeature( String featureType ) {
        return this._measFeatures.containsKey(featureType);
    }

    public Matrix getMeasurementNoise() throws BadMeasurementTypeException {
        if ( this._measurementNoise == null ) {
            Integer size = this._measType.size();
            return new ZeroMatrix(size, size);
        } else {
            return this._measurementNoise;
        }
    }
}
