import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=Task1.GetRandomList(20, 0, 10);
        System.out.println(list);
        System.out.println("максимальное="+Collections.max(list));
        System.out.println("минимальное="+Collections.min(list));
        System.out.println("среднее="+GetAverage(list));
    }
    static double GetAverage(ArrayList<Integer> list){
        double sum=0;
        for(int i:list)
            sum+=i;
        return sum/list.size();
    }
}
