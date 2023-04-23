package com.jackycode.datastructure;

import com.jackycode.datastructure.graph.Graph;
import org.junit.jupiter.api.Test;

public class GraphTest {

    @Test
    public void graphTest() {

        Graph g = new Graph(5);
        String[] vertexs = {"A", "B", "C", "D", "E"};
        for(String v : vertexs) {
            g.insertVertex(v);
        }
        g.insertEdge(0,1,1);
        g.insertEdge(0,2,1);
        g.insertEdge(1,2,1);
        g.insertEdge(1,3,1);
        g.insertEdge(1,4,1);

        g.showGraph();

    }

    @Test
    public void dfsTest() {
        Graph g = new Graph(8);
        String[] vertexs = {"1", "2", "3", "4", "5", "6", "7", "8"};
        for(String v : vertexs) {
            g.insertVertex(v);
        }
        g.insertEdge(0, 1, 1);
        g.insertEdge(0, 2, 1);
        g.insertEdge(1, 3, 1);
        g.insertEdge(1, 4, 1);
        g.insertEdge(3, 7, 1);
        g.insertEdge(4, 7, 1);
        g.insertEdge(2, 5, 1);
        g.insertEdge(2, 6, 1);
        g.insertEdge(5, 6, 1);

        g.showGraph();
        g.dfs();
    }

    @Test
    public void bfsTest() {
        Graph g = new Graph(8);
        String[] vertexs = {"1", "2", "3", "4", "5", "6", "7", "8"};
        for(String v : vertexs) {
            g.insertVertex(v);
        }
        g.insertEdge(0, 1, 1);
        g.insertEdge(0, 2, 1);
        g.insertEdge(1, 3, 1);
        g.insertEdge(1, 4, 1);
        g.insertEdge(3, 7, 1);
        g.insertEdge(4, 7, 1);
        g.insertEdge(2, 5, 1);
        g.insertEdge(2, 6, 1);
        g.insertEdge(5, 6, 1);

        g.showGraph();
        g.bfs();
    }
}
