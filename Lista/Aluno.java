
public class Aluno extends Pessoa {
	private String curso;
	private int semestre;

	public Aluno(String nome, String endereco, String dataNascimento, String curso, int semestre) {
		super(nome, endereco, dataNascimento);
		this.curso = curso;
		this.semestre = semestre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
}
