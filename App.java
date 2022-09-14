import apoio.*;
import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //precisa fechar quando abre as entradas com Scanner
        Scanner entradas = new Scanner(System.in);

        Cidade rio_de_janeiro = new Cidade("Rio de Janeiro", "RJ");
        Cidade santos = new Cidade("Santos", "SP");
        Cidade sao_paulo = new Cidade("Sao Paulo", "SP");

        Time fla = new Time("Flamengo", rio_de_janeiro);
        System.out.println(fla.getNome());

        Time flu = new Time("Fluminense", rio_de_janeiro);
        System.out.println(flu.getNome());

        Time santosFC = new Time("Santos", santos);
        System.out.println(santos.getNome());

        Partida p1 = new Partida(santosFC, flu, LocalDate.of(2022, 9, 14), sao_paulo);


        int quemMarcou = entradas.nextInt();
        while(quemMarcou != 3){
            if(quemMarcou == 1)
                p1.marcaGolTimeA();
            else if(quemMarcou == 2)
                p1.marcaGolTimeB();

            quemMarcou = entradas.nextInt();
        }

        entradas.close();
        
        System.out.println(p1.getTimeA().getNome() + " marcou " + p1.getGolsTimeA() + " gols");
        System.out.println(p1.getTimeB().getNome() + " marcou " + p1.getGolsTimeB() + " gols");
        System.out.println(p1.getData());
        
        System.out.println("O placar é " + p1.getGolsTimeA() + " x " + p1.getGolsTimeB());
        //nao da certo colocar só o objeto sem o null, pq o java não vai reconhecer
        if(p1.getVencedor() != null) System.out.println("O vencedor da partida é " + p1.getVencedor().getNome());
        else System.out.println("Empate");
    }
}
