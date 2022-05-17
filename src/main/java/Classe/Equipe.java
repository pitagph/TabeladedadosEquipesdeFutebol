/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author PhillipeSilva
 */
public class Equipe {
    
    private int id;
    private String nome;
    private String sigla;
    private String estado;

    public Equipe(String nome, String sigla, String estado) {
        this.nome = nome;
        this.sigla = sigla;
        this.estado = estado;
    }
    
    public Equipe(int id, String nome, String sigla, String estado) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.estado = estado;
    
    }

    public Equipe() {
        }
    
        @Override
    public String toString() {
        return "\n Nome da Equipe: "+ nome + "\n Sigla: "+ sigla + "\n Estado:" + estado;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
   
}
