public class q5 {
    
    public static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Por favor, forneça um único argumento (o termo).");
            return;
        }

        int num = Integer.parseInt(args[0]);

        System.out.println("\nA sequência é:");
        for (int r = 0; r < num; r++) {
            System.out.print(fibo(r + 1) + " ");
        }
    }
}
