package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso js");
		curso1.setDescricao("Descrição curso js");
		curso1.setCargaHoraria(4);
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		
		Dev devCamila = new Dev();
		devCamila.inscreverBootcamp(bootcamp);
		devCamila.setNome("Camila");
		System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluidos());
		
		Dev devArthur = new Dev();
		devArthur.setNome("Arthur Mocelin");
		devArthur.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devArthur.getConteudosInscritos());
		devArthur.progredir();
		System.out.println("Conteudos Concluidos" + devArthur.getConteudosConcluidos());
		
	}
}
