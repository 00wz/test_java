package lesson4;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Double> list=new LinkedList<Double>();
        list.add(3.0);
        list.add(2.0);
        list.add(1.0);

        System.out.println(sum(list));
    }
    static double sum(LinkedList<Double> list){
        ListIterator<Double> iterator=list.listIterator();
        double sum=0;
        while(iterator.hasNext())
            sum+=iterator.next();
        return sum;
    }
}
