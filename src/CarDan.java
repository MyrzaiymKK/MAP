public class CarDan {
   // год выпуска, модель, цена, цвет
    int god;
    String model;
    int price;
    String color;

    public CarDan(int god, String model, int price, String color) {
        this.god = god;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarDan{" +
                "god=" + god +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
