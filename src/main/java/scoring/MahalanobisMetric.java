package scoring;

import mathwrapper.MathMatrix;
import mathwrapper.MathVector;
import measurements.Measurement;
import measurements.exceptions.BadMeasurementTypeException;

public class MahalanobisMetric extends Scorer {
    public Double calculateScore(Measurement meas1, Measurement meas2) throws BadMeasurementTypeException {
        MathVector measurementDifference = meas1.getMeasurement().subtract(meas2.getMeasurement());
        MathMatrix measurementErrors = meas1.getMeasurementError().addition(meas2.getMeasurementError());

        return measurementDifference.transpose().dotProduct(measurementErrors.multiply(measurementDifference));
    }

}
