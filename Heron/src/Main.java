import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);
        System.out.println("a degerini giriniz ");
        double a = input.nextDouble();
        System.out.println("b degerini giriniz ");
        double b= input.nextDouble();
        System.out.println("c degerini giriniz ");
        double c= input.nextDouble();

        Heron heron1=new Heron(a, b, c);
        heron1.yazdir();




    }
}