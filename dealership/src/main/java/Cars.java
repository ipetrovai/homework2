/**
 * Created by Ionut on 06.12.2017.
 */
public class Cars
{
    private String manufacturer;
    private int year;
    private String model;
    private int price;



    public  Cars(String manufacturer,String model, int year, int price) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.model = model;
        this.price = price;

    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  manufacturer +" "+
                model +" "
                +year+" "
                +price
                ;
    }
}
