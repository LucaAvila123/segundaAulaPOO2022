package apoio;

public class Cidade {
    private String nomeCidade;
    private UnidadeDaFederacao unidadeFederativa;

    public Cidade(String nomeCidade, UnidadeDaFederacao unidadeFederativa){
        this.nomeCidade = nomeCidade;
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public UnidadeDaFederacao getUnidadeFederativa() {
        return unidadeFederativa;
    }
}
