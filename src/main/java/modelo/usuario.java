package modelo;

public class usuario {
    public Integer id;
    public Integer cc;
    public String nombre;
    public String apellido;
    public String direccion;

//metodo constructor//
    public usuario(Integer id, Integer cc, String nombre, String apellido, String direccion) {
        this.id = id;
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

//metodo guetter and setter//
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    
    
}
