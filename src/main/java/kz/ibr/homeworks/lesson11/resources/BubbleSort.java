package kz.ibr.homeworks.lesson11.resources;

public class BubbleSort {
    public static void sort(int [] sort_arr){
        int len = sort_arr.length;
        for (int i=0;i<len-1;++i){
            for(int j=0;j<len-i-1; ++j){
                if(sort_arr[j+1]<sort_arr[j]){
                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;
                }
            }
        }
    }
}
