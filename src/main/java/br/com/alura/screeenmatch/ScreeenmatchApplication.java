package br.com.alura.screeenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.model.DadosSerie;
import br.com.alura.service.ConsumoApi;
import br.com.alura.service.ConverteDados;

@SpringBootApplication
public class ScreeenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreeenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		ConsumoApi consumoapi = new ConsumoApi();
		
		String json = consumoapi.obterDados("https://www.omdbapi.com/?t=simpsons&apikey=6585022c");
		//String json2 = consumoapi.obterDados("https://coffee.alexflipnote.dev/random.json");
		
		ConverteDados conversor = new ConverteDados();
		
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		
		System.out.println(dados);
		//System.out.println(json2);
		
	}

}
