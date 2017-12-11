package scoring;

import measurements.Measurement;
import measurements.exceptions.BadMeasurementTypeException;
import org.jblas.DoubleMatrix;

import static java.lang.Math.log;
import static java.lang.Math.sqrt;

public class BrattacharyyaMetric extends Scorer {
    public Double calculateScore(Measurement meas1, Measurement meas2) throws BadMeasurementTypeException {
        DoubleMatrix measurementDifference = meas1.getMeasurement().sub(meas2.getMeasurement());
        DoubleMatrix measurementErrors = meas1.getMeasurementError().add(meas2.getMeasurementError());

        Double MahalanobisDistance = measurementDifference.muliRowVector(measurementErrors.mulColumnVector(measurementDifference)).get(0);

        Double determinantMeas1Error = meas1.getMeasurementError().determinant();
        Double determinantMeas2Error = meas2.getMeasurementError().determinant();
        Double determinantDiff = measurementErrors.determinant();

        return 0.125 * MahalanobisDistance + 0.5 * log(determinantDiff/sqrt(determinantMeas1Error*determinantMeas2Error));
}
