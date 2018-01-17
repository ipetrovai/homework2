import java.util.ArrayList;

/**
 * Created by Ionut on 06.12.2017.
 */
public class Dealership
{
    public static void main(String[] args)
    {
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

        System.out.println(oldCars);

        ArrayList<NewCars> newcars = new ArrayList<NewCars>();
        Cars nc1 = new NewCars("Volkswagen","E-Up",2017,1900,38000,true);
        Cars nc2 = new NewCars("Renault","Zoe",2017,1800,33000,true);
        Cars nc3 = new NewCars("Bmw","I3",2017,1800,40000,true);
        Cars nc4 = new NewCars("Smart","FourFour",2017,1850,22700,true);
        Cars nc5 = new NewCars("Kia","Soul",2017,1680,34000,true);
        Cars nc6 = new NewCars("Hyundai","Ioniq",2017,1900,38000,true);

        System.out.println(newcars);
    }
}
