import java.util.Scanner;

public class Segitiga07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int sudut1, sudut2, sudut3, totalSudut;
        
        System.out.print("Sudut 1");
        sudut1=sc.nextInt();

        System.out.println("Sudut 2");
        sudut2=sc.nextInt();

        System.out.println("Sudut 3");
        sudut3=sc.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == sudut2) || (sudut2 == sudut3)) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisis");
            } else {
                System.out.println("Segitiga tersebut adalah bukan segitiga sama sisi"); }
            } else
                System.out.println("Bukan segitiga");
        }
}
        
    
    

