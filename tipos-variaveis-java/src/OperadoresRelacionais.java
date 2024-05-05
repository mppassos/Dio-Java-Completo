public class OperadoresRelacionais {
    public static void main(String[] args) {
        
        String nomeUm = "WILSON";
        String nomeDois = new String("WILSON");

        //System.out.println(nomeUm == nomeDois); comparacao de objetos de forma erronea

        System.out.println(nomeUm.equals(nomeDois));// comparacao de objetos de forma correta

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

         simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que a numeroDois? " + simNao);

    }
}
