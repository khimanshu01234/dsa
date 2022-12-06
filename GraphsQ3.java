public class GraphsQ3 {
    public void dfs(int[][] image, int sr, int sc, int color, int oldCol){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length
        || image[sr][sc] != oldCol || image[sr][sc] == color) return;
        image[sr][sc] = color;
        dfs(image, sr+1, sc, color, oldCol);
        dfs(image, sr-1, sc, color, oldCol);
        dfs(image, sr, sc-1, color, oldCol);
        dfs(image, sr, sc+1, color, oldCol);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }
}
