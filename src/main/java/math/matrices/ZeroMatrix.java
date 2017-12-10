package math.matrices;

import java.util.Vector;

public class ZeroMatrix extends Matrix {

    public ZeroMatrix( Integer rows, Integer cols ) {
        Integer contiguousSize = rows * cols;
        this.setRowDimensions(rows);
        this.setColumnDimensions(cols);
        this.setData(new Vector<Double>(contiguousSize));
    }
}
