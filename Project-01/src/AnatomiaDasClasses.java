public class AnatomiaDasClasses {

    public static void main(String[] args) {
        System.out.println ("Bem vindo.");   
            String primeiroNome = "Daniel";
            String segundoNome = "Campos";
            String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    } 
    public static String nomeCompleto (String primeiroNome, String segundoNome){
     return "olá " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
