import java.util.Comparator;  
import java.util.HashMap;  
import java.util.Map;  
import java.util.PriorityQueue;  

class HuffmanNode {  
    int data;  
    char c;  
    HuffmanNode left;  
    HuffmanNode right;  
}

class MyComparator implements Comparator<HuffmanNode> {  
    public int compare(HuffmanNode x, HuffmanNode y) {  
        return x.data - y.data;  
    }  
}

public class Random_Question {
    public static void main(String[] args) {
        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charFreq = { 1/2, 1/4, 1/8, 1/16, 1/32, 1/32 };
        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(n, new MyComparator());
        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();
            hn.c = charArray[i];
            hn.data = charFreq[i];
            hn.left = null;
            hn.right = null;
            q.add(hn);
        }
        HuffmanNode root = null;
        while (q.size() > 1) {
            HuffmanNode x = q.poll();
            HuffmanNode y = q.poll();
            HuffmanNode f = new HuffmanNode();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;
            q.add(f);
        }
        Map<Character, String> huffmanCode = new HashMap<>();
        encode(root, "", huffmanCode);
        System.out.println("Huffman Codes are: " + huffmanCode);

        System.out.println("The original string is: ");
        String str = "abcdef";
        System.out.println(str);
        System.out.println("The encoded string is: ");
        String encodedString = "";
        for (int i = 0; i < str.length(); i++) {
            encodedString += huffmanCode.get(str.charAt(i));
            System.out.println(huffmanCode.get(str.charAt(i)));
        }
        System.out.println(encodedString);
        System.out.println("The decoded string is: ");
        int index = -1;
        while (index < encodedString.length() - 2) {
            index = decode(root, index, encodedString);
        }
        
        //Calculate External Path Length
        int depth = 0;
        System.out.println("External Path Length: " + externalPathLength(root, depth));

        //Calculate Average Nubmer of bits per character
        System.out.println("Average Nubmer of bits per character: " + averageNumberBitsPerCharacter(root, depth));
    }

    public static void encode(HuffmanNode root, String s, Map<Character, String> huffmanCode) {
        if (root.left == null && root.right == null) {
            huffmanCode.put(root.c, s);
            return;
        }
        encode(root.left, s + "0", huffmanCode);
        encode(root.right, s + "1", huffmanCode);
    }

    public static int decode(HuffmanNode root, int index, String s) {
        if (root.left == null && root.right == null) {
            System.out.print(root.c);
            return index;
        }
        index++;
        if (s.charAt(index) == '0') {
            index = decode(root.left, index, s);
        } else {
            index = decode(root.right, index, s);
        }
        return index;
    }

    //Calculate External Path Length
    public static int externalPathLength(HuffmanNode root, int depth) {
        if (root == null) {
            return 0;
        }
        return depth + externalPathLength(root.left, depth + 1) + externalPathLength(root.right, depth + 1);
    }

    //Calculate Average Nubmer of bits per character
    public static double averageNumberBitsPerCharacter(HuffmanNode root, int depth) {
        int externalPathLength = externalPathLength(root, depth);
        int totalWeight = 0;
        int totalDepth = 0;
        return (double) externalPathLength / totalWeight;
    }    
}
