package apoio;
import java.time.LocalDate;

public class Partida {
    private Time timeA;
    private Time timeB;
    private LocalDate data;

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

    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalDate getData() {
        return data;
    }

}
