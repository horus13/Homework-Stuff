import java.util.Scanner;
public class P11 {
    public static void main(String[] args) {

        //Problema 11 - Se da un sir de numere ordonate crescator.
        //Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
        //Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
        //Sirul va fi definit asa, numerele sunt de exemplu.
        //int[] a = {1,3,4,6,7,8,10,12,14,23};

        int a [] = {1,3,4,6,7,8,10,12,14,23};
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Number pls: ");
        int pozitie = 0;
        for (int i=1; i<a.length;i++){
            if (number == a[i]){
                pozitie = i+1;
                System.out.println("The number"+ number + "is at position" + pozitie);}
            else
                System.out.println("-1");
        }
    }
}
