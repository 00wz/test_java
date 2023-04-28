import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> map = new HashMap<>();

    void add(String name, String number){
        if(map.containsKey(name)){
            map.get(name).add(number);
        }
        else{
            var list=new ArrayList<String>();
            list.add(number);
            map.put(name, list);
        }

    }

    List<String> search(String str){
        if(map.containsKey(str)){
            return map.get(str);
        }
        return null;
    }
}