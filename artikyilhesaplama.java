import java.util.Scanner;
public class artikyilhesaplama {
    public static void main(String[] args) {
       int year ;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        if((year%100 > 0) && (year%4 == 0)){
            System.out.print(year+" bir artık yıldır ! ");
        }else if (year%400 == 0){
            System.out.print(year+" bir artık yıldır ! ");
        }else{
            System.out.print(year+" bir artık yıl değildir ! ");

        }

    }
}
