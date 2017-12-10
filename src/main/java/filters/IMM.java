package filters;

import math.matrices.Matrix;

import java.util.ArrayList;

public class IMM extends Filter {
    Boolean _isValid;
    ArrayList<Filter> _filters;
    Matrix _transitions;

    public IMM(ArrayList<Filter> filters, Matrix transitionValues) {
        this._filters = filters;
        this._transitions = transitionValues;
        this._isValid = false;
        this.validateFilter();
    }

    private void validateFilter() {
        if ( this._filters != null ) {
            int numFilters = this._filters.size();
            if ( this._transitions.getRowDimensions() == numFilters ||
                    this._transitions.getColumnDimensions() == numFilters ) {
                this._isValid = true;
            }
        }
    }
}
