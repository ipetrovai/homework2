import java.io.IOException;
import java.io.Writer;

/**
 * Created by Ionut on 22.01.2018.
 */
public class ElectricCarsCSVWriter {
    public static final String SEPARATOR = ",";
    public static final String NEW_LINE = "\n";

    public void writeCandidat(ElectricCars electricCars, Writer output) throws IOException {
        String electricCarsAsCSVLine = convertToCSVLine(electricCars);
        output.write(electricCarsAsCSVLine);
    }

    private String convertToCSVLine(ElectricCars electricCars) {
        return electricCars.getManufacturer() + SEPARATOR +
                electricCars.getModel() + SEPARATOR +
                electricCars.getYear() + SEPARATOR +
                electricCars.getPrice() + SEPARATOR +
                electricCars.getEnergyConsumtion()+
        NEW_LINE;
    }
}
