public class P6 {
    public static void main(String[] args) {

        //Problema 6 - Se da un sir de numere. Sa se afiseze: numarul maxim, numarul minim, suma lor, sirul dublat

        int[] array = {65,72,22,44,89,12};
        int max=0;
        int max2=0;
        int min=array[0];
        for(int i = 0; i < array.length; i++){
            max=array[i];
            System.out.println("Doubled "+max*2);
            if (max2<max)
                max2=max;


        }
        for(int i = 1; i < array.length; i++){
            max=array[i];
            if (min>max)
                min=max;


        }

        System.out.println("Highest number: " +max2) ;
        System.out.println("Lowest number: " +min) ;
    }
}
