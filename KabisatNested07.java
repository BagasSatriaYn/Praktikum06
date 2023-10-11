import java.util.Scanner;

public class
KabisatNested07{
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        int tahun;
        System.out.println("Masukkan tahun");
        tahun=input07.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun Kabisat");
        } else
            System.out.println("Bukan Tahun Kabisat");      
    }
}