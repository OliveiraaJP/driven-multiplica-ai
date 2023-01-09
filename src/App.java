public class App {
    public static void main(String[] args) throws Exception {
        final int num  = 10;

        System.out.println("Tabela de multiplicação de " + num);

        for (int i = 1; i <= 10; i++){
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
