package filters;

import mathwrapper.MathMatrix;
import measurements.Measurement;
import states.State;

public class Filter implements FilterInterface {

    public State predict() {
        return null;
    }

    public State correct(Measurement meas) {
        return null;
    }

    public MathMatrix computeGain() {
        return null;
    }
}
