package university;


public class PyramidDemo {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print("   ");
            }

            // Print increasing numbers
            for (int j = 0; j < i; j++) {
                System.out.print((i + j) + " ");
            }

            // Print decreasing numbers
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((i + j) + " ");
            }

            System.out.println();
        }
    }
}