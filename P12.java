public class P12 {
    public static void main(String[] args) {

        //Problema 12 - Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
        //int n = 20; //sau o alta valoare

        int n=20;
        int i=0;
        int sum=0;

        do {
            sum=sum+i;
            i=i+1;
        }while (i<=n);

        System.out.println(sum);
    }
}
