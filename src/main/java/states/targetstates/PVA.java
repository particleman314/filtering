package states.targetstates;

import states.State;
import states.StateType;

import java.util.ArrayList;

public class PVA extends State {
    public PVA(ArrayList<Double> X0) {
        super(X0, new StateType("PVA"));
    }
}
