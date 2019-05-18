import java.util.Scanner;

public class ArrayAndScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arrayNub = new int[5];
        System.out.println("Podaj pięć liczb całkowitych - pierwsza to: ");
        arrayNub[0] = scan.nextInt();
        System.out.println("druga to: ");
        arrayNub[1] = scan.nextInt();
        System.out.println("trzecia to: ");
        arrayNub[2] = scan.nextInt();
        System.out.println("czwarta to: ");
        arrayNub[3] = scan.nextInt();
        System.out.println("piąta to: ");
        arrayNub[4] = scan.nextInt();


        int sum = arrayNub [0] + arrayNub[2] + arrayNub[4];

        System.out.println(sum);

    }

    /*
    Napisz program, w którym stworzysz tablice 5 liczb całkowitych,
    które wczytasz od użytkownika z klawiatury.
    Wyświetl sumę powstałą z dodania pierwszej, trzeciej i piątej liczby.

     */
}
