import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(54,4,32,5,44,5,-9,
        0,877,66,-9,-8,-7,0));
        ArrayList sortList=MergeSorting((ArrayList)list);
        System.out.println(sortList);
    }
    static ArrayList<Comparable> MergeSorting(ArrayList<Comparable> list){
        int length=list.size();
        if(length==1)return list;
        ArrayList<Comparable> result=new ArrayList<>();
        int i=0,k=0;
        ArrayList<Comparable> list1=MergeSorting(new ArrayList<Comparable>(list.subList(0, length/2))),
                list2=MergeSorting(new ArrayList<Comparable>(list.subList(length/2,length)));
        while(i<list1.size()&&k<list2.size()){
            if(list1.get(i).compareTo(list2.get(k))>0){
                result.add(list2.get(k));
                k++;
            }
            else{
                result.add(list1.get(i));
                i++;  
            }
        }
        result.addAll(list1.subList(i,list1.size()));
        result.addAll(list2.subList(k,list2.size()));
        return result;
    }
}
