package edu.matheus.segundasemana;
public class MyClass {

    public static void main(String[] args) {
        
        String primeiroNome = "Matheus";
        String segundoNome = "Oliveira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String nome , String sobrenome){
        return "Resultado do método " + nome.concat(" ").concat(sobrenome);
    }

}
