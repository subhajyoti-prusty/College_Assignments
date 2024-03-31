class Laptop {
    private String model;
    private double price;

    // Setter method for model
    public void setModel(String model) {
        this.model = model;
    }

    // Setter method for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString() to return a string representation of the laptop
    @Override
    public String toString() {
        return "Laptop - Model: " + model + ", Price: $" + price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Laptop
        Laptop laptop = new Laptop();

        // Set the model using the setter method
        laptop.setModel("Dell Inspiron");

        // Print the laptop object using the toString() method
        System.out.println(laptop.toString());
    }
}
