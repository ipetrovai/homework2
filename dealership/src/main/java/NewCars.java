/**
 * Created by Ionut on 17.12.2017.
 */
public class NewCars extends Cars {
    private int EnergyConsumtion;

    public NewCars(String manufacturer, String model, int year, int energyConsumtion, int price) {
        super(manufacturer, model, year, price);
        EnergyConsumtion = 2000;
    }

    @Override
    public String toString() {
        return  "Manufacturer-"+""+getManufacturer()+" "
                +"Model-"+getModel()+" "
                +"year-"+""+getYear()+" "
                +"Price="+""+getPrice()+" "
                +"EnergyConsumtion=" + EnergyConsumtion
                ;
    }
}
