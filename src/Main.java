public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void invertedName(char[] fullName){
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = (fullName.length-1); i >= 0; i--) {
            System.out.print(fullName[i]);
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        char[] name = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        invertedName(name);
    }
}