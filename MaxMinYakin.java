package Diziler;
import java.util.Arrays;
import java.util.Scanner;
public class MaxMinYakin {
    public static void main(String[] args) {
        int number;
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);
        int minus = 0;
        int max = list[0];

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number = scan.nextInt();

        System.out.println("Dizi : " + Arrays.toString(list));

        for (int item : list) {
            if (item > number){
                max=item;
                break;
            }
        }
        for(int i=list.length-1; i >=0;i--){
            if(list[i] < number) {
                minus = list[i];
                break;
            }
        }
        System.out.println("Girilen Sayı : " + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minus);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
