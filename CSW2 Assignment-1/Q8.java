interface Vehicle {
    void accelerate();

    void brake();
}

class car implements Vehicle {
    public car(Object o, Object o1) {
    }

    public car() {

    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }

    // Method overloading
    public void accelerate(int speed) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h for " + duration + " seconds.");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking.");
    }

    // Method overloading
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h for " + duration + " seconds.");
    }
}

public abstract class Vehicle1 {
    public static void main(String[] args) {
        car car = new car();
        Bicycle bicycle = new Bicycle();

        // Test overridden methods
        car.accelerate();
        car.brake();

        bicycle.accelerate();
        bicycle.brake();

        // Test method overloading
        car.accelerate(60);
        car.accelerate(80, 10);

        bicycle.accelerate(20);
        bicycle.accelerate(30, 5);
    }

    public abstract void accelerate();

    public abstract void brake();
}
