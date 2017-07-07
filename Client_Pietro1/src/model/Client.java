package model;

/**
 * Cliente.
 */
public class Client {

	/** Nome do cliente. */
	private String name;

	/** CPF do cliente. */
	private String cpf;

	/** Data de nascimento do cliente. */
	private String birthday;

	/**
	 * Construtor.
	 * 
	 * @param name
	 *            Nome.
	 * @param cpf
	 *            CPF.
	 * @param birthday
	 *            Data de nascimento.
	 */
	public Client(String name, String cpf, String birthday) {
		this.name = name;
		this.cpf = cpf;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

}
