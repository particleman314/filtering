package initiation;

import mathwrapper.MathMatrix;
import mathwrapper.MathVector;
import measurements.Measurement;

import java.util.Vector;

abstract public class Initiation implements InitiationInterface {

    private Vector<Measurement> _measurements;
    private MathVector _solutionVector;
    private MathMatrix _solutionError;
    //private ModelFunction _modelingFunction;
    private Boolean _isValid;

    public Initiation() {
        this._initializeClass();
    }

    public Initiation( Vector<Measurement> measurements ) {
        this._initializeClass();
        if ( measurements != null ) {
            this._measurements = measurements;
        }
    }

    //public void InitiationModelFunction( ModelFunction mf ) {
    //    this._modelingFunction = mf;
    //}

    public Boolean isValid() {
        return this._isValid;
    }

    private void _initializeClass() {
        //this._modelingFunction = null;
        this._solutionError = null;
        this._solutionVector = null;
        this._measurements = new Vector<Measurement>(0);
        this._isValid = false;
    }
}
