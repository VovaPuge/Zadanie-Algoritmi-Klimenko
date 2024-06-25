import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> getNumberRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        if (nums.length == 0) {
            return ranges;
        }

        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                ranges.add(getRangeString(start, end));
                start = nums[i];
                end = nums[i];
            }
        }

        ranges.add(getRangeString(start, end));

        return ranges;
    }

    private static String getRangeString(int start, int end) {
        if (start == end) {
            return Integer.toString(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) 
    {
        int[] nums = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20} ;
        List<String> ranges = getNumberRanges(nums);

        System.out.println("Диапазоны:");
        for (String range : ranges) {
            System.out.println(range);
        }
    }
}
