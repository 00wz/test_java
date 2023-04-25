package lesson4;

public class MyQueue<T>  {
    
    private class Element<T>{
        public T value;
        public Element<T> next=null; 
        public Element (T value){
            this.value=value;
        }
    }

    private Element<T> first=null;
    private Element<T> last=null;
    void enqueue(T element) {
        Element<T> newElement=new Element(element);
        if(first!=null){

            last.next=newElement;
            last=newElement;
        }
        else{
            first=newElement;
            last=newElement;
        }
    }
    T dequeue(){
            T value=first();
            first=first.next;
            return value;
    }
    T first(){
        if(first!=null){
            return first.value;
        }
        else{
            throw new IndexOutOfBoundsException(); 
        }
    }
}