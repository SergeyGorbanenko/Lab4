import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MatrixCalc calc = new MatrixCalc();
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите действие:");
        System.out.println("1. Сложение матриц");
        System.out.println("2. Вычитание матриц");
        System.out.println("3. Умножение матрицы на число");
        System.out.println("4. Умножение матриц");
        System.out.println("5. Транспонирование матрицы");
        int num = in.nextInt();
        int[][] c = null;
        System.out.println("Матрица А. Размер:");
        System.out.print("n = ");
        int n1 = in.nextInt();
        System.out.print("m = ");
        int m1 = in.nextInt();
        System.out.println("Введите значения матрицы:");
        int[][] a = new int[n1][m1];
        for (int i = 0; i < n1; i++)
            for (int j = 0; j < m1; j++) {
                System.out.print("a[" + i + "," + j + "] = ");
                a[i][j] = in.nextInt();
            }
        if (num == 1 || num == 2 || num == 4) {
            System.out.println("Матрица B. Размер:");
            System.out.print("n = ");
            int n2 = in.nextInt();
            System.out.print("m = ");
            int m2 = in.nextInt();
            System.out.println("Введите значения матрицы:");
            int[][] b = new int[n2][m2];
            for (int i = 0; i < n2; i++)
                for (int j = 0; j < m2; j++) {
                    System.out.print("b[" + i + "," + j + "] = ");
                    b[i][j] = in.nextInt();
                }
            switch (num) {
                case 1:
                    c = calc.Add(a, b);
                    break;
                case 2:
                    c = calc.Sub(a, b);
                    break;
                case 4:
                    c = calc.Mul(a, b);
                    break;
            }
        }
        else if (num == 3) {
            System.out.print("Число, на которое умножить:");
            System.out.print("x = ");
            int x = in.nextInt();
            c = calc.MulNum(a, x);
        }
        else {
            c = calc.Trans(a);
        }
        System.out.println("Результат:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}