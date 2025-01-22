package A09__patterns.src;

public class Main {
    public static void main(String[] args) {
        System.out.println("pattern 1 =>");
        pattern1(5);

        System.out.println("\npattern 2 =>");
        pattern2(5);

        System.out.println("\npattern 3 =>");
        pattern3(5);

        System.out.println("\npattern 4 =>");
        pattern4(5);

        System.out.println("\npattern 5 =>");
        pattern5(5);

        System.out.println("\npattern 5 IMPROVED =>");
        pattern5__IMRPROVED(5);

        System.out.println("\npattern 28 =>");
        pattern28(5);

        System.out.println("\npattern 30 =>");
        pattern30(5);

        System.out.println("\npattern 17 =>");
        pattern17(5);
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println(" ");
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        for (int i = n; i >= 1; i--) {
            for (int k = i; k >= 1; k--) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }

    static void pattern5__IMRPROVED(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int numberOfSpaces = row > n ? row - n : n - row;

            for (int s = 0; s < numberOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - row;

            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int noOfSpaces = row > n ? row - n : n - row;

            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print("  ");
            }

            int c = row > n ? 2 * n - row : row;

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
