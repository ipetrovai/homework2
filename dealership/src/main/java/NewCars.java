/**
 * Created by Ionut on 17.12.2017.
 */
public class NewCars extends Cars {
    private int EnergyConsumtion;
    private boolean FastCharging;

    public NewCars(String manufacturer, String model, int year, int energyConsumtion, int price, boolean fastCharging) {
        super(manufacturer, model, year, price);
        EnergyConsumtion = 2000;
    }

    public int getEnergyConsumtion() {
        return EnergyConsumtion;
    }

    public void setEnergyConsumtion(int energyConsumtion) {
        EnergyConsumtion = energyConsumtion;
    }

    public boolean isFastCharging() {
        return FastCharging;
    }

    public void setFastCharging(boolean fastCharging) {
        FastCharging = fastCharging;
    }

    @Override
    public String toString() {
        return "NewCars{" +
                "EnergyConsumtion=" + EnergyConsumtion +
                ", FastCharging=" + FastCharging +
                '}';
    }
}
