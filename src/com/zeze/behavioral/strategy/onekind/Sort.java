package com.zeze.behavioral.strategy.onekind;

/**
 * 环境类对三种策略进行封装
 */
public class Sort implements ISort {

    private ISort sort;

//    Sort(ISort sort) {
//        this.sort = sort;
//    }

    Sort(SortStrategy sortStrategy) {
        setSort(sortStrategy);
    }

    @Override
    public void sort(int[] arr) {
        sort.sort(arr);
    }

    // 客户端通过此方法设置不同的策略
    /*public void setSort(ISort sort) {
        this.sort = sort;
    }*/

    // 工厂模式加策略模式
    public void setSort(SortStrategy sortStrategy) {
        switch (sortStrategy) {
            case BUBBLE_SORT:
                sort = new BubbleSort();
                break;
            case SELECTION_SORT:
                sort = new SelectionSort();
                break;
            case INSERT_SORT:
                sort = new InsertSort();
                break;
            default:
                throw new IllegalArgumentException("There's no such strategy yet.");
        }
    }
}