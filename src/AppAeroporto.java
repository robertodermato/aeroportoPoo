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

        /*
        // for each das cias
        for (CiaAerea c: cias.getCias()){
            System.out.println(c + " ");
        }
        */

        System.out.println(" ");

        // Linhas abaixo são para poder testar a classe VooEscalas
        Geo portoAlegre = new Geo(-30,-51);
        Geo saoPaulo = new Geo (-23, -46);
        Geo amsterdan = new Geo (52,4);
        Geo toquio = new Geo (35, 140);

        // Exercicio 2 do polígrafo de sobrecarga e interface
        System.out.println("\n\nTestando se o cálculo de distância da rota está certo por método estático classe Geo");
        double distanciaGeo = Geo.calculaDistancia(portoAlegre, saoPaulo);
        System.out.println ("Distância entre Porto Alegre e São Paulo: " + distanciaGeo + "km");

        System.out.println("\n\nTestando se o cálculo de distância da rota está certo por método não estático classe Geo");
        double distanciaGeonao = portoAlegre.calculaDistancia(saoPaulo);
        System.out.println ("Distância entre Porto Alegre e São Paulo: " + distanciaGeonao + "km");

        Aeroporto portoAlegreAero = new Aeroporto ("POA", "Porto Alegre", portoAlegre);
        Aeroporto saoPauloAero = new Aeroporto ("GRU", "São Paulo", saoPaulo);
        Aeroporto amsterdanAero = new Aeroporto ("AMS" , "Amsterdan", amsterdan);
        Aeroporto toquioAero = new Aeroporto ("NRT", "Tóquio", toquio);

        Aeronave aviao1 = new Aeronave ("A343", "Airbus 737");

        Rota origem = new Rota (c1, portoAlegreAero, saoPauloAero, aviao1);
        Rota escala = new Rota (c1, saoPauloAero, amsterdanAero, aviao1);
        Rota destino = new Rota (c1, amsterdanAero, toquioAero, aviao1);

        //Testando se o cálculo de distância e duração da rota está certo
        System.out.println("\n\nTestando se o cálculo de distância e duração da rota está certo");
        double distancia = origem.calculaDistancia();
        System.out.println ("Distância entre Porto Alegre e São Paulo: " + distancia + "km");
        double duracao = origem.getDuracao();
        System.out.println ("Duração do voo Porto Alegre e São Paulo: " + duracao + "horas\n\n");

        LocalDateTime datahora = LocalDateTime.of(2019, 9, 7, 5, 30);
        //Duration duracao = Duration.ofMinutes(120); // 2 horas

        // Testando polimorfismo. Pode-se declarar o vooTeste como sendo Voo do tipo VooEscalas,
        // para usar-se o método específico da classe VooEscalas tem-se que fazer o casting.
        // A variável vooTeste é polimórifca, pois pode referenciar um objeto da classe Voo ou da classe VooEscalas
        Voo vooTeste = new VooEscalas(datahora);
        ((VooEscalas) vooTeste).addRota(origem);
        ((VooEscalas) vooTeste).addRota(escala);
        ((VooEscalas) vooTeste).addRota(destino);

        System.out.println("Testando voo com escalas\n");
        System.out.print (vooTeste);

        //testando classe VooDireto usando casting
        Voo vooDiretoTeste = new VooDireto(datahora, origem);
        System.out.println ("\n\nTestando Voo direto");
        System.out.println ("Duração do voo Porto Alegre e São Paulo: " + ((VooDireto)vooDiretoTeste).getDuracao() + "horas");
        System.out.println (vooDiretoTeste);

        //Testando classe GerenciadorVoos
        GerenciadorVoos gerVoos = new GerenciadorVoos();
        gerVoos.adicionar(vooTeste);

        //Exercício 1 de interface
        Voo vooTeste1 = new VooDireto(120, datahora, origem); // usando construtor com duraçõa, DataHora e rota
        Voo vooteste2 = new VooDireto (120, origem); // usando construtor só com duração e rota

    }
}
