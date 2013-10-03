import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		for (int i=0; i<3;i++){
			cadastra();
		}
	}
	
	private static void cadastra() {
		String nome = leitor.nextLine();
		int idade = Integer.parseInt(leitor.nextLine());
		String sexo = leitor.nextLine();
		
		Pessoa novaPessoa = new Pessoa(nome, idade, sexo);
		listaDePessoas.add(novaPessoa);
	}

}
