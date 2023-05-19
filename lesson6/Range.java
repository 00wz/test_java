package lesson6;

public class Range {
    Integer start=0;
    Integer end=Integer.MAX_VALUE;
    @Override
    public String toString() {
        return (start==0?" ":Integer.toString(start))+"-"+
            (end==Integer.MAX_VALUE?" ":Integer.toString(end));
    }
    }
