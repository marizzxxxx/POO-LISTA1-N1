/* Elabore um código que ao informar um número, imprima se este número é primo. */

public class q4 {
    public static void main(String[] args) {
        
        int num = 17;
        int primo = 0;

        if (num <= 1) {
            System.out.println(num + " não é um número primo.");
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    primo++;
                }
            }

            if (primo == 2) {
                System.out.println(num + " é um número primo.");
            } else {
                System.out.println(num + " não é um número primo.");
            }
        }
    }
}