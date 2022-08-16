import java.util.Scanner;

public class main {
    public static void main(String[] args) {
int kg;
double boy,endeks;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Kilonuzu giriniz");
        kg=input.nextInt();

        System.out.println("Lütfen Boyunuzu Giriniz");
        boy=input.nextDouble();

        endeks=kg/(boy*boy);
        System.out.println("Beden Kitle Endeksiniz:" + endeks);

    }}
