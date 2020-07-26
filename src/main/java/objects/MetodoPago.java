package objects;

public class MetodoPago {
    private long idMetodo;
    private String tipo;

    //Constructor
    public MetodoPago(long idMetodo, String tipo) {
        setIdMetodo(idMetodo);
        setTipo(tipo);
    }

    public MetodoPago() {
    }

    //Getters & setters
    public long getIdMetodo() {
        return idMetodo;
    }

    public void setIdMetodo(long idMetodo) {
        this.idMetodo = idMetodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "metodoPago{" +
                "idMetodo=" + idMetodo +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}