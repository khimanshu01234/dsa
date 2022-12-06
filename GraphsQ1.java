import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphsQ1 {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()){
            int curr = queue.remove();
            for(int i : adj.get(curr))
                if(!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            res.add(curr);
        }
        return res;
    }
}
