package lesson6;

public class Laptop {
    private String _name;
    private double _diagonal;
    private int _RAM;
    private int _memory;
    Laptop(String name,double diagonal,int RAM,int memory){
        _name=name;
        _diagonal=diagonal;
        _RAM=RAM;
        _memory=memory;
    }
    public double getDiagonal(){
        return _diagonal;
    }
    public double getRAM(){
        return _RAM;
    }
    public double getMemory(){
        return _memory;
    }
    @Override
    public String toString() {
        return _name+"  оперативная="+_RAM+"гб    ЖД="+_memory+"гб  диагональ="+_diagonal;
    }
}
