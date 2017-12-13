package mathwrapper;

// Interface wrapper for underlying math library

import org.jblas.DoubleMatrix;

public class MathVector {

    private DoubleMatrix _vector;

    public MathVector( Integer size ) {
        if ( size <= 0 ) { this._vector = new DoubleMatrix(0, 0); }
        this._vector = new DoubleMatrix(size);
    }

    public MathVector( Integer size, Double fillValue ) {
        if ( size <= 0 ) { this._vector = new DoubleMatrix(0); }
        this._vector = new DoubleMatrix(size);
        this.fill(fillValue);
    }

    public MathVector( DoubleMatrix vector ) {
        this._vector = vector;
    }

    public MathVector() {
        this._vector = new DoubleMatrix(0);
    }

    public DoubleMatrix getVectorData() {
        return this._vector;
    }

    public Integer getLength() {
        return this.getVectorData().getLength();
    }

    public Boolean isRowVector() {
        return this.getVectorData().isRowVector();
    }

    public static MathVector zeroVector( Integer size ) {
        MathVector zV = new MathVector(size);
        zV.fill(0.0);
        return zV;
    }

    private void fill( Double fillValue ) {
        this._vector.fill(fillValue);
    }

    // Operations specific to vectors with other vectors...
    //
    // dot product, cross product, matrix-product
    // ==============================================================

    public MathVector addition( MathVector other ) {
        if ( other.getLength() != this.getLength() ) { return null; }
        return new MathVector( this.getVectorData().add(other.getVectorData()) );
    }

    public MathVector subtract( MathVector other ) {
        if ( other.getLength() != this.getLength() ) { return null; }
        return new MathVector( this.getVectorData().sub(other.getVectorData()) );
    }

    public MathMatrix crossProduct( MathVector other ) {
        Integer otherRowSize = other.getVectorData().getRows();

        if ( this.getVectorData().getColumns() != otherRowSize ) {
            return new MathMatrix(0,0);
        }

        return new MathMatrix( this.getVectorData().mul( other.getVectorData() ) );
    }

    public MathVector multiply( MathMatrix otherMatrix ) {
        return null;
    }

    public Double dotProduct( MathVector other ) {
        if ( other == null ) { return null; }
        return this.getVectorData().dot( other.transpose().getVectorData() );
    }

    public static Double square( MathVector vec ) {
        return vec.dotProduct(vec);
    }

    public MathVector transpose() {
        if ( this.isRowVector() ) {
            DoubleMatrix transposedVector = new DoubleMatrix(this.getVectorData().getColumns(), 1, this.getVectorData().data);
            return new MathVector(transposedVector);
        }
        return this;
    }
}
