package mathwrapper;

// Interface wrapper for underlying math library

import org.jblas.DoubleMatrix;

public class MathMatrix {

    private DoubleMatrix _matrix;

    public MathMatrix( Integer rsize, Integer csize ) {
        if ( rsize <= 0 || csize <= 0 ) { this._matrix = new DoubleMatrix(0, 0); }
        this._matrix = new DoubleMatrix(rsize, csize);
    }

    public MathMatrix( Integer rsize, Integer csize, Double fillValue ) {
        if ( rsize <= 0 || csize <= 0 ) { this._matrix = new DoubleMatrix(0, 0); }
        this._matrix = new DoubleMatrix(rsize, csize);
        this.fill(fillValue);
    }

    public MathMatrix( DoubleMatrix matrix ) {
        this._matrix = matrix;
    }

    public MathMatrix() {
        this._matrix = new DoubleMatrix(0, 0);
    }

    public static MathMatrix zeroMatrix( Integer rsize, Integer csize ) {
        MathMatrix zM = new MathMatrix(rsize, csize);
        zM.fill(0.0);
        return zM;
    }

    private void fill( Double fillValue ) {
        this._matrix.fill(fillValue);
    }

    public DoubleMatrix getMatrixData() {
        return this._matrix;
    }

    // Operations specific to vectors with other vectors...
    //
    // dot product, cross product, matrix-product
    // ==============================================================

    public MathMatrix addition( MathMatrix other ) {
        if ( other.getMatrixData().getRows() != this.getMatrixData().getRows() ) { return null; }
        if ( other.getMatrixData().getColumns() != this.getMatrixData().getColumns() ) { return null; }
        return new MathMatrix( this.getMatrixData().add(other.getMatrixData()) );
    }

    public MathMatrix subtract( MathMatrix other ) {
        if ( other.getMatrixData().getRows() != this.getMatrixData().getRows() ) { return null; }
        if ( other.getMatrixData().getColumns() != this.getMatrixData().getColumns() ) { return null; }
        return new MathMatrix( this.getMatrixData().sub(other.getMatrixData()) );
    }

    public MathVector multiply( MathVector otherVec ) {
        return null;
    }

    public Double determinant() {
        return 1.0;

    }

}
