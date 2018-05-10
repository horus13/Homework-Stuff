import java.util.Arrays;
public class P10 {
    public static void main(String[] args) {

        //Problema 10 - De terminat problema lotto din clasa , mai ales de eliminat duplicatele din array-urile cu biletul nostru si al agentiei.

        int[] oldArray = {1,2,3,4,5,6,7,8,9,10};
        int[] newArray = new int[oldArray.length];

        for(int i =0;i < oldArray.length;i++){
            if (i>1 && i<8)
                newArray[i] = oldArray[i];}
        System.out.println(Arrays.toString(newArray));
    }
}
