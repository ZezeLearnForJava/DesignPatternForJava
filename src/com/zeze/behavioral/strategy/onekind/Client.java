package com.zeze.behavioral.strategy.onekind;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        int[] arr = new int[]{6, 1, 2, 3, 5, 4};
        //Sort sort = new Sort(new BubbleSort());
        // 这里可以选择不同的策略完成排序
        // sort.setSort(new InsertSort());
        // sort.setSort(new SelectionSort());

        // 工厂模式加策略模式
        Sort sort =new Sort(SortStrategy.BUBBLE_SORT);

        sort.sort(arr);
        // 输出 [1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(arr));
    }

}

