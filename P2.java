public class P2 {
    public static void main(String[] args) {

    //Problema 2 - Sa se calculeze media aritmetica a N numere.

        int[] array = new int[] {24,48,56,61,32};
        float sum= (float) 0;
        float arithmeticAverage;
        for(int i = 0; i < array.length; ++i){
            sum=sum +array[i];
        }
        arithmeticAverage=sum/array.length;
        System.out.println("The sum of the array: " +sum);
        System.out.println("The arithmetic mean for N numbers: " +arithmeticAverage);



    }
}
