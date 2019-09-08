import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo {

    private ArrayList<Rota> rotas;

    public VooEscalas (Rota r1, LocalDateTime dh, Duration dur){
        super (r1, dh, dur);
        rotas  = new ArrayList<Rota>();
    }

    public boolean addRota (Rota escala){
        return rotas.add(escala);
    }

    @Override
    public String toString(){
        String rotasStr = "";
        for (Rota escala: rotas) rotasStr = rotasStr + " " + escala;

        return super.toString() + "Escalas: " + rotasStr;
    }
}


