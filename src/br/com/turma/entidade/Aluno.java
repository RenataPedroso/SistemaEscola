package br.com.turma.entidade;

public class Aluno {

	//Construtor da classe
	public Aluno(String nome, double prim, double seg, double ter, double qua) {
		this.nome = nome;
		this.prim = prim;
		this.seg = seg;
		this.ter = ter;
		this.qua = qua;
		this.media = this.calcularMedia();
		this.statusFinal = this.verificarStatus();
	}
	
	
	public Aluno() {
	}


	//Propriedades e/ou atributos
	private int codigo;
	private String nome;
	private double prim;
	private double seg;
	private double ter;
	private double qua;
	private double media;
	private String statusFinal;
	
	//Método para calcular média
	public double calcularMedia() {
		return (this.prim + this.seg + this.ter + this.qua)/2;
	}
	
	//Método para calcular o status do aluno
	public String verificarStatus() {
		if (this.media >=7 && this.media <=10) {
			return "APROVADO";
		} else if (this.media >=5 && this.media <7){
			return "RECUPERAÇÃO";
		} else if (this.media >=0 && this.media <5) {
			return "REPROVADO";
		} else {
			return "NOTA INVÁLIDA";
		}
	}

	//Getters
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPrim() {
		return prim;
	}

	public double getSeg() {
		return seg;
	}

	public double getTer() {
		return ter;
	}

	public double getQua() {
		return qua;
	}

	public double getMedia() {
		return media;
	}

	public String getStatusFinal() {
		return statusFinal;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPrim(double prim) {
		this.prim = prim;
	}

	public void setSeg(double seg) {
		this.seg = seg;
	}

	public void setTer(double ter) {
		this.ter = ter;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public void setStatusFinal(String statusFinal) {
		this.statusFinal = statusFinal;
	}

}
