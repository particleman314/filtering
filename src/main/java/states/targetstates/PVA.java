package states.targetstates;

import mathwrapper.MathVector;
import states.State;
import states.StateType;

public class PVA extends State {
    public PVA(MathVector X0) {
        super(X0, new StateType("PVA"));
    }
}
