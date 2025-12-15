package esport.ex1;

import jakarta.persistence.*;


@Entity 
@Table(name="deportistas")
public class Atleta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod;
	
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="cod_deporte")
	private Esport codDeporte;
	
	public Atleta() {}
	
	public Atleta(String nombre,Esport codDeporte) {
		this.nombre= nombre;
		this.codDeporte = codDeporte;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCod() {
		return cod;
	}
	
	public int getCodeDeporte() {
		return codDeporte.getCod();
	}
	
	
	public void setNombre(String nom) {
		this.nombre=nom;
	}
	
	public void setCodeDeporte(int code) {
		this.codDeporte.setCod(code);
	}
}