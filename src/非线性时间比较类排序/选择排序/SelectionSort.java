package 非线性时间比较类排序.选择排序;

import main.SortStrategy;

/**
 * 选择排序
 * <p>
 * 时间复杂度（平均）： O(n2)
 * <p>
 * 时间复杂度（最坏）： O(n2)
 * <p>
 * 时间复杂度（最好）： O(n2)
 * <p>
 * 空间复杂度： O(1)
 * <p>
 * 稳定性 ：不稳定
 * <p>
 * <p>
 * 基本思想：
 * <p>
 * <p>
 * 选择排序(Selection-sort)是一种简单直观的排序算法。它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 * <p>
 * 算法描述：
 * <p>
 * <p>
 * n个记录的直接选择排序可经过n-1趟直接选择排序得到有序结果。具体算法描述如下：
 * <p>
 * 初始状态：无序区为R[1..n]，有序区为空；
 * 第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1..i-1]和R(i..n）。
 * 该趟排序从当前无序区中-选出关键字最小的记录 R[k]，将它与无序区的第1个记录R交换，
 * 使R[1..i]和R[i+1..n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；
 * n-1趟结束，数组有序化了。
 */
public class SelectionSort extends SortStrategy {

    public SelectionSort() {
        sortName = "选择排序";
        averTimeComplexity = "O(n2)";
        bestTimeComplexity = "O(n2)";
        worstTimeComplexity = "O(n2)";
        spaceComplexity = "O(1)";
        stability = false;
    }

    @Override
    protected void sort(int[] array) {
        super.sort(array);
        int length = array.length;
        int tmp, minIndex;

        for (int i = 0; i < length - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }
}
