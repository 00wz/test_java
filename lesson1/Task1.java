
package lesson1;
import java.util.Scanner;
public class Task1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the N ");
        int N=sc.nextInt();
        int sum=1,factorial=1;
        for(int i=2;i<=N;i++)
        {
            sum+=i;
            factorial*=i;
        }
        System.out.print("sum="+sum+"  factorial= "+factorial);
    }
}