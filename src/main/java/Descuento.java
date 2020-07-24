import java.util.Date;

public class Descuento {
    private long id_descuentos;
    private Date fecha_inicio;
    private Date fecha_final;
    private float porcentaje;
    private String descripcion;

    public Descuento() {
    }

    public Descuento(Date fecha_inicio, Date fecha_final, float porcentaje, String descripcion) {
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
    }

    public long getId_descuentos() {
        return id_descuentos;
    }

    public void setId_descuentos(long id_descuentos) {
        this.id_descuentos = id_descuentos;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id_descuentos=" + id_descuentos +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_final=" + fecha_final +
                ", porcentaje=" + porcentaje +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
