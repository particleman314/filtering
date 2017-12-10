package states.targetstates;

import states.State;
import states.StateType;

import java.util.ArrayList;

public class P extends State {

    public P(ArrayList<Double> X0) {
        super(X0, new StateType("P"));
    }
}
