package objects;

public class Zapatillas {
    private long id_zapatillas;
    private String genero;
    private String modelo;
    private String color;
    private float talla;
    private float precio;

    public Zapatillas(long id_zapatillas, String genero, String modelo, String color, float talla, float precio) {
        setId_zapatillas(id_zapatillas);
        setGenero(genero);
        setModelo(modelo);
        setColor(color);
        setTalla(talla);
        setPrecio(precio);
    }

    public Zapatillas(){

    }

    public long getId_zapatillas() {
        return id_zapatillas;
    }

    public void setId_zapatillas(long id_zapatillas) {
        this.id_zapatillas = id_zapatillas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Genero:'" + genero + '\'' +
                ", modelo:'" + modelo + '\'' +
                ", color:'" + color + '\'' +
                ", talla:" + talla +
                ", precio:" + precio +
                '}';
    }
}
