package apoio;
//buscar onde está o Quick Fix
public class Time {
    private String nome;
    private Cidade cidadeSede;

    //se você não tem setter, você faz com que o arquivo seja só para leitura
    public Time(String nome, Cidade cidadeSede){
        this.nome = nome;
        this.cidadeSede = cidadeSede;
    }
    
    public String getNome() {
        return nome;
    }

    public Cidade getCidadeSede() {
        return cidadeSede;
    }
}
