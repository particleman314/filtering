package scoring;

import mathwrapper.MathVector;
import measurements.Measurement;

public class EuclideanMetric extends Scorer {
    public Double calculateScore(Measurement meas1, Measurement meas2) {
        MathVector measurementDifference = meas1.getMeasurement().subtract(meas2.getMeasurement());
        return MathVector.square(measurementDifference);
    }
}
