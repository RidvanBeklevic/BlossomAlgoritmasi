import java.util.*;

public class BlossomAlgoritmasi {

    public static void main(String[] args) {

        int[][] graph = {
                {0, 1, 1, 0, 0},
                {1, 0, 0, 1, 0},
                {1, 0, 0, 1, 1},
                {0, 1, 1, 0, 1},
                {0, 0, 1, 1, 0}
        };

        int[] matching = blossomAlgorithm(graph);

        System.out.println(Arrays.toString(matching));
    }

    public static int[] blossomAlgorithm(int[][] graph) {
        int n = graph.length;
        int[] matching = new int[n];
        Arrays.fill(matching, -1);

        for (int i = 0; i < n; i++) {
            if (matching[i] == -1) {
                boolean[] visited = new boolean[n];
                Arrays.fill(visited, false);

                findAugmentingPath(graph, i, matching, visited);

            }
        }
        return matching;
    }

    public static boolean findAugmentingPath(int[][] graph, int u, int[] matching, boolean[] visited) {
        int n = graph.length;

        for (int v = 0; v < n; v++) {
            if (graph[u][v] == 1 && !visited[v]) {
                visited[v] = true;

                if (matching[v] == -1 || findAugmentingPath(graph, matching[v], matching, visited)) {
                    matching[v] = u;
                    matching[u] = v;
                    return true;
                }
            }
        }
        return false;
    }
}
