package measurements.cluster;

import measurements.Measurement;
import measurements.MeasurementType;
import models.Model;

import java.util.HashMap;
import java.util.Vector;

public class ClusterMeasurement extends Measurement {

    private HashMap<MeasurementType, Vector<Measurement>> _constitutentMeasurements;

    public Measurement convertTo(Model model) {
        return null;
    }
}
