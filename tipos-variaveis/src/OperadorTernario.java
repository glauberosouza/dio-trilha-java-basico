public class OperadorTernario {
    public static void main(String[] args) {
       
        int a, b;
        a = 5;
        b = 6;
        String resultado = a == b ? "Verdadeiro" : "falso";
        System.out.println(resultado);

        // Operador ternario não se limita a String
        
        int resultado2 = a == b ? 1 : 0;
        System.out.println(resultado2);
    }
    
}
