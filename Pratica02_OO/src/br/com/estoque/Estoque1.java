package br.com.estoque;

public class Estoque1 {

    private int codProduto;
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque1() {
    }

    public Estoque1(int codProduto, String nome, int qtdAtual, int qtdminima) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdminima;
    }

    public void darBaixa(int qtd){
        if(qtd<=qtdAtual)
            qtdAtual-=qtd;
        else
            System.out.println("Estoque insuficiente para baixa");
    }
    public String mostra(){
        return "Produto: "+getNome()+"\nCodigo do Produto: "+getCodProduto()+"\nQuantidade Mínima: "+getQtdMinima()+"\nQuantidade Atual: "+getQtdAtual();
    }
    public boolean precisaRepor(){
        if(getQtdAtual()<=getQtdMinima())
            return true;
        else
            return false;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdminima) {
        this.qtdMinima = qtdminima;
    }
}
