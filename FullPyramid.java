public class FullPyramid {

    static void spaces(int i){
        for(int space = 1; space <= 6-i; ++space)
            System.out.print("  ");
    }

    static void printPattern(int i){
        int k=0;
        while (k != 2 * i - 1) {
            System.out.print("* ");
            ++k;
        }
    }
    public static void main(String[] args) {
        int  i;
        // Full Pyramid
        for (i = 1; i <= 6; ++i) {
            spaces(i);
            printPattern(i);
            System.out.println();
        }
        System.out.println();
        // Inverted full Pyramid
        for(i = 6; i >= 1; --i) {
            spaces(i);
            printPattern(i);
            System.out.println();
        }
    }
}


