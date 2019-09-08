//import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo {

    private ArrayList<Rota> rotas;
    //private Duration duracao;
    private Rota rota;


    public VooEscalas (LocalDateTime dh){
        super (dh);
        rotas  = new ArrayList<Rota>();
    }

    public boolean addRotaTeste (Rota escala){
        return rotas.add(escala);
    }

    public void addRota (Rota escala){
        rotas.add(escala);
    }

    public Rota getRota(){
        return rota;
    }

    public ArrayList<Rota> getRotas(){
        return rotas;
    }

    public double getDuracao(){
        double duracaoTotal=0;
        for (Rota escala: rotas) {
            duracaoTotal = duracaoTotal + escala.getDuracao();
        }

        //acrescenta 30 minutos para cada escala
        duracaoTotal=duracaoTotal + rotas.size()*0.5;
        return duracaoTotal;
    }

    //public Duration getDuracao(){
    //    return duracao;
    //}

    @Override
    public String toString(){
        String rotasStr = "";
        for (Rota escala: rotas) rotasStr = rotasStr + " " + escala + "Duração do trecho: " + escala.getDuracao() + " horas\n";

        return super.toString() + "\n" + rotasStr + "\nDuração total do Vôo: " + getDuracao() + " horas";
    }
}





