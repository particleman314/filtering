package tracks;

import filters.Filter;
import initiation.Initiation;
import measurements.MeasurementWindow;

public class Track implements TrackInterface {
    private MeasurementWindow _measurements;
    private Filter _filter;
    private Initiation _initialStartup;
}
