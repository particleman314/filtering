package states.targetstates;

import mathwrapper.MathVector;
import states.State;
import states.StateType;

public class PV extends State {
    public PV(MathVector X0) {
        super(X0, new StateType("PV"));
    }
}
