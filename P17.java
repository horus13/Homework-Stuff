public class P17 {
    public static void main(String[] args) {

        //Problema 17 - Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.

        int[] array = {2, 4, 5, 2, 9, 8 ,23 ,1 };
        for (int i = 0; i < (array.length-1); i++) {

            if (array[i] > array[i + 1])
                System.out.println("The pair is: " + array[i] + ", " + array[i + 1]);


        }
    }
}
