package org.generation.farmacia.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Transformando em Tabela
@Table(name = "tb_produto") // Nomeando Tabela
public class Produto {

	@Id // Informa que é Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto_increment
	private Long id;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	@NotNull
	@Size(min = 5, max = 1000) // Tamanho mínimo e máximo do campo
	private String nome;

	@NotNull
	private float preco;

	@NotNull
	private int quantidade;

	@UpdateTimestamp
	private LocalDateTime dataFabricacao; // Importa data e hora

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDateTime getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDateTime dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
