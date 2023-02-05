package ex;

public class TransposeMatrix {

    public static void main(String[] args) {

//        Write a code fragment to print the transposition (rows and columns changed)
//        of a two-dimensional array with M rows and N columns.

        double[][] mat = new double[4][4];
        double[] m1 = {1, 2, 3, 4};
        double[] m2 = {5, 6, 7, 8};
        double[] m3 = {9, 10, 11, 12};
        double[] m4 = {13, 14, 15, 16};

        mat[0] = m1;
        mat[1] = m2;
        mat[2] = m3;
        mat[3] = m4;

        double[][] matT = Matrix.transpose(mat);
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                matT[i][j] = mat[j][i];
//            }
//        }

        System.out.println("Original Matrix");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(matT[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
