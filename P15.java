public class P15 {
    public static void main(String[] args) {

        //Problema 15 - Se dau doua numere a si n. sa se afiseze numarul a la puterea n.

        int a=3;
        int n=10;
        int result=1;
        for(int i=1;i<=n;i++){

            result=result*a;
        }
        System.out.println("The result is: " +result);
    }
}
