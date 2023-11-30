import java.util.Scanner;

public class Tugas3 {
    static boolean prima;
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        System.out.print("Masukkan nilai  : ");
        int n = input01.nextInt();
        cekPrimaRekursif(n, (n-1));
        
        if (prima == true){
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
        input01.close();
    }
    public static boolean cekPrimaRekursif(int n, int pembagi){
        if (n % pembagi != 0) {
            return cekPrimaRekursif(n, pembagi - 1);
        }else if (pembagi != 1 && n % pembagi == 0){
            return prima = false;
        }else if (pembagi == 1 && n % pembagi == 0){
            return prima = true;
        }else 
        return prima = false;
    }
}