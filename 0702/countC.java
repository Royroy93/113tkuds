public class countC {
    public static void main(String[] args) {
        int n = 5;
        int x = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                x = x + 1;
                count++;
            }
        }

        System.err.println("(b) x = x + 1 執行次數: " + count);
    }
}