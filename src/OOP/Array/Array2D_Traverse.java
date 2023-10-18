package OOP.Array;

public class Array2D_Traverse {
    int[][] twoDArray = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    Array2D_Traverse() {
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.println("[" + i + "][" + j + "] " + twoDArray[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        new Array2D_Traverse();
    }
}
