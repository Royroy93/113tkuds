public class GradeProcessor {
    public static void main(String[] args) {
        // 1. 成績陣列
        int[] grades = {78, 85, 92, 67, 88, 95, 73, 90};

        int sum = 0;
        int max = grades[0];
        int min = grades[0];
        int maxIndex = 0;
        int minIndex = 0;

        // 2. 計算總分、最高分、最低分
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];

            if (grades[i] > max) {
                max = grades[i];
                maxIndex = i;
            }

            if (grades[i] < min) {
                min = grades[i];
                minIndex = i;
            }
        }

        double average = (double) sum / grades.length;
        System.out.printf("總分: %d%n", sum);
        System.out.printf("平均分數: %.2f%n", average);

        // 3. 輸出最高分與最低分及其索引
        System.out.println("最高分: " + max + " (索引: " + maxIndex + ")");
        System.out.println("最低分: " + min + " (索引: " + minIndex + ")");

        // 4. 計算成績高於平均的人數
        int aboveAverageCount = 0;
        for (int grade : grades) {
            if (grade > average) {
                aboveAverageCount++;
            }
        }
        System.out.println("高於平均分數的人數: " + aboveAverageCount);

        // 5. 輸出所有成績
        for (int i = 0; i < grades.length; i++) {
            System.out.println("學生 " + i + ": " + grades[i]);
        }
    }
}
