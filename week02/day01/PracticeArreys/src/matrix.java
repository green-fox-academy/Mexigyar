public class matrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    public static void main (String [] args){

        int[][] matrix = new int[] []{
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
        };
        int rows = 4;
        int colums = 4;
        for (int i = 0; i <rows ; i++) {

            for (int j = 0; j <colums; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
}

