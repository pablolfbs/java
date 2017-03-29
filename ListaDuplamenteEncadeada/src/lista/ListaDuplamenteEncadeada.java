package lista;

public class ListaDuplamenteEncadeada {

	private Node head;
	private Node tail;
	private int countSize;

	/*
	 * Adiciona no final.
	 */
	public void add(Produto conteudo) {
		if (this.countSize == 0) {
			this.addInicio(conteudo);
		} else {
			Node novoNo = new Node(conteudo, null, null);
			this.tail.setProximo(novoNo);
			novoNo.setAnterior(tail);
			this.tail = novoNo;
			
			/* ****Outro mode de fazer.****
			 * Node novoNo = new Node(conteudo, null, null);
			 * this.tail.setProximo(novoNo);
			 * Node antigoTail = this.getNode(countSize - 2);
			 * novoNo.setAnterior(antigoTail);
			 * this.tail = novoNo;
			 */
			countSize++;
		}
	}
	
	/*
	 * Adiciona em posição específica.
	 */
	public void add(int posicao, Produto conteudo) {
		if(posicao == 0) {
			this.addInicio(conteudo);
		} else if(posicao == this.countSize) {
			this.add(conteudo);
		} else {
			Node anterior = this.getNode(posicao - 1);
			Node proximo = this.getNode(posicao + 1);
			Node novoNo = new Node (conteudo, anterior /*<-se colocar esse valor null?*/, proximo);
			anterior.setProximo(novoNo);
			novoNo.setAnterior(anterior);
			novoNo.setProximo(proximo);  /*?*/
			countSize++;
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
	public void addInicio(Produto conteudo) {
		Node novoNo = new Node(conteudo, this.head, this.tail);
		this.head = novoNo;
		if (countSize == 0) {
			this.tail = novoNo;
		}
	}
	
	/*
	 * Remove.
	 */
	public void remove(int posicao) {
		Node anterior = this.getNode(posicao - 1);
		
	}
	
	/*
	 * Remove no início.
	 */
	public void removeInicio() {
		Node novoHead = this.head.getProximo();
		this.head.setProximo(null);
		this.head = novoHead;
		novoHead.setAnterior(null);
		countSize--;
	}
	
	/*
	 * Remove no final.
	 */
	public void removeFinal() {
		Node novoTail = this.tail.getAnterior();
		novoTail.setProximo(null); /*Está certa a ordem ou inverte com a linha debaixo?*/
		this.tail = novoTail;
		countSize--;
	}

	public int tamanho() {
		return countSize;
	}

}
