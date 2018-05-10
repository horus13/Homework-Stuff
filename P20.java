import java.util.Arrays;
public class P20 {

    public static void main(String args[]) {

        //Problema 20 - Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate, iar pentru a doua jumatate sa se afseze numerele triplate daca sunt impare si numerele asa cum sunt in sir daca sunt pare.

        int[] array = {1, 4, 5, 6, 7, 8,11,2};
        for(int i=0;i<array.length-1;i++){
            if (array[i]<array[i+1])
                System.out.println("Ascending...");
            else {
                System.out.println("Found it!");
                Arrays.sort(array);
                System.out.printf("Result: "+
                        Arrays.toString(array));
            }
        }
    }
}
