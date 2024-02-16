package CSW;

enum Level {
    LOW, MEDIUM, HIGH
}

public class Class30 {
    public static void main(String[] args) {
        Level Var1 = Level.MEDIUM;
        System.out.println("Var1: " + Var1);
        Level Var2 = Level.LOW;
        System.out.println("Var2: " + Var2);
        Level Var3 = Level.HIGH;
        System.out.println("Var3: " + Var3);

        // Switch Statement
        Level Var4 = Level.MEDIUM;
        switch (Var4) {
            case LOW:
                System.out.println("Low");
                break;
            case MEDIUM:
                System.out.println("Medium");
                break;
            case HIGH:
                System.out.println("High");
                break;
        }

        for (Level Var5 : Level.values()) {
            System.out.println(Var5);
        }

        
    }
}
