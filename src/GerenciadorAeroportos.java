import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> cadastroAeroportos;

    public GerenciadorAeroportos() {
        cadastroAeroportos = new ArrayList<Aeroporto>();
    }

    public void adicionar(Aeroporto aero) {
        cadastroAeroportos.add(aero);
    }

    public Aeroporto buscarPorCodigo(String codigo) {
        for (Aeroporto aero : cadastroAeroportos) {
            if (aero.getCodigo().equalsIgnoreCase(codigo)) return aero;
        }
        return null;
    }

    public void ordenaNome() {
        Collections.sort(cadastroAeroportos);
    }


    public ArrayList<Aeroporto> listarTodos() {
        return cadastroAeroportos;
    }

    @Override
    public String toString(){
        ordenaNome();
        String ger = "Aeroportos cadastrados:\n";
        for (Aeroporto aero: cadastroAeroportos){
            ger = ger + aero + "\n";
        }
        return ger;
    }
}
