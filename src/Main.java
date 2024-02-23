import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, ebob=1, temp, ekok;
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        n2 = input.nextInt();

        temp = n1;

        while (temp >= 1){
            if(n1 % temp == 0 && n2 % temp == 0){
                ebob = temp;
                break;
            }
            temp -= 1;
        }

        ekok = (n1 * n2) / ebob;

        System.out.println(n1 + " ve " + n2 + " sayılarının Ebobu : " + ebob);
        System.out.println(n1 + " ve " + n2 + " sayılarının Ekoku : " + ekok);


    }
}