
package gui;

import java.util.Date;

public class Jogadores {
        
    private String nome;
    private String cpf;
    private Date dataNasc;
    private String posicao;
    private boolean vacinado;

    public Jogadores() {
        
    }

    
    
    public Jogadores(String nome, String cpf, Date dataNasc, String posicao, boolean vacinado) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.posicao = posicao;
        this.vacinado = vacinado;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public boolean getVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

   
}
