public class Main {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {6, 10}, {11, 15}};
        int result = countNumbersBetweenIntervals(intervals);
        System.out.println(result); // Выведет: 9
    }

    public static int countNumbersBetweenIntervals(int[][] intervals) {
        int count = 0;
        for (int[] interval : intervals) {
            count += interval[1] - interval[0] - 1;
        }
        return count + intervals.length; // Добавляем количество интервалов, чтобы учесть все числа между интервалами
    }
}
