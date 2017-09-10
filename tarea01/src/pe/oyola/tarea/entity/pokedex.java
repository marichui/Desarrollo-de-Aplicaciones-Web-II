package pe.oyola.tarea.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_pokemon")
public class pokedex {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="nombres",nullable=false, length=50)

	private String nombre;
	
	@Column(name="vidas",nullable=false, length=50)

	private int vida;

	
	@Column(name="ataques",nullable=false, length=50)

	private int ataque;
	
	@Column(name="tipos",nullable=false, length=50)

	private String tipo;
	

@Column(name="fecha_capturas")
@Temporal(TemporalType.TIMESTAMP)
private Date fecha_captura;


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getVida() {
	return vida;
}


public void setVida(int vida) {
	this.vida = vida;
}


public int getAtaque() {
	return ataque;
}


public void setAtaque(int ataque) {
	this.ataque = ataque;
}


public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}


public Date getFecha_captura() {
	return fecha_captura;
}


public void setFecha_captura(Date fecha_captura) {
	this.fecha_captura = fecha_captura;
}


}
