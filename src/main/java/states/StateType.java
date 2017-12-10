package states;

import states.exceptions.BadStateTypeException;

import java.util.HashMap;

public class StateType {
    private String _typeID;
    private Boolean _valid;
    private HashMap<String, Boolean> _canConvert;

    // All setting methods are associated via the creation of the type (for now)
    public StateType(String typeID) {
        this._typeID = typeID;
        this.validateType();
    }

    String getTypeID() throws BadStateTypeException {
        if ( this._valid )
            return this._typeID;
        throw new BadStateTypeException();
    }

    Boolean isValid() {
        return this._valid;
    }

    Boolean canConvertTo( StateType otherState ) throws BadStateTypeException {
        if ( otherState == null || ! otherState.isValid() ) return false;
        return this._canConvert.containsKey(otherState.getTypeID());
    }

    private void validateType() {
        if ( this._typeID == null ) {
            this._valid = false;
            return;
        }
        this._valid = true;
    }
}
