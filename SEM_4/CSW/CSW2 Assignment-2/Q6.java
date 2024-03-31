//Write a program to create an Animal class with member variables name, color, types (pet/wild). Override the hashCode method to print the unique id for the object. Create the objects of the Animal class and print its hashcode.

class Animal {
    private String name;
    private String color;
    private String type; // pet or wild

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public String toString() {
        return "Animal [name=" + name + ", color=" + color + ", type=" + type + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Leo", "Red", "Wild");
        Animal animal2 = new Animal("Milo", "Black", "Pet");

        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
    }
}
