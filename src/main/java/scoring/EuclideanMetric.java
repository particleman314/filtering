package scoring;

import measurements.Measurement;
import org.jblas.DoubleMatrix;

public class EuclideanMetric extends Scorer {
    public Double calculateScore(Measurement meas1, Measurement meas2) {
        DoubleMatrix measurementDifference = meas1.getMeasurement().sub(meas2.getMeasurement());
        return measurementDifference.dot(measurementDifference);
    }
}
