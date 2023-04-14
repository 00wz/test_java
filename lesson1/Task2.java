
package lesson1;

import java.util.List;
import java.util.ArrayList;

public class Task2
{
    static int MAX=1000;
    public static void main(String[] args) {
        PrintArr(GetSimpleNumbersList(MAX));
    }

    static List<Integer> GetSimpleNumbersList(int max){

        Integer[] serviceArr= new Integer[max+1];
        FillArray(serviceArr);
        int last=(int)Math.sqrt((double)max);
        for(int i=2;i<=last;i++)
        {
            if(serviceArr[i]!=null)
            {
                RemoveMultiplesPositions(serviceArr, i);
            }
        }
        serviceArr[0]=null;
        return GetNotNullElements(serviceArr);
    }
    static List<Integer> GetNotNullElements(Integer[] arr){
        List<Integer> result= new ArrayList<Integer>();
        for(Integer n : arr){
            if(n!=null)result.add(n);
        }
        return(result);
    }
    static void RemoveMultiplesPositions(Integer[] arr,int firstPos){
        int length=arr.length;
        for(int index=firstPos*firstPos;index<length;index+=firstPos)
            arr[index]=null;
    }
    static void FillArray(Integer[] arr){
        int length =arr.length;
        int i=0;
        while(i<length){
            arr[i]=i++;
        }
    }
    static void PrintArr(List<Integer> list){
        for(int n:list)
        System.out.print(n+" ");
    }
}