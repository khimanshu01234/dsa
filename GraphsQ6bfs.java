import java.util.*;

public class GraphsQ6bfs {
    class Pair{
        int curr;
        int parent;
        public Pair(int curr, int parent) {
            this.curr = curr;
            this.parent = parent;
        }
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Pair> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                queue.add(new Pair(i, i));
                visited[i] = true;
                while (!queue.isEmpty()) {
                    Pair curr = queue.remove();
                    for(int val : adj.get(curr.curr)){
                        if(!visited[val]) {
                            queue.add(new Pair(val, curr.curr));
                            visited[val] = true;
                        } else if(val != curr.parent)
                            return true;
                    }
                }
            }
        }
        return false;
    }
}


