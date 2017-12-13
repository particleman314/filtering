package states.targetstates;

import mathwrapper.MathVector;
import states.State;
import states.StateType;

import java.util.ArrayList;

public class P extends State {

    public P(MathVector X0) {
        super(X0, new StateType("P"));
    }
}
