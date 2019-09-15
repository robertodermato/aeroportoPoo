import java.util.Comparator;

public class ComparatorNomeAeroportoOrigemNomeCiaAerea implements Comparator<Rota> {

    @Override
    public int compare(Rota rota1, Rota rota2) {
        int aeroporto =  rota1.getOrigem().getNome().compareTo(rota2.getOrigem().getNome());
        int nomeCia = rota1.getCia().getNome().compareTo(rota2.getCia().getNome());
        if (aeroporto!=0) return aeroporto;
        else return nomeCia;
    }

}
