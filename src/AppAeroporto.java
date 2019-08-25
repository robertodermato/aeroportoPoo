public class AppAeroporto {

    public static void main(String[] args) {


        System.out.println("MyFlight project...");

        GerenciadorCias cias = new GerenciadorCias();
        CiaAerea c1  = new CiaAerea ("JJ", "LATAM");
        CiaAerea c2  = new CiaAerea ("G3", "Gol");
        CiaAerea c3  = new CiaAerea ("TP", "Tap");

        cias.inserir(c1);
        cias.inserir(c2);
        cias.inserir(c3);

        for (CiaAerea c: cias.getCias()){
            System.out.print(c);
        }

        /*System.out.print("Código c1: " + c1.getCodigo());
        System.out.print("Nome c2: " + c2.getNome());
        System.out.print("c3: " + c3.toString());*/

    }

}
