package lesson2;

public class Task_2 {
public static void main(String[] args) {
    String[] book={"Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.",
    "Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни."};
    String[] food={"арахис - колбаса","клубника - вишня","сгущенка - молоко"};

    String[][] foodPair=new String[food.length][];
    for(int i=0;i<food.length;i++){
        foodPair[i]=food[i].split(" - ");
    }
    Replacement(book, foodPair);
    SetCapitalLetters(foodPair);
    Replacement(book, foodPair);
    for(int i=0;i<book.length;i++){
    System.out.println(book[i]);
    }
}
static public void SetCapitalLetters(String[][] words){
    for(int i=0;i<words.length;i++){
        for(int k=0;k<words[i].length;k++){
            String firstLetter= words[i][k].substring(0, 1).toUpperCase();
            words[i][k]=firstLetter +words[i][k].substring(1);
        }
    }
}
static public void  Replacement(String[] text,String[][] substitutions){
    for(int i=0;i<text.length;i++){
        for(int k=0;k<substitutions.length;k++){
            text[i]=text[i].replaceAll(substitutions[k][0], substitutions[k][1]);
        }
    }
}
}