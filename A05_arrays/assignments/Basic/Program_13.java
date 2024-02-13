package A05_arrays.assignments.Basic;

public class Program_13 {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int lastIndex = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= lastIndex / 2; j++) {
                // Invert
                int invertedValue = image[i][j] ^ 1;
                image[i][j] = image[i][lastIndex - j] ^ 1;
                image[i][lastIndex - j] = invertedValue;
            }
        }
        return image;
    }
}

