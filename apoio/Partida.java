package apoio;
import java.time.LocalDate;

//é o programador da classe quem tem o controle do que será feito nela
public class Partida {
    private Time timeA;
    private Time timeB;
    private LocalDate data;
    private Cidade cidadeRealizacao;
    
    private int golsTimeA;
    private int golsTimeB;

    public void marcaGolTimeA(){
        golsTimeA++;
    }

    public void marcaGolTimeB(){
        golsTimeB++;
    }
    public int getGolsTimeA() {
        return golsTimeA;
    }
    public int getGolsTimeB() {
        return golsTimeB;
    }

    public Partida(Time timeA, Time timeB){
        this.timeA = timeA;
        this.timeB = timeB;
    }

    public Partida(Time timeA, Time timeB, LocalDate data, Cidade cidadeRealizacao){
        this.timeA = timeA;
        this.timeB = timeB;
        this.data = data;
        this.cidadeRealizacao = cidadeRealizacao;
    }

    public Time getTimeA() {
        return timeA;
    }

    public Time getTimeB() {
        return timeB;
    }

    public LocalDate getData() {
        return data;
    }

    public Cidade getCidadeRealizacao() {
        return cidadeRealizacao;
    }

    public Time getVencedor(){
        if(golsTimeA > golsTimeB)
            return timeA;
        
        else if(golsTimeB > golsTimeA)
            return timeB;

        else 
            return null;
    }

}
