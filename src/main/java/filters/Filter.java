package filters;

import math.matrices.Matrix;
import measurements.Measurement;
import states.State;

public class Filter implements FilterInterface {
    public State predict() {
        return null;
    }

    public State correct(Measurement meas) {
        return null;
    }

    public Matrix computeGain() {
        return null;
    }
}
