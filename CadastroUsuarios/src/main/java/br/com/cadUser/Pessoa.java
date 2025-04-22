package br.com.cadUser;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<String> nomes;

    // Construtor
    public Pessoa() {
        this.nomes = new ArrayList<>();
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para a lista de nomes
    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void setNomes(ArrayList<String> nomes) {
        this.nomes = nomes;
    }

    // Método para adicionar um nome à lista
    public void adicionarNome(String nome) {
        this.nomes.add(nome);
    }
}