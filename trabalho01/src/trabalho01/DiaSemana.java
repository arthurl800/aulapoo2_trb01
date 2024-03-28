package trabalho01;

public enum DiaSemana {

	DOM("Domingo"),
	SEG("Segunda"),
	TER("Terca"),
	QUA("Quarta"),
	QUI("Quinta"),
	SEX("Sexta"),
	SAB("Sabado");
	
	private String descricao;
	
	DiaSemana(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}