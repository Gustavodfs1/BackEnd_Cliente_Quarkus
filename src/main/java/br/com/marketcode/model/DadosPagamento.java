package br.com.marketcode.model;


public class DadosPagamento {
   
    private String numCartao;
    private String validadeCartao;
    private String cvcCartao;
    private String nomeCartao;

    public String getNumCartao() {
        return this.numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getValidadeCartao() {
        return this.validadeCartao;
    }

    public void setValidadeCartao(String validadeCartao) {
        this.validadeCartao = validadeCartao;
    }

    public String getCvcCartao() {
        return this.cvcCartao;
    }

    public void setCvcCartao(String cvcCartao) {
        this.cvcCartao = cvcCartao;
    }

    public String getNomeCartao() {
        return this.nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }
    
}