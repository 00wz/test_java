import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class Task1 {

    public static void main(String[] args) {
        var list=GetRandomList(20, 0, 10);
        System.out.println(list);
        RemoveEven(list);
        System.out.println(list);
    }
    static ArrayList<Integer> GetRandomList(int length,int min,int max){
        ArrayList<Integer> result=new ArrayList<Integer>();
        max++;
        Random random=new Random();
        for(int i=0;i<length;i++){
            result.add(random.nextInt(min, max));
        }
        return result;
    }
    static void RemoveEven(ArrayList<Integer> list){
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%2==0)
            iterator.remove();
        }
    }
}