import java.util.Scanner;

public class tester {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        worker dyr1 = new director();

        System.out.print("Podaj imię dyrektora: ");
        dyr1.setName(scan.nextLine());
        System.out.print("Podaj nazwisko dyrektora: ");
        dyr1.setSurname(scan.nextLine());
        dyr1.printSection();
        dyr1.printPayment();

        worker man1 = new manager();

        System.out.print("\nPodaj imię menedżera: ");
        man1.setName(scan.nextLine());
        System.out.print("Podaj nazwisko menedżera: ");
        man1.setSurname(scan.nextLine());
        man1.printSection();
        man1.printPayment();

        worker phy1 = new physical();

        System.out.print("\nPodaj imię pracownika fizycznego: ");
        phy1.setName(scan.nextLine());
        System.out.print("Podaj nazwisko pracownika fizycznego: ");
        phy1.setSurname(scan.nextLine());
        phy1.printSection();
        phy1.printPayment();



    }
}
