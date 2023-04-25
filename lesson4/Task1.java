package lesson4;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task1 {

    public static void main(String[] args) {
        LinkedList list=new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        System.out.println(flipLinkedList(list));
    }

    static LinkedList flipLinkedList(LinkedList list){
        LinkedList flipedList=new LinkedList<>();
        ListIterator iterator=list.listIterator(list.size());
        while(iterator.hasPrevious())
            flipedList.add(iterator.previous());
        return flipedList;
    }
}