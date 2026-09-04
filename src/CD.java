import java.time.LocalDate;
import java.util.List;

public class CD {

    private int id;
    private String nome;
    private LocalDate dataAquisicao;
    private List<String> autores;
    private String generoMusical;
    private List<String> faixas;

    public CD(int id, String nome, LocalDate dataAquisicao, List<String> autores, String generoMusical, List<String> faixas) {
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.autores = autores;
        this.generoMusical = generoMusical;
        this.faixas = faixas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public List<String> getFaixas() {
        return faixas;
    }

    public void setFaixas(List<String> faixas) {
        this.faixas = faixas;
    }

    public String toString() {
        String texto = "ID: " + id + "\n";
        texto = texto + "Nome: " + nome + "\n";
        texto = texto + "Data de aquisicao: " + dataAquisicao + "\n";
        texto = texto + "Autores: " + autores + "\n";
        texto = texto + "Genero musical: " + generoMusical + "\n";
        texto = texto + "Faixas: " + faixas;
        return texto;
    }
}
