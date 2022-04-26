package com.example.mywallet;
import java.util.*;
public class main {
    public static void main(String[] args) {
//       //No 1
//       public final int[] input = {1,2,3,4,5,6,7,8,9};
//                for(int i=0;i<input.length();i++ ){
//                if (input[i]%2!=0){
//                    System.out.println(input[i]);
//                }
//        }
//    }
        // no 2
        int[] d1 = {3,5,7};
        int[]d2= {8,2,1};
        int[]d3={6,9,2};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0;i < 3;i++){
            for (int j = i+1;j<3;j++){
                for (int x = j+1;x<3;x++){
                    System.out.println("i = "+d1[i]+" "+"d2 = "+d2[j]+"d3 = "+d3[x]);
                    System.out.println("i = "+d1[x]+" "+"d2 = "+d2[j]+"d3 = "+d3[i]);
                    sum1 = d1[i]+d2[j]+d3[x] ;
                    sum2 = d1[x]+d2[j]+d3[i] ;
                }
            }
        }
        if (sum1<sum2){
            System.out.println(sum2-sum1);
        } else {
            System.out.println(sum1-sum2);
        }
        //No 3
//        int[]d1={2,6,9};
//        int[]d2={1,5,8};
//        int[]d3={7,2,7};
//        int count = 0;
//        int[] result1 = {};
//        int[] result2;
//        int[] result3;
//        for (int j = 2; j>=0;j--){
//            if (count<3){
//                System.out.println("i = "+d1[j]+" "+"j = "+d2[j]+" x = "+d3[j]);
//                result1[count] = d1[j];
//                count++;
//            }
//            else {
//                count = 0;
//            }
//        }
//        System.out.println(result1[count]);
    }
}
