package measurements;

import models.Model;

public class NDMeasurement extends Measurement {

    public NDMeasurement( Integer size ) {
        this.setMeasurement(size);
    }

    public Measurement convertTo(Model model) {
        return null;
    }
}
