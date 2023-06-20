package src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

	public class DataUtil {

	// static = esse método pode ser usado mesmo sem instanciar essa classe
	public static String converterDateParaDataEHora(Date data) {
		
		//formata
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm");
		// retorna
		return formatador.format(data);
		// 08/08/2021 21:04:32
	}
	
	public static String converterDateParaData(Date data) {
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
		
		return formatador.format(data);
		// 08/08/2021
	
	}
	
	public static String converterDateParaHora(Date data) {
		
		SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
		
		return formatador.format(data);
		// 21:04:32
}
	
	
}
