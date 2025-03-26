//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Criando o gestor financeiro
        GestorFincanceio gestor = new GestorFincanceio();

        //Adicionando receitas e despesas manualmente
        gestor.adicionarTransacao("Salário",5000.0, Transacao.TipoTransacao.RECEITA);
        gestor.adicionarTransacao("Freelance", 1200.0, Transacao.TipoTransacao.RECEITA);
        gestor.adicionarTransacao("Aluguel", 1500.0,Transacao.TipoTransacao.DESPESA);
        gestor.adicionarTransacao("Supermercado", 600.0,Transacao.TipoTransacao.DESPESA);
        gestor.adicionarTransacao("Internet", 100.0, Transacao.TipoTransacao.DESPESA);

        gestor.listarTransacoes();

        System.out.printf("\nSaldo Final: R$ %.2f\n", gestor.calcularSaldo());
    }
}