public class P18 {
    public static void main(String[] args) {

        //Problema 18 - Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
        //suma = 1+(x la puterea 1) +(x la puterea 2) + (x la puterea 3) + ….+ (x la puterea n)

        int x=4;
        int n=5;
        int sum=0;
        int result=1;

        for(int i=1;i<=n;i++){
            result=result*x;
            sum=sum+result;
        }
        System.out.println(sum+1);
    }
}
