
public class Task1 {

    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Иванов", "8937");
        phoneBook.add("Иванов", "8936");
        phoneBook.add("Сидоров", "8935");
        phoneBook.add("Сидоров", "89354");
        System.out.println(phoneBook.search("Сидоров")); 
    }
}