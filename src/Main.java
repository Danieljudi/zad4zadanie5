import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Witaj bedziemy robic wzytowke");

        System.out.println("Podaj imie:");
        Scanner scanner=new Scanner(System.in);
        String imie= scanner.nextLine();

        System.out.println("Podaj nazwisko:");
        String nazwisko=scanner.nextLine();

        System.out.println("Podaj nr telefonu:");
        String numer=scanner.nextLine();


        System.out.println("================================");
        System.out.println("|                              |");
        System.out.println("   "+imie+"                   ");
        System.out.println("   "+nazwisko+"               ");
        System.out.println("   "+numer+"                  ");
        System.out.println("|                              |");
        System.out.println("================================");






    }

}
