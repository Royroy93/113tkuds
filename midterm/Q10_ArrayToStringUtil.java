import java.util.*;

public class Q10_ArrayToStringUtil {
    public static String arrayToString(int[] arr) {
        if (arr == null) return "null";
        if (arr.length == 0) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] v = new int[n];

        String[] tokens = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println(arrayToString(v));
    }
}