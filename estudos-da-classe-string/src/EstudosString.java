public class EstudosString {
    public static void main(String[] args) throws Exception {
        //Concatenacao com operador + (mais eficiente do que concat)

        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2;

        System.out.println("Operador + " + result);

        //Concatenando com o metodo concat 

        String result1 = str1.concat(" ").concat(str2);
        System.out.println("Metodo concat : " + result1);

        //Obter o comprimeiro de uma string

        int length = result.length();
        System.out.println("Comprimento de sua string: " + length);

        //Obter um caractere específico de uma String

        char ch = result.charAt(0); //obtém o caractere na posicao 1 (começando do 0)
        System.out.println("Caractere na posicao 0: " + ch);

        //Verificar se uma String contém outra String:
        boolean contains = result.contains("World");
        System.out.println("A string contém 'World'?: " + contains);

        //Converter uma String para maiúsculas ou minúsculas
        String upperCase = result.toUpperCase();
        String lowerCase = result.toLowerCase();

        System.out.println("Em maiúsculo: " + upperCase);
        System.out.println("Em minúsculo: " + lowerCase);

        //Dividir uma String em substrings com base em um delimitador

        String str = "Melancia , Uva , Pera , Maçã , Morango";
        String [] frutas = str.split(" , "); //tem espaços nesse exemplo ok? //teste sem os espaços
        for(String fruta : frutas){
            System.out.println(fruta);
        }

        //Concatenacao em Loops (não se utiliza operador + nem o metodo concat)

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< 5 ; i++){
            sb.append("Number: ").append(i).append(", ");
        }
        String resultado = sb.toString();
        System.out.println("Resultado StringBuilder: " + resultado);

        // Verificar se uma String é vazia ou nula
        String exemplo1 = "";
        String exemplo2 = null;

        System.out.println("String vazia? " + exemplo1.isEmpty());//saida true
        System.out.println("String nula? " + (exemplo2 == null));

        //Substituir caracteres em uma String
        String exemplo3 = "Hello, World!";
        String newStr = exemplo3.replace('o', '0');
        System.out.println("String com 'o' substituido por '0': " + newStr);

        //Verificar se uma String começa ou termina com determinado prefixo ou sufixo
        String strIndustria = "Seara Transportes Ltda";
        boolean startsWithSeara = strIndustria.toLowerCase().startsWith("SEARA".toLowerCase());//sensivel ao CamelCase, o ideal é nivelar tudo para uppercase ou Lowercase antes da comparação
        boolean endsWithLtda = strIndustria.endsWith("Ltda");
        boolean contemTransporte = strIndustria.contains("Transportes");

        System.out.println("Começa com Seara: " + startsWithSeara);//deu true por causa do lowerCase, assim garantimos uma comparacao mais robusta
        System.out.println("Termina com Ltda: " + endsWithLtda);
        System.out.println("Contains Transporte: " + contemTransporte);

        //Converter uma String em um array de caracteres
        String exemplo4 = "Nivelamento";
        char [] charArray = exemplo4.toCharArray();
        System.out.println("Array de caracteres: ");
        for(char c : charArray){
            System.out.print(c + " ");
        }
        
        //Verificar se uma String contém apenas dígitos numericos

        String exemplo5 = "12345";
        String exemplo6 = "abc123";

        System.out.println("Exemplo 5 contém apenas dígitos? " + exemplo5.matches("\\d+"));//true
        System.out.println("Exemplo 6 contém apenas dígitos? " + exemplo6.matches("\\d+"));//false

        //Remover espaços em branco no inicio e no final de uma String

        String exemploEspaco = "           HELLO, WORLD!        ";
        String trimmedExemploEspaco = exemploEspaco.trim();
        System.out.println("String original: '"+ exemploEspaco + "'");
        System.out.println("String após remoção de espaços em branco: '" + trimmedExemploEspaco + "'");
    }
}
