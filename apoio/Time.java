package apoio;
//buscar onde está o Quick Fix
public class Time {
    private String nome;
    private String cidadeSede;

    public Time(String nome, String cidadeSede){
        this.nome = nome;
        this.cidadeSede = cidadeSede;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCidadeSede(String cidadeSede) {
        this.cidadeSede = cidadeSede;
    }
    public String getCidadeSede() {
        return cidadeSede;
    }
}
