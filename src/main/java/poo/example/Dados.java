package poo.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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
		List<Fabricante> fabricantes = AplicacaoService.getFabricantes();
		
		caminho = Paths.get("/EnergiaSolar/src/main/java/arquivos/Fabricantes.txt");
		
		try {
			escritor = Files.newBufferedWriter(caminho);
			
			for(Fabricante fabricante : fabricantes) {
				escritor.write(fabricante.getNome());
			}
			
			escritor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao persistir os Fabricantes em arquivo.");
		}
	}
	
	private static void persistirPlacasSolares() {
		List<Equipamento> equipamentos = AplicacaoService.getEquipamentos();
		
		caminho = Paths.get("/EnergiaSolar/src/main/java/arquivos/PlacasSolares.txt");
		
		try {
			escritor = Files.newBufferedWriter(caminho);
			
			for(Equipamento equipamento : equipamentos) {
				if(equipamento instanceof PlacaSolar)
					escritor.write(equipamento.obterInformacoes());
			}
			
			escritor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao persistir as Placas Solares em arquivo.");
		}
	}
	
	private static void persistirInversores() {
		List<Equipamento> equipamentos = AplicacaoService.getEquipamentos();
		
		caminho = Paths.get("/EnergiaSolar/src/main/java/arquivos/Inversores.txt");
		
		try {
			escritor = Files.newBufferedWriter(caminho);
			
			for(Equipamento equipamento : equipamentos) {
				if(equipamento instanceof Inversor)
					escritor.write(equipamento.obterInformacoes());
			}
			
			escritor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao persistir os Inversores em arquivo.");
		}
	}
	
	private static void persistirClientes() {
		List<Cliente> clientes = AplicacaoService.getClientes();
		
		caminho = Paths.get("/EnergiaSolar/src/main/java/arquivos/Clientes.txt");
		
		try {
			escritor = Files.newBufferedWriter(caminho);
			
			for(Cliente cliente : clientes) {
				escritor.write(cliente.obterInformacoes());
			}
			
			escritor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao persistir os Clientes em arquivo.");
		}
	}
	
	private static void persistirProjetos() {
		List<Projeto> projetos = AplicacaoService.getProjetos();
		
		caminho = Paths.get("/EnergiaSolar/src/main/java/arquivos/Projetos.txt");
		
		try {
			escritor = Files.newBufferedWriter(caminho);
			
			for(Projeto projeto : projetos) {
				escritor.write(projeto.obterInformacoes());
			}
			
			escritor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao persistir os Projetos em arquivo.");
		}
	}
	
	private static void persistirOrcamentos() {
		List<Orcamento> orcamentos = AplicacaoService.getOrcamentos();
		
		caminho = Paths.get("/EnergiaSolar/src/main/java/arquivos/Orcamentos.txt");
		
		try {
			escritor = Files.newBufferedWriter(caminho);
			
			for(Orcamento orcamento : orcamentos) {
				escritor.write(orcamento.obterInformacoes());
			}
			
			escritor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao persistir os Orçamentos em arquivo.");
		}
	}
	
	private static void carregarFabricantes() {
		String linha;
		caminho = Paths.get("/EnergiaSolar/src/main/java/arquivos/Fabricantes.txt");
		
		try {
			leitor = Files.newBufferedReader(caminho);
			
			while((linha = leitor.readLine()) != null)
				AplicacaoService.cadastrarFabricante(linha);
			
			leitor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao carregar os registros de Fabricantes");
		}
	}
	
	private static void carregarPlacasSolares() {
		Fabricante fabricante;
		String linha;
		String[] dados;
		caminho = Paths.get("/EnergiaSolar/src/main/java/arquivos/PlacasSolares.txt");
		
		try {
			leitor = Files.newBufferedReader(caminho);
			
			while((linha = leitor.readLine()) != null) {
				dados = linha.split(";");
				fabricante = AplicacaoService.obterFabricante(dados[2]);
				
				AplicacaoService.cadastrarPlacaSolar(
						dados[0],
						Float.valueOf(dados[1]),
						fabricante,
						Float.valueOf(dados[3])
				);
			}
			
			leitor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao carregar os registros de Placas Solares");
		}
	}
	
	private static void carregarInversores() {
		Fabricante fabricante;
		String linha;
		String[] dados;
		caminho = Paths.get("/EnergiaSolar/src/main/java/arquivos/Inversores.txt");
		
		try {
			leitor = Files.newBufferedReader(caminho);
			
			while((linha = leitor.readLine()) != null) {
				dados = linha.split(";");
				fabricante = AplicacaoService.obterFabricante(dados[2]);
				
				AplicacaoService.cadastrarInversor(
						dados[0],
						Float.valueOf(dados[1]),
						fabricante,
						Float.valueOf(dados[3])
				);
			}
			
			leitor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao carregar os registros de Inversores");
		}
	}
	
	private static void carregarClientes() {
		Cliente cliente;
		String linha;
		String dados[];
		caminho = Paths.get("/EnergiaSolar/src/main/java/arquivos/Clientes.txt");
		
		try {
			leitor = Files.newBufferedReader(caminho);
			
			while((linha = leitor.readLine()) != null) {
				dados = linha.split(";");
				
				cliente = AplicacaoService.cadastrarCliente(dados[0], dados[1], dados[2], dados[3]);
				
				for(int i = 4; i < dados.length; i++)
					cliente.adicionarNotificacao(dados[i]);
			}
			
			leitor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao carregar os registros de Inversores");
		}
	}
	
	private static void carregarProjetos() {
		Cliente cliente;
		Projeto projeto;
		PlacaSolar painel;
		Inversor inversor;
		String linha;
		String dados[];
		caminho = Paths.get("/EnergiaSolar/src/main/java/arquivos/Projetos.txt");
		
		try {
			leitor = Files.newBufferedReader(caminho);
			
			while((linha = leitor.readLine()) != null) {
				dados = linha.split(";");
				
				cliente = AplicacaoService.obterCliente(dados[0]);
				projeto = cliente.solicitarProjeto(Float.valueOf(dados[5]));
				painel = (PlacaSolar)AplicacaoService.obterEquipamento(dados[1]);
				inversor = (Inversor)AplicacaoService.obterEquipamento(dados[2]);
				
				projeto.setPainel(painel);
				projeto.setInversor(inversor);
				projeto.setQtdPaineis(Integer.valueOf(dados[3]));
				projeto.setQtdInversores(Integer.valueOf(dados[4]));
			}
			
			leitor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao carregar os registros de Projetos");
		}
	}
	
	private static void carregarOrcamentos() {
		Projeto projeto;
		Cliente cliente;
		Orcamento orcamento;
		String linha;
		String dados[];
		caminho = Paths.get("/EnergiaSolar/src/main/java/arquivos/Orcamentos.txt");
		
		try {
			leitor = Files.newBufferedReader(caminho);
			
			while((linha = leitor.readLine()) != null) {
				dados = linha.split(";");
				
				projeto = AplicacaoService.obterProjeto(Integer.valueOf(dados[2]));
				cliente = projeto.getCliente();
				
				orcamento = AplicacaoService.enviarOrcamento(cliente, projeto, Float.valueOf(dados[0]));
				
				if(dados[1].equalsIgnoreCase("APROVADO"))
					orcamento.setStatus(StatusOrcamento.APROVADO);
				else if(dados[1].equalsIgnoreCase("REPROVADO"))
					orcamento.setStatus(StatusOrcamento.REPROVADO);
				else if(dados[1].equalsIgnoreCase("PENDENTE"))
					orcamento.setStatus(StatusOrcamento.PENDENTE);
			}
			
			leitor.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao carregar os registros de Orçamentos");
		}
	}
}
