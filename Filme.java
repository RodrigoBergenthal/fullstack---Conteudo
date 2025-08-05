public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibeFichatecnica (){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: "+ anoDeLancamento);
    }

    void avalia (double nota) {
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
        totalDeAvaliacoes ++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
