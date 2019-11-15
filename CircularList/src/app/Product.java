package app;

/**
 * Product
 */
public class Product {

    private String name;
    private int id;
    private double price;
    public static int counter = 0;

    public Product(int id, String name, double price) {
        this.id = counter; setName(name); setPrice(price);
        counter++;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + " precio de " + this.price;
    }
}