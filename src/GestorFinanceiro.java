import java.util.ArrayList;
import java.util.List;

class GestorFincanceio {
    private List<Transacao> transacoes;

    //Construtor
    public GestorFincanceio() {
        this.transacoes = new ArrayList<>();
    }

    // Metodo para adicionar uma transação
    public void adicionarTransacao(String descricao, double valor, Transacao.TipoTransacao tipo) {
        Transacao transacao = new Transacao(descricao, valor, tipo);
        transacoes.add(transacao);
    }


    // Metodo para listar todas as transações
    public void listarTransacoes() {
        System.out.println("\n=== RELÁTORIO DE TRANSÇÕES ===");
        System.out.printf("%-20s | %-10s |  %s\n", "Descrição", "Tipo", "Valor");
        System.out.println("_____________________________________________");
        for (Transacao t : transacoes) {
            t.exibirTransacao();

        }

    }

    // metodo para calcular o saldo final
    public double calcularSaldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            if (t.getTipo() == Transacao.TipoTransacao.RECEITA) {
                saldo += t.getValor();
            } else {
                saldo -= t.getValor();
            }
        }
        return saldo;
    }
}