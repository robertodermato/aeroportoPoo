import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeronaves {

    private ArrayList<Aeronave> cadastroAeronaves;

    public GerenciadorAeronaves() {
        cadastroAeronaves = new ArrayList<Aeronave>();
    }

    public void adicionar(Aeronave aviao) {
        cadastroAeronaves.add(aviao);
    }

    public Aeronave buscarPorCodigo(String codigo) {
        for (Aeronave aviao : cadastroAeronaves) {
            if (aviao.getCodigo().equalsIgnoreCase(codigo)) return aviao;
        }
        return null;
    }

    public void ordenaDescricao() {
        Collections.sort(cadastroAeronaves);
    }


    public ArrayList<Aeronave> listarTodos() {
        return cadastroAeronaves;
    }

    //public ArrayList<Voo> buscarData (LocalDate data){
    //ArrayList<Voo> vooPorData = new ArrayList<>();
    //int k=0;
    //for (int i=0; i<cadastroVoos.size(); i++){
    //if (cadastroVoos.get(i).getLocalDate() = data) {vooPorData.add(k)=cadastroVoos.get(i); k++;}
    //}
    //return vooPorData;
    //}
    // só um comentário
}
