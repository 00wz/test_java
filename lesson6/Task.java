package lesson6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Task {
    
    public static void main(String[] args) {
        HashSet<Laptop> laptops=new HashSet<Laptop>();
        laptops.add(new Laptop("Lenovo 770",17.3, 8, 256));
        laptops.add(new Laptop("Apple air",14, 8, 1024));
        laptops.add(new Laptop("Accer 111",16.0, 16, 2084));
        laptops.add(new Laptop("HP povillion",15, 4, 256));

        
        LinkedHashMap<String,Range> params= new LinkedHashMap<String,Range>();
        params.put("1", new Range());
        params.put("2", new Range());
        params.put("3", new Range());

        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.println("введите номер параметра для настройки фильтра"+
                "или любой другой символ для вывода результата");
            PrintFilter(params);
            String input=in.nextLine();
            if(params.containsKey(input)){
                SetRange(input,params);
            }
            else{
                break;
            }
        }

        PrintLaptops(laptops,params);
    }
        

    private static void PrintLaptops(HashSet<Laptop> laptops, HashMap<String, Range> params) {
        for(Laptop l:laptops){
            if(l.getDiagonal()>=params.get("1").start&&
                l.getDiagonal()<=params.get("1").end&&
                l.getMemory()>=params.get("2").start&&
                l.getMemory()<=params.get("2").end&&
                l.getRAM()>=params.get("3").start&&
                l.getRAM()<=params.get("3").end)
                System.out.println(l);
        }
    }


    private static void SetRange(String input, HashMap<String, Range> params) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("введите минимльное значение ");
        params.get(input).start=in.nextInt();
        System.out.println("введите максимальное значение ");
        params.get(input).end=in.nextInt();
        in.close();
    }

    private static void PrintFilter(HashMap<String, Range> params) {
        System.out.println("1.диагональ   "+params.get("1"));
        System.out.println("2.память      "+params.get("2"));
        System.out.println("3.оперативка  "+params.get("3"));
    }
    
}
