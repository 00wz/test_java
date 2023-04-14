package lesson1;

import lesson1.MathParser.MathParser;
import java.util.Scanner;
public class Task3 {

    static String massage=
    "введите выражение используя дробные числа "+
    "и знаки \"+\", \"-\", \"*\", \"/\", \"(\", \")\". "+
    "для разделения целой и дробной части используйте точку \".\" "+
    ""+
    "пример: -7+(-10*5)-100*0.1";
    public static void main(String[] args) {
        System.out.println(massage);
        Scanner sc=new Scanner(System.in);
        Double result=MathParser.CalculateExpression(sc.nextLine());
        System.out.println(result);
    }
}