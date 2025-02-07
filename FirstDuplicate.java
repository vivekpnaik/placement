import java.util.HashSet;

public class FirstDuplicate {
    public static Integer findFirstDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {12, 9, 5, 8, 5, 9, 5, 10, 8, 6};
        Integer duplicate = findFirstDuplicate(array);
        System.out.println("First duplicate: " + (duplicate != null ? duplicate : "None"));
    }
}