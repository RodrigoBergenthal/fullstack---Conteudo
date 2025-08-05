//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichatecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(5);
        System.out.println("Total de Avaliações" + meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.pegaMedia());

        System.out.println();
    }
}