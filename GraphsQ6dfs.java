import java.util.ArrayList;

public class GraphsQ6dfs {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int curr, int parent){
        visited[curr] = true;
        for (int i : adj.get(curr)){
            if(!visited[i]) {
                if (dfs(adj, visited, i, curr))return true;
            }
            else if(i != parent) return true;
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!visited[i])
                if(dfs(adj, visited, i, i)) return true;
        }
        return false;
    }
}
