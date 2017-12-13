package scoring;

import mathwrapper.MathMatrix;
import measurements.Measurement;
import measurements.exceptions.BadMeasurementTypeException;

import static java.lang.Math.log;
import static java.lang.Math.sqrt;

public class BrattacharyyaMetric extends Scorer {
    public Double calculateScore(Measurement meas1, Measurement meas2) throws BadMeasurementTypeException {
        MathMatrix measurementErrors = meas1.getMeasurementError().addition(meas2.getMeasurementError());

        Double MahalanobisDistance = new MahalanobisMetric().calculateScore(meas1, meas2);

        Double determinantMeas1Error = meas1.getMeasurementError().determinant();
        Double determinantMeas2Error = meas2.getMeasurementError().determinant();
        Double determinantDiff = measurementErrors.determinant();

        return 0.125 * MahalanobisDistance + 0.5 * log(determinantDiff / sqrt(determinantMeas1Error * determinantMeas2Error));
    }
}
