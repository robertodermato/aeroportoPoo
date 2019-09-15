import java.util.Comparator;

public class ComparatorNomeCiaAerea implements Comparator<Rota> {

    @Override
    public int compare(Rota rota1, Rota rota2) {
        return rota1.getCia().getNome().compareTo(rota2.getCia().getNome());
    }

}
