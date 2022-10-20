import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*Napravite program koji na ekranu ispisuje sve brojeve između 1 i n koji su djeljivi sa sumom svojih cifara,
        pri čemu se n unosi sa tastature. U programu se obavezno treba nalaziti funkcija sumaCifara.
         Po završetku zadatak treba postaviti na GitHub koristeći isključivo funkcionalnosti IntelliJ IDEA okruženja!
Nakon toga, potrebno je da uradite konverziju tog projekta u Maven projekat i da pokrenete iz Command Prompt-a.
*/
    Scanner cin = new Scanner(System.in);
    System.out.println("Unesite n:");
    int n = cin.nextInt();
    for(int i = 1; i < n; i++){
        if(i%SumaCifara(i)==0)
            System.out.print(i+ " ");
    }
    }
    public static int SumaCifara(int n){
        int suma=0;
        while(n>0){
            suma+=n%10;
            n/=10;
        }
        return suma;
    }

}