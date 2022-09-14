package apoio;

public class Partida {
    private Time timeA;
    private Time timeB;
    private int golsTimeA;
    private int golsTimeB;

    private String cidadePartida;

    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }
    public Time getTimeA() {
        return timeA;
    }

    public Time getTimeB() {
        return timeB;
    }
    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }

    public void setCidade(String cidadePartida) {
        this.cidadePartida = cidadePartida;
    }
    public String getCidade() {
        return cidadePartida;
    }
    public Time timeVencedor(){
        if(this.golsTimeA > this.golsTimeB){
            return this.timeA;
        }
        else if(this.golsTimeA < this.golsTimeB){
            return this.timeB;
        }
        else{
            return null; // a sintaxe de Java bota o null como minúsculo
        }
    }
}
