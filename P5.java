public class P5 {
    public static void main(String[] args) {

        // Problema 5 -  Se se afiseze o tabela de conversie din Fahrenheit in Celsius intre gradul X si gradul Y

        int f = 0;
        while(f<=100) {
            double c = 5/9d*(f-32);
            System.out.println("Fahrenheit "+f+" is equal to Celsius "+c);
            f++;
        }

    }
}
