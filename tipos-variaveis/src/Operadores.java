public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        numero = -numero;
    
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);
        System.out.println();

        // repetição
        int numero1 = 5;
        System.out.println(numero1++);
        System.out.println(numero1);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
        System.out.println();
    }
}
