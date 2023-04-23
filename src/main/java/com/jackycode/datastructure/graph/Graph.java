package com.jackycode.datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    private List<String> vertexs;
    private int[][] edges;
    private int numberOfEdges;
    private boolean[] visited;

    public Graph(int n) {
        this.vertexs = new ArrayList<>();
        this.edges = new int[n][n];
        this.visited = new boolean[n];
    }

    public void insertVertex(String v) {
        vertexs.add(v);
    }

    public void insertEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numberOfEdges++;
    }

    public void showGraph() {
        System.out.printf("  ");
        for (String vertex : vertexs) {
            System.out.printf(vertex + " ");
        }
        System.out.println();
        for (int i = 0; i < edges.length; i++) {
            System.out.printf(vertexs.get(i) + " ");
            for (int j = 0; j < edges.length; j++) {
                System.out.printf(edges[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void dfs() {
        for(int i=0; i < vertexs.size(); i++) {
            if(visited[i]) {
                continue;
            }
            dfs(i);
        }
    }

    private void dfs(int i) {

        System.out.print(vertexs.get(i) + " -> ");
        visited[i] = true;

        int w = getFirstNeighbor(i);
        if(w > -1) {
            if(visited[w]) {
                w = getNextNeighbor(i, w);
            } else {
                dfs(w);
            }
        }
    }

    private int getFirstNeighbor(int i) {
        for(int j=i; j < vertexs.size(); j++) {
            if(edges[i][j] == 1) {
                return j;
            }
        }
        return -1;
    }

    private int getNextNeighbor(int i, int w) {
        for(int j=w+1; j < vertexs.size(); j++) {
            if(edges[i][j] == 1) {
                return j;
            }
        }
        return -1;
    }

    public void bfs() {
        for(int i=0; i < vertexs.size(); i++) {
            if(visited[i]) {
                continue;
            }
            bfs(i);
        }
    }

    private void bfs(int i) {
        System.out.print(vertexs.get(i) + " -> ");
        visited[i] = true;

        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(i);

        int u, w;
        while(queue.size() > 0) {
            System.out.println();
            u = queue.removeFirst();
            w = getFirstNeighbor(u);
            while(w > 0) {
                if(!visited[w]) {
                    System.out.print(vertexs.get(w) + " -> ");
                    visited[w] = true;
                    queue.addLast(w);
                }
                w = getNextNeighbor(u, w);
            }
        }
    }

}
