public class Matrix {

    public static void main(String[] args) {
        MatrixPrint mp = new MatrixPrint();
        mp.print(9,9, "@");
    }
}

class MatrixPrint {
    public void print(int height, int width, String character) {
        for (int y = 0; y < height; y ++ ) {
            for (int x = 0; x < width; x ++) {
                System.out.print(character + " ");
            }
            System.out.print("\n");
        }
    }
}