// 1971. if path exists

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;

        // Build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        HashSet<Integer> visited = new HashSet<>();
        return dfs(graph, source, destination, visited);
    }

    private boolean dfs(List<List<Integer>> graph, int current, int destination, HashSet<Integer> visited) {
        if (current == destination) return true;
        visited.add(current);

        for (int neighbor : graph.get(current)) {
            if (!visited.contains(neighbor)) {
                if (dfs(graph, neighbor, destination, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
