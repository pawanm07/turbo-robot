import java.util.*;

class BFSGraph {

    // Method to perform BFS traversal from a given source vertex
    static void bfs(List<List<Integer>> adjList, int source) {
        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        
        // Array to keep track of visited vertices
        boolean[] visited = new boolean[adjList.size()];
        
        // Mark the source vertex as visited and enqueue it
        visited[source] = true;
        queue.add(source);
        
        // Traverse the graph
        while (!queue.isEmpty()) {
            // Dequeue the vertex
            int current = queue.poll();
            System.out.print(current + " ");
            
            // Loop through all adjacent vertices of the dequeued vertex
            for (int neighbor : adjList.get(current)) {
                if (!visited[neighbor]) {
                    // Mark the neighbor as visited and enqueue it
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Method to add an edge to the graph
    static void addEdge(List<List<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);  // Add v to u's list
        adjList.get(v).add(u);  // Add u to v's list (since it's an undirected graph)
    }

    public static void main(String[] args) {
        // Number of vertices in the graph
        int V = 5;
        
        // Initialize the adjacency list for the graph
        List<List<Integer>> adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        
        // Add edges to the graph
        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 1, 4);
        addEdge(adjList, 2, 4);
        
        // Perform BFS traversal from vertex 0
        System.out.println("BFS traversal starting from vertex 0:");
        bfs(adjList, 0);
    }
}
