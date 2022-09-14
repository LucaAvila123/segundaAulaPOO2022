package apoio;

public class UnidadeDaFederacao {
    private String nome;
    private String sigla;
    public UnidadeDaFederacao(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
}
