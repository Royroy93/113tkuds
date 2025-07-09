public class ArrayStatistics {

    public static void main(String[] args) {
        // 1. 建立陣列
        int[] numbers = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        // 宣告統計用變數
        int sum = 0;
        double average;
        int max = numbers[0], maxIndex = 0;
        int min = numbers[0], minIndex = 0;
        int aboveAverageCount = 0;
        int evenCount = 0, oddCount = 0;

        // 2. 統計總和、最大最小、偶奇數
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            sum += value;

            if (value > max) {
                max = value;
                maxIndex = i;
            }
            if (value < min) {
                min = value;
                minIndex = i;
            }

            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        average = (double) sum / numbers.length;

        // 重新跑一次計算大於平均的數字
        for (int value : numbers) {
            if (value > average) {
                aboveAverageCount++;
            }
        }

        // 3. 表格輸出統計結果
        System.out.println("====== 陣列統計分析結果 ======");
        System.out.printf("%-15s: %d%n", "總和", sum);
        System.out.printf("%-15s: %.2f%n", "平均值", average);
        System.out.printf("%-15s: %d (索引 %d)%n", "最大值", max, maxIndex);
        System.out.printf("%-15s: %d (索引 %d)%n", "最小值", min, minIndex);
        System.out.printf("%-15s: %d%n", "大於平均的數量", aboveAverageCount);
        System.out.printf("%-15s: %d%n", "偶數個數", evenCount);
        System.out.printf("%-15s: %d%n", "奇數個數", oddCount);
    }
}
