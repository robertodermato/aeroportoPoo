import java.time.Duration;
import java.time.LocalDateTime;

//A Classe Voo é abstrata, ou seja, não pode-se criar objetos do tipo dela,
// mas pode-se fazer como é feito na App chmar de forma estática a classe
// e criar de forma dinâmica uma instanceof VooVariasEscalas
public abstract class Voo {

    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

    private LocalDateTime datahora;
    // private Duration duracao; - será calculado
    private Rota rota; //não é mais útil nessa classe
    private Status status;
    private double duracao;

    public Voo(LocalDateTime datahora) {
        //this.rota = rota;
        this.datahora = datahora;
        //this.duracao = duracao;
        this.status = Status.CONFIRMADO; // default é confirmado
    }

    public Voo(Rota r1, LocalDateTime datahora, double dur) {
        //this.rota = rota;
        this.datahora = datahora;
        //this.duracao = duracao;
        this.status = Status.CONFIRMADO; // default é confirmado
        this.rota = r1;
        this.duracao = dur;
    }

    public Voo(Rota r1, double dur) {
        this.status = Status.CONFIRMADO; // default é confirmado
        this.rota = r1;
        this.duracao = dur;
        this.datahora = LocalDateTime.of(2016, 8, 12, 12, 00);
    }

    public abstract Rota getRota();

    // método removido, pois não é mais util aqui
    //public Rota getRota() {
    //    return rota;
    //}

    public LocalDateTime getDatahora() {
        return datahora;
    }

    //public abstract Duration getDuracao();

    // método removido, pois não é mais util aqui, pois será calculado
    //public Duration getDuracao() {
    //    return duracao;
    //}

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status novo) {
        this.status = novo;
    }

    @Override
    public String toString(){
        return "Data: " + datahora + "\nStatus: " + status;
    }
}
