package main.Searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class depthfirst {
  
  public static void dfs(int node, Map<Integer, List<Integer>> graph, boolean[] visited){
    Stack<Integer> traversed = new Stack<>();
    Stack<Integer> nx = new Stack<>();
    nx.push(0);
    while (!nx.isEmpty()) {
      int pnt = nx.pop();
      traversed.add(pnt);
      // Check if the current node has childern 
      if (pnt == 5) {
        break;
      }
      System.out.println("----Pnt-----");
      System.out.println(pnt);

      // Cheak we have not traversed the node
      

      // Look at the currnet nodes childern
      List<Integer> childern = graph.get(pnt);
      System.out.println("----Children-----");
      System.out.println(childern.toString());
      if(!childern.isEmpty() ){
        if (childern.size()>1) {
          nx.push(childern.get(1));
        }
        System.out.println("----Next-----");
        System.out.println(childern.get(0));
        nx.push(childern.get(0));
      }
      System.out.println("----Nx steps-----");
      System.out.println(nx.toString());
    }
    System.out.println("----Output-----");
    System.out.println(traversed.toString());
  }

  public static void dfsBestAnswer(int node, Map<Integer, List<Integer>> graph, boolean[] visited){
    if(visited[node]){
      return;
    }

    visited[node] = true;
    for (int neighbour : graph.get(node)) {
      dfsBestAnswer(neighbour,graph,visited);
    }

  }

  public static void main(String[] args) {
        // Graph represented as adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3, 4));
        graph.put(2, Arrays.asList(5));
        graph.put(3, Arrays.asList());
        graph.put(4, Arrays.asList(6));
        graph.put(5, Arrays.asList());
        graph.put(6, Arrays.asList());

        boolean[] visited = new boolean[7];

        int startNode = 0;

        dfs(startNode, graph, visited);
    }
}
