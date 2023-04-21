import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> planets=new ArrayList<>(Arrays.asList("Сатурн",
         "Уран", "Юпитер","Нептун","Марс","Земля","Юпитер","Венера","Юпитер","Земля",
         "Марс","Уран"));
         Counting(planets);
    }
    static void Counting(ArrayList list){
        ArrayList assistantList=new ArrayList(Collections.nCopies(list.size(), null));
        Collections.copy(assistantList, list);
        while(assistantList.size()>0){
            Object obg=assistantList.get(0);
            assistantList.remove(0);
            int k=0;
            int count=1;
            while(k<assistantList.size()){
                if(assistantList.get(k).equals(obg)){
                    count++;
                    assistantList.remove(k);
                }
                else
                    k++;
            }
            System.out.println(obg+"-"+count);
        }
    }
}
