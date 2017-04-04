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
		if(posicao == 0) {
			this.addInicio(conteudo);
		} else if (posicao == this.countSize) {
			this.addFinal(conteudo);
		} else {
			Node anterior = this.getNode(posicao - 1);
			Node proximo = this.getNode(posicao + 1);
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
	
	public void remove() {
		
	}
	
	/*
	 * Remover do final.
	 */
	
	/*
	 * Remover da posição específica.
	 */
}
