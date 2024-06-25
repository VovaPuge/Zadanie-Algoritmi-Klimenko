public class Main {
    public static void main(String[] args) {
        int[][] pyramid = {
            {3},
            {7, 4},
            {2, 4, 6},
            {8, 5, 9, 3}
        };
        
        int result = maxSlidingSum(pyramid);
        System.out.println(result); // Выведет: 23
    }

    public static int maxSlidingSum(int[][] pyramid) {
        for (int i = pyramid.length - 2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                pyramid[i][j] += Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
            }
        }
        
        return pyramid[0][0];
    }
}
