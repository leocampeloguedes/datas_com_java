package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
		
		Date dataVencimentoBoleto = formatDate.parse("10/04/2021");
		
		Date dataAtualHoje = formatDate.parse("17/04/2021");
		
		if(dataVencimentoBoleto.after(dataAtualHoje)) {
			System.out.println("Boleto não Vencido");
		}else {
			System.out.println("Boleto Vencido");
		}
		
		
		
		
		/*
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Calendar milisegundos: " + calendar.getTimeInMillis());
		System.out.println("Calendar do mes: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Calendar do dia da semana: " + (calendar.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println("Calendar hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Calendar minuto do dia: " + calendar.get(Calendar.MINUTE));
		System.out.println("Calendar segundos: " + calendar.get(Calendar.SECOND));
		System.out.println("Calendar Ano: " + calendar.get(Calendar.YEAR));
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy hh:mm.ss");
		//parse
		System.out.println("Formato padrão e String: " + calendar.getInstance().getTime());
		System.out.println("Formato padrão e String: " + dateformat.format(calendar.getTime()));
		
		*/
		/*
		
		Date date = new Date();
		
		//System.out.println(date);
		
		//representa a data em milisegundos
		System.out.println("getDate() : "+date.getDate());
		System.out.println("date.getDay() : "+date.getDay());
		System.out.println("date.getHours() : "+date.getHours());
		System.out.println("date.getMinutes() : "+date.getMinutes());
		System.out.println("date.getMonth() : "+date.getMonth());
		System.out.println("date.getSeconds() : "+date.getSeconds());
		System.out.println("date.getTime() : "+date.getTime());
		System.out.println("date.getTimezoneOffset() : "+date.getTimezoneOffset());
		System.out.println("date.getYear() : "+date.getYear());
		System.out.println("date.getYear() : "+(date.getYear()+1900));
		System.out.println("date.getClass() : "+date.getClass());
		
		
		//SIMPLE DATE FORMAT
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");  //para gravar no banco de dados "yyyy-MM-dd"
			
		System.out.println(simpleDate.format(date));
		
		simpleDate = new SimpleDateFormat("dd/MM/yyyy"); //mostrar na tela para o usuário
		
		System.out.println(simpleDate.format(date));
		
		simpleDate = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss"); //mostrar na tela para o usuário com hora, minuto e segundo
		
		System.out.println(simpleDate.format(date));
		
		
		//PARSE
		simpleDate = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println(simpleDate.parseObject("19/06/2021 11:26.45"));
		
		simpleDate = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(simpleDate.parseObject("19/06/2021"));
		
		
		*/
		
			
		
		
		
		
		
		

	}

}
