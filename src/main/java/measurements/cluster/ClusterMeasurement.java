package measurements.cluster;

import measurements.Measurement;
import measurements.MeasurementType;
import models.Model;

import java.util.HashMap;
import java.util.LinkedList;

public class ClusterMeasurement extends Measurement {

    private HashMap<MeasurementType, LinkedList<Measurement>> constitutentMeasurements;

    public Measurement convertTo(Model model) {
        return null;
    }
}
