import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Witaj bedziemy robic wzytowke");

        System.out.println("Podaj imie:");
        Scanner scanner=new Scanner(System.in);
        String imie= scanner.nextLine();

        System.out.println("Podaj nazwisko:");
        Scanner scanner2=new Scanner(System.in);
        String nazwisko=scanner.nextLine();

        System.out.println("Podaj nr telefonu:");
        Scanner scanner3=new Scanner(System.in);
        String numer=scanner.nextLine();


        System.out.println("================================");
        System.out.println("|                              |");
        System.out.println("|   "+imie+"                   |");//
        System.out.println("|   "+nazwisko+"               |");// poprawić pozycjonowanie prawej krawedzi
        System.out.println("|   "+numer+"                  |");//
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("================================");






    }

}
