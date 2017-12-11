package bias;

import org.jblas.DoubleMatrix;

public class Bias {
    DoubleMatrix _biasVector;
    DoubleMatrix _biasMatrix;

    public Bias(Integer rows, Integer cols) {
        this._biasMatrix = new DoubleMatrix.zeros(rows, cols);
        this._biasVector = new DoubleMatrix.zeros(rows);
    }
}
