import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;

public class VooVariasEscalas extends Voo {

    private ArrayList<Rota> rotas;

    public VooVariasEscalas (Rota r1, LocalDateTime dh, Duration dur){
        super (r1, dh, dur);
        rotas  = new ArrayList<Rota>();
    }
}
