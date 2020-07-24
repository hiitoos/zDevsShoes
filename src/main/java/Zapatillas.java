import java.util.Date;

public class Zapatillas {
    long id_zapatillas;
    String genero;
    String modelo;
    String color;
    float talla;
    float precio;

    public Zapatillas(long id_zapatillas, String genero, String modelo, String color, float talla, float precio) {
        this.id_zapatillas = id_zapatillas;
        this.genero = genero;
        this.modelo = modelo;
        this.color = color;
        this.talla = talla;
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
