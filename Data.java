public class Data {
    public static final int MAX = (int) (Math.random() * Integer.MAX_VALUE);
    private int[][] grid;

    public Data(int r, int c) {
        grid = new int[r][c];
    }

    public void repopulate() {
        for (int r = 0; r<grid.length; r++) {
            for (int c = 0; c<grid[r].length; c++) {
                do grid[r][c] = (int) ((Math.random() * MAX)+1)/10*10;
                while (grid[r][c]%100 == 0);
            }
        }
    }

    public int countIncreasingCols() {
        int count = 0;
        for (int c = 0; c<grid[0].length;c++) {
            boolean isIncreasing = true;
            for (int r = 0; r<grid.length-1; r++) {
                if (grid[r][c]> grid[r+1][c]) isIncreasing=false;
            }
            if (isIncreasing) count++;
        }
        return count;
    }

    public String toString() {
        String s = "";
        for (int[] arr : grid) {
            for (int a : arr) {
                s+= a + ", ";
            }
            s+= "\n";
        }
        return s;
    }
}