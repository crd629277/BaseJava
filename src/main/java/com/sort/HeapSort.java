package com.sort;

import com.util.PrintOut;

/**
 * Created by Chen on 2015/4/2.
 */
public class HeapSort implements Sort {

    @Override
    public void sort(int[] data) {
        // 大顶堆的创建
        for (int i=data.length/2-1; i>=0; i--) {
            headAdjust(data, i, data.length);
        }

        //排序
        for (int i=data.length-1; i>0; i--) {
            int temp = data[i];                                   // 将堆顶元素data[0]和当前最后一个元素data[i]进行交换
            data[i] = data[0];
            data[0] = temp;

            headAdjust(data, 0, i);                                //调整剩下的堆元素
        }

        PrintOut.print(data);
    }

    // 堆调整
    private void headAdjust(int[] data, int i, int length) {
        for (int j=i*2+1; j<length; j=2*j+1) {                      //i为父节点的下标，2*i+1为左子节点的下标
            if (j+1<length && data[j]<data[j+1]) {                  //当右节点存在时，比较两个子节点的大小
                j++;                                                //j指向大的节点位置
            }
            if (data[i] >= data[j]) break;                         //父节点比子节点都大时不需要调整
            if (data[j] > data[i]) {                                //将大的子节点与父节点交换位置
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i = j;                                              //新的父节点位置，继续往下作调整
            }
        }
    }

}
