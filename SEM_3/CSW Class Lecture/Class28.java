package CSW;

public class Class28 {
    public static void main(String[] args) {
        String x = "Hello Buddy";
        System.out.println(x);

        String y = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the variable is: " + y.length());

        System.out.println("Lowercase " + y.toLowerCase());
        System.out.println("Uppercase " + y.toUpperCase());

        String z = "Find a word in the sentence";
        int z1 = z.indexOf("word");
        System.out.println(z1);

        String first_name = "Subha";
        String last_name = "jyoti";
        String full_name = first_name.concat(last_name);
        System.out.println("Full Name :" + full_name);

        String a = "We are called \"Section - 44\"of CSE";

        String[] names = { "abc", "def", "ghi" };
        int[] number = { 20, 23, 45, 98, };

        String b = names[2];
        int c = number[3];
        System.out.println(b);
        System.out.println(c);

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
