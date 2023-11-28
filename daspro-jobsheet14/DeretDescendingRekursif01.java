import java.util.Scanner;

public class DeretDescendingRekursif01 {

    public static void tampilBilanganRekursif(int n) {
        if (n > 0) {
            System.out.println(n);
            tampilBilanganRekursif(n - 1);
        } else {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        tampilBilanganRekursif(n);
    }
}