package practice;

import algo.Queue;

public class BFS {

    private  boolean[] marked;
    private  int[] edgeTo;
    private int s;

    BFS(Graphy g, int s) {
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];
        this.s = s;
        bfs(g, s);
    }

    private void bfs(Graphy g, int s) {
        Queue<Integer> queue = new Queue<>();
        marked[s] = true;
        queue.enqueue(s);
        while (!queue.isEmpty()) {
            Integer v = queue.dequeue();
            for (int w : g.adj(v)) {
                if (!marked[w]) {
                    System.out.print(s + " ");
                    edgeTo[w] = v;
                    marked[w] = true;
                    queue.enqueue(w);
                }
            }
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

        BFS dfs=new BFS(g,2);

    }
}
