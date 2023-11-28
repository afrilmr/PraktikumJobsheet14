import java.util.Scanner;

public class Percobaan201_1 {

    static int hitungPangkat(int x, int y){
        if (y == 0){
            return (1);
        } else {
            return (x * hitungPangkat (x, y - 1));
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;   

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat =sc.nextInt();

        // Mencetak deret perhitungan pangkatnya
        System.out.println("Hasil Perhitungan : ");
        for (int i=1; i<= pangkat; i++){
            if (i==pangkat){
                System.out.print(bilangan);
            } else {
                System.out.print(bilangan + "x");
            }
        }
        System.out.println(" = " + hitungPangkat(bilangan, pangkat));
    }
}