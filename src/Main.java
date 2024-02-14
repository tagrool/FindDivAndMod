import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        start();
    }
public static void start(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Reqem daxil edin:");
    int number = sc.nextInt();
    if(number>9){
        System.out.println(checkDiv(number));
        System.out.println(checkMod(number));
    }else{
        System.out.println("Zəhmət olmasa ikireqemli eded daxi edin!!");
        start();
    }
}
    public static int checkDiv(int a) {
        int b = a / 10;
        return b;
    }

    public static int checkMod(int b) {
        int a = (b - (checkDiv(b) * 10));
        return a;
    }

}