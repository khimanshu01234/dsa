import java.util.ArrayList;

public class GraphsQ5 {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] visited, int i){
        visited[i] = 2;
        for (int j : adj.get(i)){
            if(visited[j] == 0){
                if(dfs(adj, visited, j)) return true;
            }
            else if(visited[j] == 2) return true;
        }
        visited[i] = 1;
        return false;
    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visited = new int[V];
        for (int i = 0; i < V; i++){
            if(visited[i]==0 && dfs(adj, visited, i)) return true;
        }
        return false;
    }
}
