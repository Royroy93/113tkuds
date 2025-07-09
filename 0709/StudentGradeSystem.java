public class StudentGradeSystem {

    // 傳回分數對應的等級
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    // 顯示完整成績報告
    public static void printGradeReport(int[] scores) {
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0;
        int sum = 0;
        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;

        // 統計
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;

            if (score > max) {
                max = score;
                maxIndex = i;
            }
            if (score < min) {
                min = score;
                minIndex = i;
            }

            char grade = getGrade(score);
            switch (grade) {
                case 'A': aCount++; break;
                case 'B': bCount++; break;
                case 'C': cCount++; break;
                case 'D': dCount++; break;
            }
        }

        double average = (double) sum / scores.length;

        // 計算高於平均分的比例
        int aboveAverageCount = 0;
        for (int score : scores) {
            if (score > average) {
                aboveAverageCount++;
            }
        }
        double aboveAverageRatio = (double) aboveAverageCount / scores.length * 100;

        // 輸出報告
        System.out.println("===== 學生成績報告 =====");
        System.out.println("編號\t分數\t等級");
        System.out.println("-------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%c%n", i, scores[i], getGrade(scores[i]));
        }

        System.out.println("-------------------------");
        System.out.printf("平均分數：%.2f%n", average);
        System.out.println("最高分： " + max + " (編號 " + maxIndex + ")");
        System.out.println("最低分： " + min + " (編號 " + minIndex + ")");
        System.out.printf("A 等級人數：%d%n", aCount);
        System.out.printf("B 等級人數：%d%n", bCount);
        System.out.printf("C 等級人數：%d%n", cCount);
        System.out.printf("D 等級人數：%d%n", dCount);
        System.out.printf("高於平均分比例：%.2f%%%n", aboveAverageRatio);
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        // 1. 學生成績陣列
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};

        // 2. 顯示報告
        printGradeReport(scores);
    }
}
