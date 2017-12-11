package scoring;

import measurements.Measurement;
import measurements.exceptions.BadMeasurementTypeException;

public interface ScoreInterface {
    public Double calculateScore(Measurement meas1, Measurement meas2) throws BadMeasurementTypeException;
}
