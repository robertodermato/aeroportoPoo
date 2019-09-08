import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;

//classe inutilizada

public class VooVariasEscalas {

    private ArrayList<Rota> rotas;

    public VooVariasEscalas (LocalDateTime dh){
        //super (dh);
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
