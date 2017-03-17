package lista;

public class ListaEncadeada {

	private Node primeiro;
	private Node ultimo;
	private int countSize;

	// Adiciona no final.
	public void add(Produto conteudo) {
		if (this.countSize == 0) {
			this.addIn�cio(conteudo);
		} else {
			Node novoNo = new Node(conteudo, null);
			this.ultimo.setProximo(novoNo);
			this.ultimo = novoNo;
			this.countSize++;
		}
		
	}

	// Adiciona em posi��o espec�fica.
	public void add(int posicao, Produto conteudo) {
		if (posicao == 0) {
			this.addIn�cio(conteudo);
		} else if (posicao == this.countSize - 1) {
			this.add(conteudo);
		} else {
			Node anterior = this.getNode(posicao - 1);
			Node novo = new Node(conteudo, anterior.getProximo());
			anterior.setProximo(novo);
			this.countSize++;
		}
	}

	public Node getNode(int posicao) {
		Node tempNode = this.primeiro;
		for (int i = 0; i <= posicao; i++) {
			tempNode = tempNode.getProximo();
		}
		return tempNode;
	}

	// Adiciona no in�cio.
	public void addIn�cio(Produto conteudo) {
		Node no = new Node(conteudo, this.primeiro);
		this.primeiro = no;
		if (this.countSize == 0) {
			this.ultimo = no;
		}
		countSize++;
	}

	public void remove(int posicao) {
		Node proximo = this.getNode(posicao + 1);
		Node anterior = this.getNode(posicao - 1);
		anterior.getProximo().setProximo(null);
		anterior.setProximo(proximo);
		countSize--;
	}

	public void removeInicio() {
		Node segundo = this.primeiro.getProximo();
		this.primeiro.setProximo(null);
		this.primeiro = segundo;
		countSize--;
	}

	public void removeFinal() {
		Node penultimo = this.getNode(countSize - 2);
		this.ultimo = penultimo;
		this.ultimo.setProximo(null);
		countSize--;
	}

	public void trocar(int posAtual, int posFinal) {

	}

	public int tamanho() {
		return countSize;
	}

	public String toString() {
		String string;
		Node nodeForPrint = this.primeiro;
		for (int i = 0; i <= tamanho(); i++) {
			string = nodeForPrint.getConteudo().getNome() + " ";
			nodeForPrint = nodeForPrint.getProximo();
		}
		string = "coisa";
		return string;
	}

}
