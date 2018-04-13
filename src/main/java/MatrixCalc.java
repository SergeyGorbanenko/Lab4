
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

    public int[][] Trans(int[][] a) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                res[i][j] = a[j][i];
        return res;
    }

    public int[][] Add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public int[][] Sub(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public int[][] MulNum(int[][] a, int v) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                res[i][j] = a[i][j] * v;
        return res;
    }
}
