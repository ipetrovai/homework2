import java.util.ArrayList;

/**
 * Created by Ionut on 06.12.2017.
 */
public class Dealership
{
    public static void main(String[] args)
    {
        ArrayList<Cars> oldCars = new ArrayList<Cars>();
        oldCars.add(new Cars("Audi","A5", 2010,13000 ));
        oldCars.add(new Cars("Nissan","Skyline", 2012,9000 ));
        oldCars.add(new Cars("BMW","X5", 2011,12400 ));
        oldCars.add(new Cars("Mercedes","S-Class", 2010,15000 ));

        ArrayList<Cars> newCars = new ArrayList<Cars>();
        newCars.add(new NewCars("Bmw","i3",2017,230,40000));
        newCars.add(new NewCars("Volkswagen","e-Up",2017,230,25000));
        newCars.add(new NewCars("Volkswagen","e-Golf",2017,230,38000));
        newCars.add(new NewCars("Kia","Soul",2017,230,34000));

        for(Cars cars: oldCars){
            System.out.println(cars);
        }

        System.out.println(" ");

        for(Cars Newcars: newCars){
            System.out.println(Newcars);
        }
    }
}
