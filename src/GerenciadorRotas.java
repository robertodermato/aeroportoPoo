import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorRotas {
    private ArrayList<Rota> cadastroRotas;

    public GerenciadorRotas() {
        cadastroRotas = new ArrayList<Rota>();
    }

    public void adicionar(Rota rota) {
        cadastroRotas.add(rota);
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto origem) {
        ArrayList<Rota> rotasComMesmaOrigem = new ArrayList<Rota>();
        for (Rota rota : cadastroRotas) {
            if (rota.getOrigem() == origem) rotasComMesmaOrigem.add(rota);
        }
        return rotasComMesmaOrigem;
    }

    public void ordenaNomeCia() {
        Collections.sort(cadastroRotas);
    }


    public ArrayList<Rota> listarTodas() {
        return cadastroRotas;
    }

    public void ordenaCia() {
        Collections.sort(cadastroRotas, new ComparatorNomeCiaAerea());
            }

    public void ordenaOrigem(){
        Collections.sort(cadastroRotas, new ComparatorNomeAeroportoOrigem());
    }

    public void ordenaOrigemCia(){
        Collections.sort(cadastroRotas, new ComparatorNomeAeroportoOrigemNomeCiaAerea());
    }

    @Override
    public String toString() {
        ordenaNomeCia();
        String ger = "Rotas cadastrados:\n";
        for (Rota rota : cadastroRotas) {
            ger = ger + rota + "\n";
        }
        return ger;
    }
}
