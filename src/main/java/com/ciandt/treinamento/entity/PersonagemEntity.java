package com.ciandt.treinamento.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonagemEntity implements Serializable {

	private static final long serialVersionUID = -7459517139531959528L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long identificador;

	private String nome;

	private String descricao;

	private String imagem;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "personagem")
	private List<RevistaEntity> revistas;

}
