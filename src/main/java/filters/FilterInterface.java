package filters;

import math.matrices.Matrix;
import measurements.Measurement;
import states.State;

public interface FilterInterface {
    public State predict();
    public State correct( Measurement meas );
    public Matrix computeGain();
}
