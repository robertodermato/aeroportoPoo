import java.util.Comparator;

public class ComparatorNomeAeroportoOrigem implements Comparator<Rota> {
    @Override
    public int compare(Rota rota1, Rota rota2) {
        return rota1.getOrigem().getNome().compareTo(rota2.getOrigem().getNome());
    }
}
