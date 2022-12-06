import java.util.ArrayList;

public class GraphsQ2 {
    public void  dfs(boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res, int curr){
        res.add(curr);
        visited[curr] = true;
        for(int i : adj.get(curr))
            if(!visited[i]) dfs(visited, adj, res, i);
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
        dfs(visited, adj, res, 0);
        return res;
    }
}
