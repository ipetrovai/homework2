import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ionut on 06.12.2017.
 */
public class Dealership
{
    public static void main(String[] args) throws IOException
    {
        CarsCSVWriter writer = new CarsCSVWriter();

        ArrayList<Cars> oldCars = new ArrayList<Cars>();
        Cars c1 = new Cars("Audi","A6",2016,45000);
        Cars c2 = new Cars("Audi","A4",2015,22000);
        Cars c3 = new Cars("Bmw","X5",2015,34000);
        Cars c4 = new Cars("Bmw","X6",2012,50000);
        Cars c5 = new Cars("Mercedes","S-Class",2016,80000);
        Cars c6 = new Cars("Maseratti","Quattroporte",2016,120000);

        oldCars.add(c1);
        oldCars.add(c2);
        oldCars.add(c3);
        oldCars.add(c4);
        oldCars.add(c5);
        oldCars.add(c6);

        CarsCSV olcars = new CarsCSV();
        olcars.writing(oldCars);

        //System.out.println(oldCars);

        ElectricCarsCSVWriter writer2 = new ElectricCarsCSVWriter();

        ArrayList<ElectricCars> electricCars = new ArrayList<ElectricCars>();
        ElectricCars ec1 = new ElectricCars("Volkswagen","E-Up",2017,1900,38000,true);
        ElectricCars ec2 = new ElectricCars("Renault","Zoe",2017,1800,33000,true);
        ElectricCars ec3 = new ElectricCars("Bmw","I3",2017,1800,40000,true);
        ElectricCars ec4 = new ElectricCars("Smart","FourFour",2017,1850,22700,true);
        ElectricCars ec5 = new ElectricCars("Kia","Soul",2017,1680,34000,true);
        ElectricCars ec6 = new ElectricCars("Hyundai","Ioniq",2017,1900,38000,true);

        electricCars.add(ec1);
        electricCars.add(ec2);
        electricCars.add(ec3);
        electricCars.add(ec4);
        electricCars.add(ec5);
        electricCars.add(ec6);

        ElectricCarsCSV elcars = new ElectricCarsCSV();
        elcars.writing2(electricCars);

        //System.out.println(electricCars);
    }
}
