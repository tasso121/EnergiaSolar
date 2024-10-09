package com.mycompany.EnergiaSolar.src.main.java.poo.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Path;

public abstract class Dados {
	private static BufferedReader leitor;
	private static BufferedWriter escritor;
	private static Path caminho;
	
		
	public static void persistirDados() {
		persistirFabricantes();
		persistirPlacasSolares();
		persistirInversores();
		persistirClientes();
		persistirProjetos();
		persistirOrcamentos();
	}

	public static void carregarDados() {
		carregarFabricantes();
		carregarPlacasSolares();
		carregarInversores();
		carregarClientes();
		carregarProjetos();
		carregarOrcamentos();
	}
	
	private static void persistirFabricantes() {
		
	}
	
	private static void persistirPlacasSolares() {
		
	}
	
	private static void persistirInversores() {
		
	}
	
	private static void persistirClientes() {
		
	}
	
	private static void persistirProjetos() {
		
	}
	
	private static void persistirOrcamentos() {
		
	}
	
	private static void carregarFabricantes() {
		
	}
	
	private static void carregarPlacasSolares() {
		
	}
	
	private static void carregarInversores() {
		
	}
	
	private static void carregarClientes() {
		
	}
	
	private static void carregarProjetos() {
		
	}
	
	private static void carregarOrcamentos() {
		
	}
}
