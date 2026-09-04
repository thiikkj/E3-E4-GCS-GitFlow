package catalogo.model;

import java.util.ArrayList;

public abstract class ItemColecionavel {

    private int id;
    private String nome;
    private String dataAquisicao;
    private ArrayList<String> autores;

    public ItemColecionavel(int id, String nome, String dataAquisicao, ArrayList<String> autores) {
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.autores = autores;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }
}