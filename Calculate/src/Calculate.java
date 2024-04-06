public class Calculate {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if(args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            minus(x, y);
        } else if (args[0].equals("multiplicar")) {
            multipy(x, y);
        } else if (args[0].equals("dividir")) {
                divide(x, y);
        } else {
            System.out.println("Nenhuma instrucao definida");
        }

    }

    //4 instrucoes padroes
    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void minus(int x, int y) {
        System.out.println(x - y);
    }

    static void multipy(int x, int y) {
        System.out.println(x * y);
    }

    static void divide(int x, int y) {
        if (y == 0) {
            System.out.println("Não é possível dividir por zero.");
        } else {
            System.out.println(x / y);
        }
    }
}
