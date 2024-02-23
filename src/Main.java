import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner sinifi ve gerekli degiskeni tanimladik.
        Scanner input = new Scanner(System.in);
        int stepNumber;

        // Kullanicidan basamak sayisi alinip ilgili degiskene tanimlandi.
        System.out.print("Basamak sayisini gir: ");
        stepNumber = input.nextInt();

        // Gerekli mantiksal islemler ic ice for donguleri yardimiyla gerceklestirildi.
        for (int i = stepNumber; i > 0; i--){
            for (int j = 0; j < (2 * i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}