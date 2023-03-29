package Task;

public class Task2 {
    public static int СountingСonsecutive1(int[] array) {
        int count = 0;
        int max_count = 0;
        for (int item : array) {
            if(item == 1) {
                count++;
            } else {
                if (max_count < count) {
                    max_count = count;
                }
                count = 0;
            }
        }
        if (count > max_count) {
            max_count = count;
        }
        return max_count;
    }
}
