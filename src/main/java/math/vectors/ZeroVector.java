package math.vectors;

import math.vectors.Vector;

public class ZeroVector extends Vector {

    public ZeroVector(Integer size) {
        super(size);
    }

    public ZeroVector(Integer size, Boolean isRowVector ) {
        this._isRowVector = isRowVector;
        if ( isRowVector ) {
            this.setColumnDimensions(size);
            this.setRowDimensions(1);
        } else {
            this.setRowDimensions(size);
            this.setColumnDimensions(1);
        }
        this.setData(new java.util.Vector<Double>(size));
        this.isValidTensor();
    }

    public ZeroVector(Integer size, java.util.Vector<Double> data, Boolean isRowVector ) {
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
