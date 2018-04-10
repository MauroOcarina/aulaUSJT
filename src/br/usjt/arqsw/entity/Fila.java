package br.usjt.arqsw.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 * 
 * @author Mauro de Melo Pires - 816125689 - SIN3AN-MCA1
 *
 */
@Entity
@Table
public class Fila implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="id_fila")
	//@NotNull(message="A fila não pode ser vazia")
	@Min(value=1, message="A fila não pode ser vazia")
	@Id
	@GeneratedValue
	private int id;
	
	//@NotNull
	@Size(min=5, max=45, message="O nome da fila deve estar entre 5 e 45 caracteres.")
	@Column(name="nm_fila")
	private String nome;
	
	//@Max(value=256)
	@Column(name="imagem")
	private String imagem;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	@Override
	public String toString() {
		return "Fila [id=" + id + ", nome=" + nome + "]";
	}
	
}