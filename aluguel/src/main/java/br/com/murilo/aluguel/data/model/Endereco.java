package br.com.murilo.aluguel.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "cep", nullable = false, columnDefinition = "int(8)")
	private Integer cep;

	@Column(name = "logradouro", nullable = false, length = 255)
	private String logradouro;

	@Column(name = "complemento", nullable = true, length = 255)
	private String complemento;

	@Column(name = "bairro", nullable = false, length = 255)
	private String bairro;

	@Column(name = "cidade", nullable = false, length = 255)
	private String cidade;

	@Column(name = "estado", nullable = false, length = 2)
	private String estado;

	@Column(name = "numero", nullable = false, columnDefinition = "int(8)")
	private Integer numero;

	public Endereco() {
	}
}