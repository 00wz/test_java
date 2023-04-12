import java.util.Random;
public class program {

    static int k=4;
    public static void main(String[] args) {
          Random random = new Random();
          Boolean isNotEmpty=false;
          for(int i=k;i>0;i--){
            int r=random.nextInt(100);
            if(r!=0){
                System.out.print((isNotEmpty?"+":"")+r+"*"+"x^"+i); 
                isNotEmpty=true;
            } 
          }
          int r=random.nextInt(100);
            if(r!=0){
                System.out.print((isNotEmpty?"+":"")+r); 
                isNotEmpty=true;
            } 
    }
}