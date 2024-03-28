package trabalho01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {

    private String titulo;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private String localizacao;
    
    private List<Participante> participantes = new ArrayList<>();
    
    public Evento(String titulo, String descricao, Date dataInicio, Date dataFim, String localizacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.localizacao = localizacao;
    }

    
    public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public Date getDataInicio() {
		return dataInicio;
	}



	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}



	public Date getDataFim() {
		return dataFim;
	}



	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}



	public String getLocalizacao() {
		return localizacao;
	}



	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}



	@Override
	public String toString() {
		return "Evento [titulo=" + titulo + ", descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataFim="
				+ dataFim + ", localizacao=" + localizacao + "]";
	}


	public void imprimirParticipantes() {
		
    	System.out.println();
    	if (participantes.isEmpty()) {
    		System.out.println("Evento: " + this.descricao);
    	}
    	else {
    		
    		for (Participante p : this.participantes ) {
    			System.out.println("Participante " + p.getNome());; 
    		}
    	}
		
	}


	public boolean adicionarParticipante(Participante participante) {
		
		try {

			if (dataInicio.after(dataFim)) {
			    throw new DataInvalidaException("Data de início deve ser anterior à data de fim!");
			}
			} catch (DataInvalidaException e) {
			System.out.println(e.getMessage());
			}
				
		if ( participante != null && !participantes.contains(participante) ) {
			this.participantes.add(participante);
			return true;
		}
		
		return false;		
		
	}


	public boolean removerParticipante(Participante participante) {
	
		if ( participante != null && participantes.size() > 0 && participantes.contains(participante) ) {
			this.participantes.remove(participante);
			return true;
		}
		
		return false;
		
	}
  
}

