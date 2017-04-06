package lista;

public class ListaDuplamenteEncadeada {

	private Node head;
	private Node tail;
	private int countSize;

	/*
	 * Adiciona no final.
	 */
	public void add(int conteudo) {
		if (this.countSize == 0) {
			this.addInicio(conteudo);
		} else {
			Node novoNo = new Node(conteudo, this.tail, null);
			this.tail.setProximo(novoNo);
			this.tail = novoNo;

			/*
			 * ****Outro mode de fazer.**** Node novoNo = new Node(conteudo,
			 * null, null); this.tail.setProximo(novoNo); Node antigoTail =
			 * this.getNode(countSize - 2); novoNo.setAnterior(antigoTail);
			 * this.tail = novoNo;
			 */
			countSize++;
		}
	}

	/*
	 * Adiciona em posição específica.
	 */
	public void add(int posicao, int conteudo) {
		if (posicao == 0) {
			this.addInicio(conteudo);
		} else if (posicao == this.countSize) {
			this.add(conteudo);
		} else {
			if (posicao > countSize) {
				System.out.println("Posição inválida. Impossível inserir!");
			} else {
				Node anterior = this.getNode(posicao - 1);
				Node proximo = anterior.getProximo();
				Node novoNo = new Node(conteudo, anterior, proximo);
				anterior.setProximo(novoNo);
				proximo.setAnterior(novoNo);
				countSize++;
			}
		}
	}

	public Node getNode(int posicao) {
		Node tempNode = this.head;
		for (int i = 0; i <= posicao; i++) {
			tempNode = tempNode.getProximo();
		}
		return tempNode;
	}

	/*
	 * Adiciona no início.
	 */
	public void addInicio(int conteudo) {
		Node novoNo = new Node(conteudo, null, this.head);
		if (countSize == 0) {
			this.head = novoNo;
			this.tail = novoNo;
		} else {
			this.head.setAnterior(novoNo);
			this.head = novoNo;
		}
		countSize++;
	}

	/*
	 * Remove.
	 */
	public void remove(int posicao) {
		if (posicao == 0) {
			this.removeInicio();
		} else if (posicao == countSize - 1) {
			this.removeFinal();
		} else {
			Node anterior = this.getNode(posicao - 1);
			Node proximo = this.getNode(posicao + 1);
			Node noAApagar = this.getNode(posicao);
			noAApagar.setAnterior(null);
			noAApagar.setProximo(null);
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			countSize--;
		}
	}

	/*
	 * Remove no início.
	 */
	public void removeInicio() {
		if (this.countSize == 0) {
			System.out.println("A lista está vazia!");
		} else {
			Node novoHead = this.head.getProximo();
			this.head.setProximo(null);
			this.head = novoHead;
			novoHead.setAnterior(null);
			countSize--;
			if (countSize == 0) {
				this.tail = null;
			}
		}
	}

	/*
	 * Remove no final.
	 */
	public void removeFinal() {
		if (this.countSize == 0) {
			System.out.println("A lista está vazia!");
		} else {
			Node novoTail = this.tail.getAnterior();
			novoTail.setProximo(null); /* Está certa a ordem ou inverte com a linha debaixo? */
			this.tail.setAnterior(null);
			this.tail = novoTail;
			countSize--;
		}
	}

	public int tamanho() {
		return countSize;
	}
	
	public String toString() {
		Node node = this.head;
		String list = "";
		for (int i = 0; i < countSize; i++) {
			list += node.getConteudo() + " ";
			node = node.getProximo();
		}
		return list;
	}

}
