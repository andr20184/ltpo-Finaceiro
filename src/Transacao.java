public class Transacao {
    private String descricao;
    private double valor;
    private TipoTransacao tipo;

    public enum TipoTransacao {
        RECEITA, DESPESA
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirTransacao() {
        System.out.printf("Descriçao:%s\n ", descricao);
        System.out.printf("Valor: %2f\n ", valor);
        System.out.printf("Tipo da Transaçõa: %s\n", tipo);
    }

    public Transacao(String descricao, double valor, TipoTransacao tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }
}
