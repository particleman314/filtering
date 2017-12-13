package bias;

import mathwrapper.MathMatrix;
import mathwrapper.MathVector;

public class Bias {

    private MathVector _biasVector;
    private MathMatrix _biasMatrix;
    private Boolean _isValid;

    public Bias(Integer rows, Integer cols) {
        if ( rows <= 0 || cols <= 0 ) {
            this._initializeClass();
        } else {
            this._biasMatrix = new MathMatrix(rows, cols, 0.0);
            this._biasVector = new MathVector(cols, 0.0);
            this._isValid = true;
        }
    }

    private void _initializeClass() {
        this._biasMatrix = new MathMatrix();
        this._biasVector = new MathVector();
        this._isValid = false;
    }
}
