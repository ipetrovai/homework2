import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ionut on 22.01.2018.
 */
public class CarsCSV {
    public void writing(ArrayList<Cars> cars) throws IOException {

        CarsCSVWriter writer = new CarsCSVWriter();
        FileWriter output = new FileWriter("cars.csv", true);

        for (Cars c : cars) {
            writer.writeCars(c, output);
        }

        output.flush();
        output.close();

    }
}
