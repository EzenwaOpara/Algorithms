package practice;

import java.util.LinkedList;

public class Graphy {

    private final int V;
    private int E;
    private LinkedList<Integer>[] adj;

    Graphy(int V) {
        this.V = V;
        E = 0;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }
}
