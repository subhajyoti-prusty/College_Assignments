package AD_2.Lab2;

import java.util.Iterator;
import java.util.LinkedList;

public class CycleInDirectedGraphWithDFS {
    static class Graph {
        int V;
        LinkedList<Integer> adjListArray[];

        Graph(int V) {
            this.V = V;
            adjListArray = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }

        void addEdge(int src, int dest) {
            adjListArray[src].add(dest);
        }

        boolean isCyclicUtil(int v, boolean[] visited, boolean[] recStack) {
            visited[v] = true;
            recStack[v] = true;

            Iterator<Integer> itr = adjListArray[v].listIterator();
            while (itr.hasNext()) {
                int node = itr.next();
                if (!visited[node]) {
                    if (isCyclicUtil(node, visited, recStack))
                        return true;
                } else if (recStack[node])
                    return true;
            }
            recStack[v] = false;
            return false;
        }

        boolean isCyclic() {
            boolean[] visited = new boolean[V];
            boolean[] recStack = new boolean[V];

            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    if (isCyclicUtil(i, visited, recStack))
                        return true;
                }
            }
            return false;
        }

        void DFS(int v) {
            boolean[] visited = new boolean[V];
            DFSUtil(v, visited);
        }

        void DFSUtil(int v, boolean visited[]) {
            visited[v] = true;
            System.out.print(v + " ");
            Iterator<Integer> i = adjListArray[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    DFSUtil(n, visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 2);
        g.addEdge(0, 1);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 1);

        System.out.println("Graph contains a cycle: " + g.isCyclic());
    }
}