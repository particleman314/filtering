package scoring;

import measurements.Measurement;
import measurements.exceptions.BadMeasurementTypeException;
import org.jblas.DoubleMatrix;

public class MahalanobisMetric extends Scorer {
    public Double calculateScore(Measurement meas1, Measurement meas2) throws BadMeasurementTypeException {
        DoubleMatrix measurementDifference = meas1.getMeasurement().sub(meas2.getMeasurement());
        DoubleMatrix measurementErrors = meas1.getMeasurementError().add(meas2.getMeasurementError());

        return measurementDifference.muliRowVector(measurementErrors.mulColumnVector(measurementDifference)).get(0);
    }

}
