/**
 * Created by Ionut on 17.12.2017.
 */
public class ElectricCars extends Cars {
    private int EnergyConsumtion;
    private boolean FastCharging;

    public ElectricCars(String manufacturer, String model, int year, int energyConsumtion, int price, boolean fastCharging) {
        super(manufacturer, model, year, price);

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
        return "ElectricCars{" +
                "EnergyConsumtion=" + EnergyConsumtion +
                ", FastCharging=" + FastCharging +
                '}';
    }
}