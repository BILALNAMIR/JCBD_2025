package esport.ex1;

import jakarta.persistence.*;

@Entity
@Table(name="deportes")
public class Esport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod;
	
	@Column(name="nombre")
	private String nombre;

    public Esport() {}

    public Esport(String nombre) {
        this.nombre = nombre;
    }

    public Esport(int cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return cod + " - " + nombre;
    }
}
