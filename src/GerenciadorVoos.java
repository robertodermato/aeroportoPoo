import java.util.ArrayList;
import java.time.LocalDate;

public class GerenciadorVoos
{
   private ArrayList<Voo> cadastroVoos;
   
   public GerenciadorVoos(){
   cadastroVoos = new ArrayList<Voo>(); 
    }
    
    public void adicionar (Voo voo){
    cadastroVoos.add (voo);
    }
    
    public ArrayList<Voo> listarTodos(){
    return cadastroVoos;
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


