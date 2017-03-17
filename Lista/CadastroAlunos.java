import java.util.Scanner;

public class CadastroAlunos {
	public static int opcao;
	public static Aluno[] listaA;

	public static void main(String[] args) {
		listaA = new Aluno[10];

		do {

			opcao = opcaoMenuPrincipal();
			switch (opcao) {
			case 1:
				listarAlunos();

				break;
			case 2:
				inserirAluno();
				break;
			case 3:
				localizarAluno();
				break;
			default:
				System.out.println("Opção Inválida !!!");
			}
		} while (opcao != -1);
		System.out.println("FIM !!!");
	}

	private static void inserirAluno() {
		String nome, endereco, dataNascimento, curso;
		int semestre;

		if (listaNaoEstaCheia()) {
			Scanner scanner = new Scanner(System.in);

			System.out.println();
			System.out.println("Digite o nome: ");
			nome = scanner.nextLine();
			System.out.println("Digite o endereco: ");
			endereco = scanner.nextLine();
			System.out.println("Digite o dataNascimento: ");
			dataNascimento = scanner.nextLine();
			System.out.println("Digite o Curso: ");
			curso = scanner.nextLine();
			System.out.println("Digite o semestre: ");
			semestre = scanner.nextInt();

			Aluno a = new Aluno(nome, endereco, dataNascimento, curso, semestre);
			insereAlunoPosicaoLivre(a);
			System.out.println("Aluno Inserido com Sucesso;");
		}

	}

	private static void insereAlunoPosicaoLivre(Aluno a) {
		if (listaNaoEstaCheia()) {
			int posicao_livre = -1;
			for (int i = 0; i < listaA.length; i++) {
				if (listaA[i] == null) {
					posicao_livre = i;
				}
			}
			listaA[posicao_livre] = a;
		} else {
			System.out.println("Lista Cheia !!");
		}
	}

	private static boolean listaNaoEstaCheia() {
		for (int i = 0; i < listaA.length; i++) {
			if (listaA[i] == null) {
				return true;
			}
		}
		return false;
	}

	private static void localizarAluno() {
		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("Digite o nome: ");
		String nome = scanner.nextLine();

		if (listaVazia()) {
			System.out.println("Lista Vazia !!!Não tem ninguem aqui!!");
		} else {
			int i = posicaoAluno(nome);
			if (i != -1) {
				System.out.println("Aluno Existe !! Esta na posicao " + i);
			} else {
				System.out.println("Aluno não encontrado !!");
			}
		}
	}

	private static boolean listaVazia() {
		for (int i = 0; i < listaA.length; i++) {
			if (listaA[i] != null) {
				return false;
			}
		}
		return true;
	}

	private static int posicaoAluno(String nome) {
		for (int i = 0; i < listaA.length; i++) {
			if (listaA[i] != null) {
				if (listaA[i].getNome().equals(nome)) {
					return i;
				}
			}
		}

		return -1;
	}

	private static void listarAlunos() {
		boolean esta_vazia = true;

		for (int i = 0; i < listaA.length; i++) {
			if (listaA[i] == null) {

			} else {
				esta_vazia = false;
				System.out.println(i + " - " + listaA[i].getNome());
			}
		}
		if (esta_vazia) {
			System.out.println("Lista Vazia!!");
		}
	}

	private static int opcaoMenuPrincipal() {		
		System.out.println("####MENU PRINCIPAL DO PROGRAMA###");
		System.out.println("#################################");
		System.out.println("#####B E M  V I N D O	! !#######");
		System.out.println("#################################");
		System.out.println("#################################");
		System.out.println("");
		System.out.println("1 - LISTAR AGENDA;");
		System.out.println("2 - INSERIR NOVO CONTATO;");
		System.out.println("3 - LOCALIZAR NOVO CONTATO;");
		System.out.println("#(para sair digite um número negativo)#");
		System.out.println("#################################");
		System.out.println("Opção Desejada: ");

		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		return opcao;
	}
}
