import java.util.Date;

public class Cliente {
    private long id_Clientes;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private int telefono;
    private Date fecha_nacimiento;

    public Cliente(long id_Clientes, String nombre, String apellido1, String apellido2, String email, int telefono, Date fecha_nacimiento) {
        setId_Clientes(id_Clientes);
        setNombre(nombre);
        setApellido1(apellido1);
        setApellido2(apellido2);
        setEmail(email);
        setTelefono(telefono);
        setFecha_nacimiento(fecha_nacimiento);
    }

    public void setId_Clientes(long id_Clientes) {
        this.id_Clientes = id_Clientes;
    }
    public long getId_Clientes() {
        return id_Clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
