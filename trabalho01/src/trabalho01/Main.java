package trabalho01;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Participante p1 = new Participante ("Zezinho", "zezinho@gmail.com");
		Participante p2 = new Participante ("Mariazinha", "mariazinha@gmail.com");
		Participante p3 = new Participante ("Jaozinho", "jaozinho01@gmail.com");
		Participante p4 = new Participante ("Zuleidinha", "zuleidinha23@gmail.com");
		
		Evento e1 = new EventoUnico ("Festa da Floresta", "Festa na zona rural X", df.parse("27/03/2024"), df.parse("28/03/2024"), "Goiania");
		Evento e2 = new EventoUnico ("Futsal do IFG", "Jogo decisivo da final", df.parse("29/03/2024"), df.parse("29/03/2024"), "Goiania");
		Evento e3 = new EventoRecorrente ("Reuniao Semanal", "Reuniao para verificar pontos importantes do negocio", df.parse("29/03/2024"), df.parse("29/03/2024"),"Trindade");
		Evento e4 = new EventoPeriodico ("Campus Party Goias", "XXV Encontro Campus", df.parse("01/05/2024"), df.parse("05/05/2024"), "Anapolis", DiaSemana.QUA);
	
		e1.imprimirParticipantes();
		e2.imprimirParticipantes();
		e3.imprimirParticipantes();
		e4.imprimirParticipantes();
		System.out.println("___________________\n");
		
		e1.adicionarParticipante(p4);
		e1.adicionarParticipante(p2);
		
		e1.imprimirParticipantes();
		e2.imprimirParticipantes();
		e3.imprimirParticipantes();
		e4.imprimirParticipantes();
		System.out.println("___________________\n");
		
		e2.adicionarParticipante(p4);
		e2.adicionarParticipante(p3);
		e2.adicionarParticipante(p2);
		e2.adicionarParticipante(p1);
		
		e1.imprimirParticipantes();
		e2.imprimirParticipantes();
		e3.imprimirParticipantes();
		e4.imprimirParticipantes();
		System.out.println("___________________\n");
		
		e3.adicionarParticipante(p3);
		
		e1.imprimirParticipantes();
		e2.imprimirParticipantes();
		e3.imprimirParticipantes();
		e4.imprimirParticipantes();
		System.out.println("___________________\n");
		
		e4.adicionarParticipante(p2);
		e4.adicionarParticipante(p1);
		
		e1.imprimirParticipantes();
		e2.imprimirParticipantes();
		e3.imprimirParticipantes();
		e4.imprimirParticipantes();
		System.out.println("___________________\n");
		
		
		e4.removerParticipante(p1);
		
		e1.imprimirParticipantes();
		e2.imprimirParticipantes();
		e3.imprimirParticipantes();
		e4.imprimirParticipantes();
		System.out.println("___________________\n");	
		
	}

}

/*
EVENTO
private String titulo;
private String descricao;
private Date dataInicio;
private Date dataFim;
private String localizacao;

*/