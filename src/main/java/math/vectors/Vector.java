package math.vectors;

import math.Tensor;

public class Vector extends Tensor {
    protected Boolean _isRowVector;

    public Vector() {
        this._isRowVector = false;
        this.setRowDimensions(0);
        this.isValidTensor();
    }

    public Vector(Integer size) {
        super(1, size);
    }

    public Vector(Integer size, Boolean isRowVector ) {
        this._isRowVector = isRowVector;
        if ( isRowVector ) {
            this.setColumnDimensions(size);
            this.setRowDimensions(1);
        } else {
            this.setRowDimensions(size);
            this.setColumnDimensions(1);
        }

        this.isValidTensor();
    }

    public Vector(Integer size, java.util.Vector<Double> data, Boolean isRowVector ) {
        this._isRowVector = isRowVector;
        if ( isRowVector ) {
            this.setColumnDimensions(size);
            this.setRowDimensions(1);
        } else {
            this.setRowDimensions(size);
            this.setColumnDimensions(1);
        }

        this.setData(data);
        this.isValidTensor();
    }
}
