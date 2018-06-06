import java.util.Arrays;
import java.util.List;

public class Mobile {
    private int id;
    private String name;
    private double price;
    private String os;
    private double screenSize;
    private double discount;

    public String getBrand() {
        return brand;
    }

    public enum Color {RED, BLACK, WHITE, SILVER, GOLDEN}

    ;
    Color color;
    String brand;
    int ram;
    int storage;
    boolean dualSim;
    int battery;
    List<Camera> cameraList;
    Dimensions dimensions;

    public Mobile(int id, String name, double price, String os, double screenSize, double discount, Color color, String brand, int ram, int storage, boolean dualSim, int battery, List<Camera> cameraList, Dimensions dimensions) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.os = os;
        this.screenSize = screenSize;
        this.discount = discount;
        this.color = color;
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.dualSim = dualSim;
        this.battery = battery;
        this.cameraList = cameraList;
        this.dimensions = dimensions;
    }

    public double getPrice() {
        return price;
    }

    public String getOs() {
        return os;
    }

    public List<Camera> getCameraList() {
        return cameraList;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getEffectivePrice() {
        return (price - (price * discount / 100.0));

    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", os='" + os + '\'' +
                ", screenSize=" + screenSize +
                ", discount=" + discount +
                ", color=" + color +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", dualSim=" + dualSim +
                ", battery=" + battery +
                ", cameraList=" + cameraList +
                ", dimensions" + dimensions +
                '}';
    }
}
