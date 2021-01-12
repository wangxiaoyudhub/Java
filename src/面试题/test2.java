/**
 * @作者 ：wangxiaoyu
 * @日期 ：Created in 2021/1/12 9:59
 * @功能 ：
 */

package 面试题;
//数组的查找


import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {


        int[] is = {10,55,36,89,35,61,1};

        int num = 55;

        //排序
        Arrays.sort(is);

        int start = 0;
        int end = is.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(num > is[mid]){
                start = mid+1;
            }else if(num < is[mid]){
                end = mid-1;
            }else{
                System.out.println("找到了");
                break;
            }
        }
    }
}

