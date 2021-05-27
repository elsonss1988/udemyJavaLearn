package Iniciante.banco;

public class Banco {
    private int conta;
    private String nome;
    private double valor;

    public Banco(int conta, String nome, double valor){
        this.valor=valor;
        this.nome=nome;
        this.conta=conta;
    }
    public Banco(int conta, String nome){
        this.nome=nome;
        this.conta=conta;
    }

    public void deposito (double valor){
        this.valor+=valor;
    }

    public void saque (double valor){
        this.valor-=valor+5.0;
    }

    public int getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "banco " +
                "conta=" + conta +
                ", nome=" + nome +
                ", valor=" + String.format("%.2f",valor) +
                ' ';
    }
}
