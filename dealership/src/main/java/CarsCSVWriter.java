import java.io.IOException;
import java.io.Writer;

/**
 * Created by Ionut on 21.01.2018.
 */
public class CarsCSVWriter {
    public static final String SEPARATOR = ",";
    public static final String NEW_LINE = "\n";

    public void writeCars(Cars cars, Writer output) throws IOException {
        String carstAsCSVLine = convertToCSVLine(cars);
        output.write(carstAsCSVLine);
    }

    private String convertToCSVLine(Cars cars) {
        return cars.getManufacturer() + SEPARATOR +
                cars.getModel() +SEPARATOR +
                cars.getYear() +SEPARATOR +
                cars.getPrice()+
                NEW_LINE;
    }
}
