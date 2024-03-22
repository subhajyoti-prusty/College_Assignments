public class Check_Two_Strings_Anyagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        int[] count = new int[256];
        boolean isAnagram = true;

        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;
            }

            for (int i = 0; i < 256; i++) {
                if (count[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }
}
