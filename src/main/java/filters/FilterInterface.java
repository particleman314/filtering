package filters;

import mathwrapper.MathMatrix;
import measurements.Measurement;
import states.State;

public interface FilterInterface {
    public State predict();
    public State correct( Measurement meas );
    public MathMatrix computeGain();
}
