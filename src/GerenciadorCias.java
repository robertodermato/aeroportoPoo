    import java.io.IOException;
    import java.nio.charset.Charset;
    import java.nio.file.Files;
    import java.nio.file.Path;
    import java.nio.file.Paths;
    import java.util.ArrayList;
    import java.util.Comparator;
    import java.util.Scanner;

    public class GerenciadorCias {
        private ArrayList<CiaAerea> empresas;

        public GerenciadorCias() {
            empresas = new ArrayList<CiaAerea>();
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

        //public ArrayList<CiaAerea> listarTodas(){
        //    ArrayList<CiaAerea> aux = new ArrayList<CiaAerea>();
        //    for (int pos=0; pos < empresas.size(); pos++){
        //        aux.add(empresas.get(pos));
        //    }
        //    return aux;
        //}
        
        public ArrayList<CiaAerea> listarTodas(){
        ArrayList<CiaAerea> aux = new ArrayList<CiaAerea>();
            for (CiaAerea cia: empresas){
            aux.add(cia);
            }
            return aux;
        }

        public void carregaDados() throws IOException {
            Path pathAirlines = Paths.get("airlines.dat");
            try (Scanner sc = new Scanner(Files.newBufferedReader(pathAirlines.getFileName(), Charset.forName("utf8")))) {
                sc.useDelimiter("[;\n]"); // separadores: ; e nova linha
                String header = sc.nextLine(); // pula cabeçalho
                String id, nome;
                while (sc.hasNext()) {
                    id = sc.next();
                    nome = sc.next();
                    System.out.format("%s - %s%n", id, nome);
                }
            }
            catch (IOException x) {
                System.err.format("Erro de E/S: %s%n", x);
            }
        }

        public String toString(){
            String ger = "Cias cadastradas:\n";
            for (CiaAerea cia: empresas){
                ger = ger + cia + "\n";
            }
            return ger;
        }

    }


