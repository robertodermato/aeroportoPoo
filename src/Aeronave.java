public class Aeronave implements Contavel, Comparable<Aeronave>{
    private String codigo;
    private String descricao;
    private static int totalAeronaves=0;

    public Aeronave(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        totalAeronaves++;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString(){
        return descricao + "("+codigo+")";
    }

    @Override
    public int getTotal() {
        return totalAeronaves;
    }

    @Override
    public int compareTo(Aeronave outra) {
        return descricao.compareTo(outra.descricao);
    }
}
