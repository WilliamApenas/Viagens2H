public class Main {
    public static void main(String[] args) {
        //Classe Objeto Construtor
            Turista mochileiro = new Turista();

            //Definir formato de objeto
        mochileiro.setNome("lindsay");
        mochileiro.setCpf(Validacao.cpf("123"));
        Turista mochileira = new Turista("Maria");


        //Definir Comportamentos
        String retorno = mochileira.viajar();
        System.out.println(retorno);
    }
}