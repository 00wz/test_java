import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        String str="Иван Иванов, Светлана Петрова,"+
        "Кристина Белова,Анна Мусина, Анна Крутова,"+
        "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,"+
        "Мария Федорова, Марина Светлова, Мария Савина,"+
        "Мария Рыкова, Марина Лугова, Анна Владимирова,"+
        "Иван Мечников, Петр Петин, Иван Ежов";
        String[] humans=str.split(", ", 0);

        Map<String,Integer> map = new HashMap<>();
        for(String human:humans){
            String name=human.split(" ")[0];
            if(map.containsKey(name)){
                map.put(name, map.get(name)+1);
            }
            else{
                map.put(name, 1);
            }
        }

        TreeMap<Integer,List<String>> treeMap=new TreeMap<>(Comparator.reverseOrder());
        for(Map.Entry<String, Integer> entry :map.entrySet()){
            //String name=human.split(" ")[0];
            if(treeMap.containsKey(entry.getValue())){
                treeMap.get(entry.getValue()).add(entry.getKey());
            }
            else{
                var list=new ArrayList<String>();
                list.add(entry.getKey());
                treeMap.put(entry.getValue(), list);
            }
        }
        
        System.out.println(treeMap);
    }
}
