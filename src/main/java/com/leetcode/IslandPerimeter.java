package com.leetcode;

/**
 * Created by chenwinfred on 17/3/19.
 */
public class IslandPerimeter {

    public static void main(String[] args) {
        IslandPerimeter ip = new IslandPerimeter();

        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};

        System.out.println(ip.islandPerimeter(grid));

    }


    /**
     * 1. loop over the matrix and count the number of islands;
     * 2. if the current dot is an island, count if it has any right neighbour or down neighbour;
     * 3. the result is islands * 4 - neighbours * 2
     *
     *
     * @param grid
     * @return
     */
    public int islandPerimeter(int[][] grid) {
        int islandNumber = 0, neighborNumber = 0;

        for(int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islandNumber ++;

                    if (j<grid[i].length-1 && grid[i][j+1] == 1) { // count the right neighbor
                        neighborNumber ++;
                    }
                    if (i<grid.length-1 && grid[i+1][j] == 1) { // count the down neighbour
                        neighborNumber ++;
                    }
                }

            }
        }
        return islandNumber*4 - neighborNumber*2;

    }
}
