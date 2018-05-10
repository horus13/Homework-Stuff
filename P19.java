import java.util.Arrays;
public class P19 {
    public static void main(String[] args) {

        //Problema 19 - Se da un sir. Sa se verifice daca sirul este ordonat crescator , iar daca nu este sa se ordoneze si sa se afiseze in ordine crescatoare
        //de ex pt sirul {2,3,4} se va afisa “crescator” iar pt sirul {3,2,4}  si va ordina si afisa {2,3,4}

        int[] array = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
        int n = array.length;

        int[] a = new int[(n + 1)/2];
        int[] b = new int[n - a.length];

        for (int i = 0; i < n; i++)
        {
            if (i < a.length)
                a[i] = array[i]*2;
            else
            if (i%2==0)
                b[i - a.length] = array[i];
            else
                b[i - a.length] = array[i]*3;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}