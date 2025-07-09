public class ArraySearcher {

    // 2. 搜尋目標數字並回傳索引位置
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // 沒找到
    }

    // 4. 計算目標數字出現的次數
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // 1. 建立陣列
        int[] data = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};

        // 5. 測試搜尋 67 和 100
        int search1 = 67;
        int search2 = 100;

        int index1 = findElement(data, search1);
        int count1 = countOccurrences(data, search1);

        int index2 = findElement(data, search2);
        int count2 = countOccurrences(data, search2);

        System.out.println("搜尋數字 " + search1 + "：索引 = " + index1 + "，出現次數 = " + count1);
        System.out.println("搜尋數字 " + search2 + "：索引 = " + index2 + "，出現次數 = " + count2);
    }
}
