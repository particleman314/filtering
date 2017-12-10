package math;

import java.util.Vector;

public class Tensor implements TensorInterface {
    private Integer _rowSize;
    private Integer _columnSize;
    private Vector<Double> _data;
    private Boolean _isValid;

    public Tensor() {
        this._rowSize = 0;
        this._columnSize = 0;
        this.validate();
    }

    public Tensor( Integer rows, Integer cols ) {
        this._rowSize = rows;
        this._columnSize = cols;
        this.validate();
    }

    public Tensor( Integer rows, Integer cols, Vector<Double> data ) {
        this._rowSize = rows;
        this._columnSize = cols;
        this._data = data;
        this.validate();
    }

    public void setRowDimensions(Integer rows) {
        this._rowSize = rows;
        this.augmentTensor();
    }

    public void setColumnDimensions(Integer columns) {
        this._columnSize = columns;
        this.augmentTensor();
    }

    public Integer getRowDimensions() {
        return this._rowSize;
    }

    public Integer getColumnDimensions() {
        return this._columnSize;
    }

    public void setData( Vector<Double> data) {
        this._data = data;
        this.augmentTensor();
        this.validate();
    }

    public Vector<Double> getData() {
        if ( this.isValidTensor() )
            return this._data;
        return null;
    }

    public Boolean isValidTensor() {
        return this._isValid;
    }

    private void augmentTensor() {}

    private void validate() {
        if ( this._rowSize > 0 && this._columnSize > 0 )
            this._isValid = true;
    }
}
