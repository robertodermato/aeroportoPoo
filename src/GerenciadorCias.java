    import java.util.ArrayList;

    public class GerenciadorCias {
        private ArrayList<CiaAerea> empresas;

        public GerenciadorCias() {
            empresas = new ArrayList<>();
        }

        public void inserir (CiaAerea cia){
            empresas.add(cia);
        }

        public void inserir (String codigo, String nome){
            empresas.add(new CiaAerea(codigo, nome));
        }

        public ArrayList<CiaAerea> getCias(){
            return empresas;
        }

        public CiaAerea pesquisar(String codigo){
            for (CiaAerea cia: empresas){
                if (cia.getCodigo().compareTo(codigo)==0){
                    return cia;
                }
            }
            return null;
        }

        public ArrayList<CiaAerea> listarTodas(){
            ArrayList<CiaAerea> aux = new ArrayList<CiaAerea>();
            for (int pos=0; pos < empresas.size(); pos++){
                aux.add(empresas.get(pos));
            }
            return aux;
        }
        
        //public ArrayList<CiaAerea> listarTodas(){
        //ArrayList<CiaAerea> aux = new ArrayList<CiaAerea>();
        //    for (CiaAerea cia: empresas){
        //    aux.add(cia);
        //    }
        //    return aux;
        //}

        public ArrayList<CiaAerea> listarTodas(){
          return new ArrayList<>(empresas);
        }
    }


