public class DVD {
    package catalogo.model;

import java.util.ArrayList;

public class Dvd extends ItemColecionavel {

    private TipoDvd tipo;
    private String descricao; // descrição geral do item ou dos extras

    public Dvd(int id, String nome, String dataAquisicao, ArrayList<String> autores,
               TipoDvd tipo, String descricao) {
        super(id, nome, dataAquisicao, autores);
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public TipoDvd getTipo() {
        return tipo;
    }

    public void setTipo(TipoDvd tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "DVD [" +
                "id=" + getId() +
                ", nome=" + getNome() +
                ", tipo=" + tipo +
                ", dataAquisicao=" + getDataAquisicao() +
                ", autores=" + getAutores() +
                ", descricao=" + descricao +
                "]";
    }
}
}