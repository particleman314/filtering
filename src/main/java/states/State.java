package states;

import mathwrapper.MathVector;

public class State implements StateInterface {

    private StateType _stateType;
    protected MathVector _stateVector;
    private Boolean _isValid;

    public State( MathVector X0, StateType stateType ) {
        this._stateVector = X0;
        this._stateType = stateType;
        this.validateState();
    }

    private void validateState() {
        if ( this._stateVector == null ) {
            this._isValid = false;
            return;
        }
        this._isValid = true;
    }
}
