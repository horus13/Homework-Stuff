public class P3 {
    public static void main(String[] args) {

        //Problema 3 - Se se calculeze media aritmetica pana ce numarul citit este 0.

        int[] array = new int[] {67,90,51,23,0,51};
        float sum= (float) 0;
        float arithmeticMean;

        for(int i = 0; i < array.length; ++i){
            if (array[i]!=0) sum=sum+array[i];
            else break;
        }

        arithmeticMean=sum/array.length;
        System.out.println("Sum of the array until it hits 0: " +sum);
        System.out.println("Arithmetic mean until it hits 0: " +arithmeticMean);
    }
}
