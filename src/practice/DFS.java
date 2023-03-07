package practice;

public class DFS {

    public boolean[] marked;

    DFS(Graphy graph, int s) {
        marked = new boolean[graph.V()];
        dfs(graph, s);
    }

    private void dfs(Graphy graph, int s) {
        marked[s] = true;
        System.out.print(s + " ");
        for (int i : graph.adj(s)) {
            if (!marked[i]) dfs(graph, i);
        }
    }

    public static void main(String[] args) {
        Graphy g = new Graphy(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        DFS dfs=new DFS(g,0);

    }
}
