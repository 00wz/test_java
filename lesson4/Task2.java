package lesson4;

public class Task2 {
    public static void main(String[] args) {
        MyQueue<String> queue=new MyQueue<String>();
        queue.enqueue("hello ");
        queue.enqueue("world ");
        queue.enqueue("!");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
        System.out.println(queue.first());
        System.out.println(queue.first());
    }
}
