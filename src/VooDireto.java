//import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends Voo {

    //private Duration duracao;
    private Rota rota;

    public VooDireto (LocalDateTime dh, Rota rota){
        super (dh);
        this.rota = rota;
    }

    // Exercicio 1 de interface
    public VooDireto (double duracao, LocalDateTime dh, Rota rota){
        super (rota, dh, duracao);
        this.rota=rota;
            }
    // Exercicio 1 de interface
    public VooDireto (double duracao, Rota rota){
        super (rota, duracao);
        this.rota=rota;
            }

    public Rota getRota(){
        return rota;
    }

    public double getDuracao(){
        return 0.5 + rota.getDuracao();
    }

    @Override
    public String toString(){
        return super.toString() + "\nRota: " + rota + "\nDuração: " + getDuracao() + " horas";
    }
}
