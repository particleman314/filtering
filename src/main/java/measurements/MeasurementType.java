package measurements;

import measurements.exceptions.BadMeasurementTypeException;

import java.util.HashMap;

public class MeasurementType {
    private String _typeID;
    private Boolean _valid;
    private HashMap<String, Boolean> _canConvert;

    // All setting methods are associated via the creation of the type (for now)
    public MeasurementType(String typeID) {
        this._typeID = typeID;
        this.validateType();
    }

    String getTypeID() throws BadMeasurementTypeException {
        if ( this._valid )
            return this._typeID;
        throw new BadMeasurementTypeException();
    }

    Integer size() { return 1; }

    Boolean isValid() {
        return this._valid;
    }

    Boolean canConvertTo(MeasurementType otherMeasurement ) throws BadMeasurementTypeException {
        if ( otherMeasurement == null || ! otherMeasurement.isValid() ) return false;
        return this._canConvert.containsKey(otherMeasurement.getTypeID());
    }

    private void validateType() {
        if ( this._typeID == null ) {
            this._valid = false;
            return;
        }
        this._valid = true;
    }
}
