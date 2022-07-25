import java.util.*;

class Graph {
  String[] city = {
      "Oradea",
      "Zerind",
      "Arad",
      "Sibiu",
      "Fagaras",
      "Timisoara",
      "Rimnicu_Vilcea",
      "Lugoj",
      "Pitesti",
      "Mehadia",
      "Dobreta",
      "Craiova",
      "Bucharest",
      "Giurgiu",
      "Urziceni",
      "Hirsova",
      "Eforie",
      "Vaslui",
      "Lasi",
      "Neamt"
  };

  private int V;
  private LinkedList<Integer> adj[];

  Graph(int v) {
    V = v;
    adj = new LinkedList[v];
    for (int i = 0; i < v; ++i)
      adj[i] = new LinkedList();
  }

  void addEdge(int v, int w) {
    adj[v].add(w);
  }

  Node sourceNode;
  Node goalNode;
  int depth = 0;
  int limit = 2;

}

class Main {
  public static void main(String args[]) {
        Graph g = new Graph(45);

        g.addEdge(1, 2);
        g.addEdge(1, 4);

        g.addEdge(2, 1);
        g.addEdge(2, 3);

        g.addEdge(3, 2);
        g.addEdge(3, 4);
        g.addEdge(3, 6);

        g.addEdge(4, 1);
        g.addEdge(4, 3);
        g.addEdge(4, 5);
        g.addEdge(4, 7);

        g.addEdge(5, 4);
        g.addEdge(5, 13);

        g.addEdge(6, 3);
        g.addEdge(6, 8);

        g.addEdge(7, 4);
        g.addEdge(7, 9);
        g.addEdge(7, 12);

        g.addEdge(8, 6);
        g.addEdge(8, 10);
      
        g.addEdge(9, 7);
        g.addEdge(9, 12);
        g.addEdge(9, 13);
  
        g.addEdge(10, 8);
        g.addEdge(10, 11);
      
        g.addEdge(11, 10);
        g.addEdge(11, 12);

        g.addEdge(12, 7);
        g.addEdge(12, 9);
        g.addEdge(12, 11);

        g.addEdge(13, 5);
        g.addEdge(13, 9);
        g.addEdge(13, 14);
        g.addEdge(13, 15);

        g.addEdge(14, 13);

        g.addEdge(15, 13);
        g.addEdge(15, 16);
        g.addEdge(15, 16);

        g.addEdge(16, 15);
        g.addEdge(16, 17);

        g.addEdge(17, 16);

        g.addEdge(18, 15);
        g.addEdge(18, 19);

        g.addEdge(19, 18);
        g.addEdge(19, 20);

        g.addEdge(20, 19);

      Node nodeStart = new Node();
      nodeStart.setNextNode(8);

      Node nodeGoal = new Node();
      nodeGoal.setNextNode(6);
      
        System.out.println("Following is Breadth First");
        DepthLimitedSearch dls = new DepthLimitedSearch(nodeStart, nodeGoal);
    }
}