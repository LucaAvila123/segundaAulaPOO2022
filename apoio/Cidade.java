package apoio;

public class Cidade {
    private String nome;
    private String unidadeFederativa;

    public Cidade(String nome, String unidadeFederativa){
        this.nome = nome;
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getNome() {
        return nome;
    }

    public String getUnidadeFederativa() {
        return unidadeFederativa;
    }
}
