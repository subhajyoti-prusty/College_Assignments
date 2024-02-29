import java.util.Arrays;

class Edge implements Comparable<Edge> {
    int src, dest, weight;
    
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}
public class Krushkal_Algo_Implementation {
    int V, E;
    Edge edge[];

    Krushkal_Algo_Implementation(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }

    int find(int parent[], int i) {
        if (parent[i] == i)
            return i;
        return parent[i] = find(parent, parent[i]);
    }

    void Union(int parent[], int rank[], int x, int y) {
        int xroot = find(parent, x);
        int yroot = find(parent, y);

        if (rank[xroot] < rank[yroot])
            parent[xroot] = yroot;
        else if (rank[xroot] > rank[yroot])
            parent[yroot] = xroot;

        else {
            parent[yroot] = xroot;
            rank[xroot]++;
        }
    }

    void KruskalMST() {
        Edge result[] = new Edge[V]; 
        int e = 0; 
        int i = 0; 
        for (i = 0; i < V; ++i)
            result[i] = new Edge();

        Arrays.sort(edge);

        int parent[] = new int[V];
        int rank[] = new int[V];

        for (int v = 0; v < V; ++v) {
            parent[v] = v;
            rank[v] = 0;
        }

        i = 0;

        while (e < V - 1) {

            Edge next_edge = new Edge();
            next_edge = edge[i++];

            int x = find(parent, next_edge.src);
            int y = find(parent, next_edge.dest);

            if (x != y) {
                result[e++] = next_edge;
                Union(parent, rank, x, y);
            }
        }

        System.out.println("Following are the edges in the constructed MST");
        for (i = 0; i < e; ++i)
            System.out.println(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);
    }

    public static void main(String[] args) {
        int V = 4; 
        int E = 5; 
        Krushkal_Algo_Implementation graph = new Krushkal_Algo_Implementation(V, E);

        // add edge 0-1
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 10;

        // add edge 0-2
        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 6;

        // add edge 0-3
        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 5;

        // add edge 1-3
        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 15;

        // add edge 2-3
        graph.edge[4].src = 2;
        graph.edge[4].dest = 3;
        graph.edge[4].weight = 4;

        graph.KruskalMST();
        
    }
}
