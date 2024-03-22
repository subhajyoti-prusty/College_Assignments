//Implementation of Binary Search Tree to store a string as a key and count the occurance of the string in the text.

public class BinarySearchTree {
    class Node
{
    String key;
    int count;
    Node left, right;

    public Node(String key)
    {
        this.key = key;
        this.count = 1;
        this.left = this.right = null;
    }
}
    Node root = null;

    public void insert(String key)
    {
        root = satareinsert(root, key);
    }

    private Node satareinsert(Node node, String key)
    {
        if (node == null)
            return new Node(key);

        int comparison = key.compareTo(node.key);

        if (comparison < 0)
            node.left = satareinsert(node.left, key);
        else if (comparison > 0)
            node.right = satareinsert(node.right, key);
        else
            node.count++;

        return node;
    }

    public int getCount(String key)
    {
        Node node = search(root, key);
        return (node != null) ? node.count : 0;
    }

    private Node search(Node node, String key)
    {
        if (node == null || node.key.equals(key))
            return node;

        if (key.compareTo(node.key) < 0)
            return search(node.left, key);
        else
            return search(node.right, key);
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        String text = "the quick brown fox jumps over the lazy dog";
        String[] words = text.split("\\s+");
        for (String word : words) {
            bst.insert(word);
        }

        System.out.println("Count of 'the' is: " + bst.getCount("the"));
        System.out.println("Count of 'quick' is: " + bst.getCount("quick"));
        System.out.println("Count of 'brown' is: " + bst.getCount("brown"));
        System.out.println("Count of 'fox' is: " + bst.getCount("fox"));
        System.out.println("Count of 'jumps' is: " + bst.getCount("jumps"));
        System.out.println("Count of 'over' is: " + bst.getCount("over"));
        System.out.println("Count of 'lazy' is: " + bst.getCount("lazy"));
        System.out.println("Count of 'dog' is: " + bst.getCount("dog"));
    }
}

