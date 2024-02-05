public class projetos {
    String NomeProjeto;
    String localizacao;
    String Cliente;
    String Escopo;
    String DataInicial;

    public projetos(String nomeProjeto, String localizacao, String cliente, String escopo, String dataInicial) {
        this.NomeProjeto = nomeProjeto;
        this.localizacao = localizacao;
        this.Cliente = cliente;
        this.Escopo = escopo;
        this.DataInicial = dataInicial;
    }
    public void displayInfo(){
        System.out.println("Nome do projeto: "+ NomeProjeto);
        System.out.println("Localização: "+ localizacao);
        System.out.println("Nome do cliente: "+ Cliente);
        System.out.println("Escopo do projeto: "+ Escopo);
        System.out.println("Data incial do projeto: "+ DataInicial);
    }
    public void editarprojeto();
}