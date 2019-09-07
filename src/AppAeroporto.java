import java.time.Duration;
import java.time.LocalDateTime;

public class AppAeroporto {

    public static void main(String[] args) {


        System.out.println("MyFlight project...");

        GerenciadorCias cias = new GerenciadorCias();
        CiaAerea c1  = new CiaAerea ("JJ", "LATAM");
        CiaAerea c2  = new CiaAerea ("G3", "Gol");
        CiaAerea c3  = new CiaAerea ("TP", "Tap");

        cias.inserir(c1);
        cias.inserir(c2);
        cias.inserir(c3);

        for (CiaAerea c: cias.getCias()){
            System.out.println(c + " ");
        }

        System.out.println("");

        Geo portoAlegre = new Geo(23,22);
        Geo saoPaulo = new Geo (24, 26);
        Geo amsterdan = new Geo (35,39);

        Aeroporto portoAlegreAero = new Aeroporto ("POA", "Porto Alegre", portoAlegre);
        Aeroporto saoPauloAero = new Aeroporto ("GRU", "São Paulo", saoPaulo);
        Aeroporto amsterdanAero = new Aeroporto ("AMS" , "Amsterdan", amsterdan);

        Aeronave aviao1 = new Aeronave ("A343", "Airbus 737");

        Rota origem = new Rota (c1, portoAlegreAero, saoPauloAero, aviao1);
        Rota destino = new Rota (c1, saoPauloAero, amsterdanAero, aviao1);

        LocalDateTime datahora = LocalDateTime.of(2019, 9, 7, 5, 30);
        Duration duracao = Duration.ofMinutes(120); // 2 horas

        VooVariasEscalas vooTeste = new VooVariasEscalas(origem, datahora, duracao);
        vooTeste.addRota(destino);

        System.out.print (vooTeste);

        /*System.out.print("Código c1: " + c1.getCodigo());
        System.out.print("Nome c2: " + c2.getNome());
        System.out.print("c3: " + c3.toString());*/

    }

}
