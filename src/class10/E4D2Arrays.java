package class10;

public class E4D2Arrays {
    public static void main(String[] args) {
        {
            int[][] matrix = {
                    {10, 20, 30},
                    {20, 50, 65},
                    {102, 54, 60}
            };
            for (int i = 0; i < 3; i++) {
                int[] arr1 = matrix[i];
                for (int j = 0; j < arr1.length; j++) {
                    System.out.print(arr1[j] + " ");

                } System.out.println();
            }

        }
    }
}