/**
 * @���� ��wangxiaoyu
 * @���� ��Created in 2021/1/12 9:59
 * @���� ��
 */

package ������;
//����Ĳ���


import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {


        int[] is = {10,55,36,89,35,61,1};

        int num = 55;

        //����
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
                System.out.println("�ҵ���");
                break;
            }
        }
    }
}

