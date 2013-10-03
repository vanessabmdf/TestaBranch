import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;



public class Main {

	public static ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		for (int i=0; i<3;i++){
			cadastra();
		}
		
		mostrarTodos();
		
		System.out.println("Qual pessoa deseja excluir ?");
		String nomeDoExcluso = leitor.nextLine();
		
		excluir(nomeDoExcluso);
		
		mostrarTodos();
	}
	
	private static void cadastra() {
		String nome = leitor.nextLine();
		int idade = Integer.parseInt(leitor.nextLine());
		String sexo = leitor.nextLine();
		
		Pessoa novaPessoa = new Pessoa(nome, idade, sexo);
		listaDePessoas.add(novaPessoa);
	}

	private static void mostrarTodos(){
		Iterator<Pessoa> percorre = listaDePessoas.iterator();
		
		while(percorre.hasNext()){
			System.out.println(percorre.next().nome);
		}
	}
	
	private static void excluir(String nome){
		Iterator<Pessoa> percorre = listaDePessoas.iterator();
		
		while(percorre.hasNext()){
			if (nome == percorre.next().nome){
				listaDePessoas.remove(percorre.next());
			}
		}
	}
}
