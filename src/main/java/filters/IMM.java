package filters;

import mathwrapper.MathMatrix;

import java.util.ArrayList;

public class IMM extends Filter {
    Boolean _isValid;
    ArrayList<Filter> _filters;
    MathMatrix _transitions;

    public IMM(ArrayList<Filter> filters, MathMatrix transitionValues) {
        this._filters = filters;
        this._transitions = transitionValues;
        this._isValid = false;
        this.validateFilter();
    }

    private void validateFilter() {
        if ( this._filters != null ) {
            int numFilters = this._filters.size();
            if ( this._transitions.getMatrixData().getRows() == numFilters ||
                    this._transitions.getMatrixData().getColumns() == numFilters ) {
                this._isValid = true;
            }
        }
    }
}
