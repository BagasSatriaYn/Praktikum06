import java.util.Scanner;

public class Kabisat07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner (System.in);

        int tahun;

        System.out.println("Masukkan tahun: ");
        tahun=input07.nextInt();

        if ((tahun % 4) == 0 && (tahun %100) != 0){
            System.out.print("Tahun Kabisat");
        }else {
            System.out.print("Bukan Tahun Kabisat");
        }    
    }
    
}
