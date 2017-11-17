/**
 * Created by Ionut on 17.11.2017.
 */
public class SalesRepresentative {

    private String name;
    private int sales;
    private int quant;
    private int earnings;

    public SalesRepresentative(String name, int sales, int quant, int earnings){
        this.name = name;
        this.sales = sales;
        this.quant = quant;
        this.earnings =earnings;
    }

    public int getEarnings() {
        return earnings;
    }

    @Override
    public String toString() {
        return "SalesRepresentative{" +
                "name='" + name + '\'' +
                ", sales=" + sales +
                ", quant=" + quant +
                ", earnings=" + earnings +
                '}';
    }
}
