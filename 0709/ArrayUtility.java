import java.util.Arrays;

public class ArrayUtility {

    // 列印陣列內容，格式為 [元素1, 元素2, ...]
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // 原地反轉陣列
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // 交換元素
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    // 建立陣列的副本
    public static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    // 找出第二大的數值
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        // 1. 建立陣列
        int[] data = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        // 2. 測試各方法
        System.out.print("原始陣列：");
        printArray(data);

        int[] copiedArray = copyArray(data);
        System.out.print("複製的陣列：");
        printArray(copiedArray);

        reverseArray(data);
        System.out.print("反轉後的陣列：");
        printArray(data);

        int secondLargest = findSecondLargest(copiedArray);
        System.out.println("第二大的數值：" + secondLargest);
    }
}
