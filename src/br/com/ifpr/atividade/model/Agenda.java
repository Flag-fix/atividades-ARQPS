package br.com.ifpr.atividade.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	
		 
	ArrayList<Contato> ctt = new ArrayList<Contato>();
	/// Métodos
	public void inserir(String nome, String numero, String email){
		Contato c = new Contato();
		c.setNome(nome);
		c.setEmail(email);
		c.setNumero(numero);
		ctt.add(c);
		}
	
	public List<Contato> buscarPorNome(String nome){
		for(Contato contat : ctt){
			if(nome.equalsIgnoreCase(contat.getNome())) {
				System.out.println("Bracatinga Carai");
				System.out.println(contat.getNome());
				System.out.println(nome);
			}
		}
		System.out.println(ctt);
		return ctt;
	}
	
	public void removerContato(String nome){
		for(Contato contat : ctt){
			if(nome.equalsIgnoreCase(contat.getNome())) {
				System.out.println("Removendo ...");
				ctt.remove(contat);
				System.out.println(contat.getNome());
			}
		}
	}
	
	
}
