import apoio.Partida;
import apoio.Time;

public class App {
    public static void main(String[] args) {
        Time fla = new Time();
        fla.setNome("Flamengo");
        System.out.println(fla.getNome());

        Time flu = new Time();
        flu.setNome("Fluminense");
        System.out.println(flu.getNome());

        Time vasco = new Time();
        vasco.setNome("Vasco");
        System.out.println(vasco.getNome());

        Partida p1 = new Partida();
        p1.setTimeA(fla);
        p1.setTimeB(flu);

        System.out.println(p1);
        System.out.printf("%s, %s\n", p1.getTimeA().getNome(), p1.getTimeB().getNome());


    }
}
