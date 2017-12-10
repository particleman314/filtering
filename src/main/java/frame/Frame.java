package frame;

import measurements.Measurement;
import tracks.Track;

import java.util.Vector;

public class Frame implements FrameInterface {
    Vector<Measurement> _measurements;
    Vector<Track> _tracks;
}
