package br.com.alura.service;

public interface iConverteDados {
	<T> T obterDados(String json, Class<T> classe);
}
