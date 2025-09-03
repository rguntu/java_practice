package set1;

import java.util.LinkedList;
import java.util.Queue;

public class CountNoOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid));
    }

    private static int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    //dfs(grid, i, j);
                    bfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void bfs(char[][] grid, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int [] {i, j});
        grid[i][j] = '0';
        int [][] it = {{0,1},{0,-1},{1,0},{-1,0}};
        while (!queue.isEmpty()) {
            int [] c = queue.poll();


           for  (int k = 0; k < 4; k++) {
               int x = c[0]+it[k][0];
               int y = c[1]+it[k][1];
               if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && grid[x][y] == '1') {
                   queue.offer(new int [] {x, y});
                   grid[x][y] = '0';
               }
           }
        }
    }

    private static void dfs(char[][] grid, int i, int j) {

        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}
