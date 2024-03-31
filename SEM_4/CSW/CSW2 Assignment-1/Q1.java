class Car {
    private String make;
    private String model;

    // Parameterized constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter and setter methods for make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and setter methods for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

public class CarTester {
    public static void main(String[] args) {
        // Instantiate myCar1 with specified make and model
        Car myCar1 = new Car("Toyota", "Camry");

        // Instantiate myCar2 with null values
        Car myCar2 = new Car(null, null);

        // Print initial make and model of both cars
        System.out.println("Initial details of myCar1:");
        System.out.println("Make: " + myCar1.getMake());
        System.out.println("Model: " + myCar1.getModel());

        System.out.println("\nInitial details of myCar2:");
        System.out.println("Make: " + myCar2.getMake());
        System.out.println("Model: " + myCar2.getModel());

        // Set new values for myCar2 using setter methods
        myCar2.setMake("Ford");
        myCar2.setModel("Mustang");

        // Print updated make and model of myCar2
        System.out.println("\nUpdated details of myCar2:");
        System.out.println("Make: " + myCar2.getMake());
        System.out.println("Model: " + myCar2.getModel());
    }
}
