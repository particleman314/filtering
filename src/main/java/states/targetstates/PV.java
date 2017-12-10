package states.targetstates;

import states.State;
import states.StateType;

import java.util.ArrayList;

public class PV extends State {
    public PV(ArrayList<Double> X0) {
        super(X0, new StateType("PV"));
    }
}
