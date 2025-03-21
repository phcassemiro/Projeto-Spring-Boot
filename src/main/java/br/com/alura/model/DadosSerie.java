package br.com.alura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(
		@JsonAlias({"Title","Titulo"})  String titutlo,
		@JsonAlias({"totalSeasons"})Integer totalTemporadas,
		@JsonAlias({"imdbRating"})String avaliacao) {
	
}
