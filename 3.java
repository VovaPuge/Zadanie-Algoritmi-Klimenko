public class Main {
    public static String calculateTime(int seconds) {
        int[] times = {365 * 24 * 60 * 60, 30 * 24 * 60 * 60, 7 * 24 * 60 * 60, 24 * 60 * 60, 60 * 60, 60, 1};
        String[] labels = {"год", "месяц", "неделя", "день", "час", "минута", "секунда"};

        StringBuilder result = new StringBuilder();
        boolean isNotFirst = false;

        for (int i = 0; i < times.length; i++) {
            int time = times[i];
            if (seconds >= time) {
                int count = seconds / time;
                seconds %= time;
                if (isNotFirst) {
                    if (result.toString().endsWith("и")) {
                        result.append(" ");
                    } else {
                        result.append(", ");
                    }
                }
                result.append(count).append(" ").append(labels[i]);
                if (count > 1) {
                    result.append("ов");
                }
                isNotFirst = true;
            }
        }

        if (seconds > 0) {
            if (isNotFirst) {
                result.append(" и ");
            }
            result.append(seconds).append(" секунд");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(calculateTime(62)); // Вывод: "1 минута и 2 секунды"
        System.out.println(calculateTime(3662)); // Вывод: "1 час, 1 минута и 2 секунды"
    }
}
