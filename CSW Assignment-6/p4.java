public class p4 {

    public static void main(String[] args) {
        boolean booleanValue1 = true;
        Boolean booleanObject1 = new Boolean(booleanValue1);
        boolean booleanValue2 = false;
        Boolean booleanObject2 = Boolean.valueOf(booleanValue2);
        System.out.println("Original boolean value 1: " + booleanValue1);
        System.out.println("Converted Boolean object 1: " + booleanObject1);

        System.out.println("Original boolean value 2: " + booleanValue2);
        System.out.println("Converted Boolean object 2: " + booleanObject2);
    }
}
