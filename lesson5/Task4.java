import java.util.List;
import java.util.Stack;

public class Task4 {

    public static void main(String[] args) {
        drawChessboard(getValidatePositions());
    }
    static void drawChessboard(List<Integer> list){
        int pos=0,i=0;
        while(i<8){
            while(pos<list.get(i)){
                if(getX(pos)==0)System.out.println();
                System.out.print(getColor(pos));
                pos++;
            }
            System.out.print("ЖЖ");
            pos++;
            i++;
        }
        while(pos<64){
            if(getX(pos)==0)System.out.println();
            System.out.print(getColor(pos));
            pos++;
        }
    }
    static String getColor(int position){
        if((getX(position)+getY(position))%2==0)return "▓▓";
        return "░░";
    }
    static List<Integer> getValidatePositions(){
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        Integer nextPosition=getNextValidPosition(0, stack);
        while(!stack.isEmpty()){
            if (nextPosition!=null){
                stack.push(nextPosition);
                if(stack.size()==8) return stack.subList(0, 8);
                nextPosition=getNextValidPosition(stack.peek(), stack);
            }
            else{
                nextPosition=getNextValidPosition(stack.pop(), stack);
            }
        }
        return null;
    }
    static Integer getNextValidPosition(int current,Stack<Integer> stack){
        for(int i=current+1;i<64;i++){
            if(checkValid(i,stack)){
                return i;
            }
        }
        return null;
    }
    static boolean checkValid(int position,Stack<Integer> stack){
        for(int i:stack){
            int x1=getX(i),y1=getY(i),x2=getX(position),y2=getY(position);
            if(x1==x2||y1==y2||x1+y1==x2+y2||x1-y1==x2-y2)
                return false;
        }
        return true;
    }
    static int getX(int position){
        return position%8;
    }
    static int getY(int position){
        return position/8;
    }
}