package AD_2;

import java.util.LinkedList;

public class BFS_implimentation {
    public class node {
        public int data;
        node left;
        node right;
        private LinkedList<Integer> adj[];
        private Queue<Integer> que;

        public node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    void printLevelOrder(node root) {
        if (root == null)
            return;
    }

    void BFS(node root) {
        if (root == null) {
            System.out.println("Tree is Empty"); // Base case 1: If the tree is empty
            return;
        }
        String str = " ";
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            node n = q.peek();
            str += n.data + " ";
            if (n.left != null)
                q.add(n.left);
            if (n.right != null)
                q.add(n.right);
            q.remove();
        }
    }

    public static void main(String[] args) {
        BFS_implimentation tree = new BFS_implimentation();
        BFS_implimentation.node root = tree.new node(6);
        root.left = tree.new node(4);
        root.right = tree.new node(2);
        root.left.left = tree.new node(5);
        root.left.right = tree.new node(3);
        root.left.left.left = tree.new node(2);
        root.left.left.right = tree.new node(1);
        tree.printLevelOrder(root);
        System.out.println("\nBreadth First Search Traversal of binary tree is - ");
        tree.BFS(root);
        /*
         * 6
         * / \
         * 4 2
         * / \
         * 5 3
         * /\
         * 2 1
         */
    }
}
