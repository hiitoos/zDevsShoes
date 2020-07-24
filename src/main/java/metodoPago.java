public class metodoPago {
    private long idMetodo;
    private String tipo;

    //Constructor
    public metodoPago(String tipo) {
        this.tipo = tipo;
    }

    public metodoPago() {
    }
    //Getters & setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getIdMetodo() {
        return idMetodo;
    }

    @Override
    public String toString() {
        return "metodoPago{" +
                "idMetodo=" + idMetodo +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}