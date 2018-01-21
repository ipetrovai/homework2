import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ionut on 22.01.2018.
 */
public class ElectricCarsCSV {
    public void writing2(ArrayList<ElectricCars> electricCars) throws IOException {

        ElectricCarsCSVWriter writer2 = new ElectricCarsCSVWriter();
        FileWriter output = new FileWriter("electricCars.csv", true);

        for (ElectricCars ec : electricCars) {
            writer2.writeCandidat(ec, output);
        }

        output.flush();
        output.close();

    }
}
