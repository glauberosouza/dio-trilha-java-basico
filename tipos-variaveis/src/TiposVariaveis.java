public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Tipos primitivos
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);

         // Classe String representa texto na aplicação
         String nome = "Goku";
         
        //Constante não pode ser alterado o valor após ser declarado!
        final double  VALOR_DE_PI = 3.14;
    }
}
