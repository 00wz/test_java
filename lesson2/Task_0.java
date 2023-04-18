package lesson2;

public class Task_0 {

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public static void main(String[] args) {
    String jewels = "aB";
    String stones = "aaaAbbbB";

    System.out.print(findJewelsInStones(jewels,stones));
}

static public String findJewelsInStones(String jewels, String stones) {
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<jewels.length();i++){
        int count=0;
        for(int k=0;k<stones.length();k++){
            if(jewels.charAt(i)==stones.charAt(k))
            count++;
        }
        sb.append(jewels.charAt(i));
        sb.append(count);
    }
    return sb.toString();
    }
}
