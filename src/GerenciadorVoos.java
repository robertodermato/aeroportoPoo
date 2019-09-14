import java.util.ArrayList;
import java.time.LocalDateTime;

public class GerenciadorVoos {
    private ArrayList<Voo> cadastroVoos;

    public GerenciadorVoos() {
        cadastroVoos = new ArrayList<Voo>();
    }

    public void adicionar(Voo voo) {
        cadastroVoos.add(voo);
    }

    public ArrayList<Voo> listarTodos() {
        return cadastroVoos;
    }

    public ArrayList<Voo> buscarData(LocalDateTime data) {
        ArrayList<Voo> vooPorData = new ArrayList<Voo>();
        for (Voo voo : cadastroVoos) {
            if (voo.getDatahora() == data) {
                vooPorData.add(voo);
            }
        }
        return vooPorData;
    }

    public String toString(){
        String ger = "Voos cadastrados:\n";
        for (Voo voo: cadastroVoos){
            ger = ger + voo + "\n";
        }
        return ger;
    }


}


