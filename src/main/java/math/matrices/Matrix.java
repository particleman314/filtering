package math.matrices;

import math.Tensor;

import java.util.Vector;

public class Matrix extends Tensor {

    public Matrix() {
        super(0,0);
    }

    public Matrix(Integer rows, Integer cols) {
        super(rows, cols);
    }

    public Matrix(Integer rows, Integer cols, Vector<Double> data) {
        super(rows, cols, data);
    }
}
