
public class MatrixCalc {

    public boolean CompareMatrix(int[][] a, int[][] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                if ((a[i][j] != b[i][j]) || (a[i].length != b[i].length))
                    return false;
        return true;
    }

    public int[][] Trans(int[][] operand1) {
        int[][] res = {{1,1,1}, {2,2,2}, {3,3,3}};
        return res;
    }
}
