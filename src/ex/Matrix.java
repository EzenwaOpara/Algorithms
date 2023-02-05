package ex;

public class Matrix {

//    static double dot(double[] x, double[] y) {
//    }
//
//    static double[][] mult(double[][] a, double[][] b) {
//    }

    static double[][] transpose(double[][] a) {

        double[][] t = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[i][j] = a[j][i];
            }
        }
        return t;
    }

//    static double[] mult(double[][] a, double[] x) {
//    }
//
//    static double[] mult(double[] y, double[][] a) {
//    }
}
