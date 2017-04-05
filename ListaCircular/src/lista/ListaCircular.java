package lista;

public class ListaCircular {

	private Node head;
	private Node tail;
	private int countSize;

	/*
	 * Adicionar no início.
	 */
	public void addInicio(Produto conteudo) {
		Node newNode = new Node(conteudo, this.tail, this.head);
		this.head.setAnterior(newNode);
		this.tail.setProximo(newNode);
		this.head = newNode;
		if (countSize == 0) {
			this.tail = newNode;
		}
		countSize++;
	}

	/*
	 * Adicionar no final.
	 */
	public void addFinal(Produto conteudo) {
		if (countSize == 0) {
			this.addInicio(conteudo);
		} else {
			Node newNode = new Node(conteudo, this.tail, this.head);
			this.tail.setProximo(newNode);
			this.head.setAnterior(newNode);
			this.tail = newNode;
			if (countSize == 0) {
				this.head = newNode;
			}
			countSize++;
		}
	}

	/*
	 * Adiciona em posição específica.
	 */
	public void add(int posicao, Produto conteudo) {
		if (posicao == 0) {
			this.addInicio(conteudo);
		} else if (posicao == this.countSize) {
			this.addFinal(conteudo);
		} else {
			Node anterior = this.getNode(posicao - 1);
			Node proximo = anterior.getProximo();
			Node newNode = new Node(conteudo, anterior, proximo);
			anterior.setProximo(newNode);
			proximo.setAnterior(newNode);
			countSize++;
		}
	}

	private Node getNode(int posicao) {
		Node tempNode = this.head;
		for (int i = 0; i <= posicao; i++) {
			tempNode = tempNode.getProximo();
		}
		return tempNode;
	}

	/*
	 * Remover do início.
	 */

	public void removeInicio() {
		if (this.countSize == 0) {
			System.out.println("A lista está vazia!");
		} else {
			Node novoHead = this.head.getProximo();
			this.head.setProximo(null);
			this.head = novoHead;
			novoHead.setAnterior(this.tail);
			this.tail.setProximo(novoHead);
			countSize--;
		}
	}

	/*
	 * Remover do final.
	 */
	public void removeFinal() {
		Node novoTail = this.tail.getAnterior();
		this.tail.setAnterior(null);
		this.tail = novoTail;
		novoTail.setProximo(this.head);
		this.head.setAnterior(novoTail);
		countSize--;
	}

	/*
	 * Remover da posição específica.
	 */
	public void remove(int posicao) {
		if (posicao == 0) {
			this.removeInicio();
		} else if (posicao == countSize - 1) {
			this.removeFinal();
		} else {
			Node removedNode = this.getNode(posicao);
			Node anterior = removedNode.getAnterior();
			Node proximo = removedNode.getProximo();
			removedNode.setAnterior(null);
			removedNode.setProximo(null);
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			countSize--;
		}
	}
}
