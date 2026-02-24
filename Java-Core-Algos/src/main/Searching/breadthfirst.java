package main.Searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class breadthfirst {
  
  public static int shortestDistance(
        int start,
        int target,
        Map<Integer, List<Integer>> graph
    ) {
        // Implement BFS here
        return -1;
    }

  public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3));
        graph.put(2, Arrays.asList(3, 4));
        graph.put(3, Arrays.asList(5));
        graph.put(4, Arrays.asList());
        graph.put(5, Arrays.asList());

        int start = 0;
        int target = 5;

        int result = shortestDistance(start, target, graph);

        System.out.println(result);
    }
}
