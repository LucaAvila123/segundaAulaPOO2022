import apoio.Partida;
import apoio.Time;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // o nome disso daqui é construtor implícito, pq não tem uma declaração de construtor na classe
        Time fla = new Time("Flamengo", "Rio de Janeiro");
        System.out.println(fla.getNome());

        Time flu = new Time("Fluminense", "Rio de Janeiro");
        System.out.println(flu.getNome());

        Time santos = new Time("Santos", "Santos");
        System.out.println(santos.getNome());

        Partida p1 = new Partida(santos, flu, LocalDate.of(2022, 9, 14));
        
        System.out.println(p1);
        System.out.printf("%s, %s\n", p1.getTimeA().getNome(), p1.getTimeB().getNome());
        System.out.println(p1.getData());
    }
}
