package math.matrices;

import java.util.Vector;

public class IdentityMatrix extends Matrix {

    public IdentityMatrix( Integer rows, Integer cols ) {
        Integer contiguousSize = rows * cols;
        this.setRowDimensions(rows);
        this.setColumnDimensions(cols);

        Vector<Double> data = new Vector<Double>(contiguousSize);

        Integer strider = 0;
        for (Integer i = 0; i < rows; i++ ) {
            data.add(i + cols*strider,1.0);
        }
        this.setData(data);
        this.isValidTensor();
    }
}
