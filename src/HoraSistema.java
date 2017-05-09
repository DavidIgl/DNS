<<<<<<< HEAD
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HoraSistema {

	static String HoraSistema_ttl(){
		
		Calendar calendario = Calendar.getInstance();

		int hora, minutos, segundos;
		String horasegundos;
		
	    hora =calendario.get(Calendar.HOUR_OF_DAY);
	    minutos = calendario.get(Calendar.MINUTE);
	    segundos = calendario.get(Calendar.SECOND);
		horasegundos= Integer.toString(hora*3600+minutos*60+segundos);
		
		return horasegundos;
	}
	
}
=======
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HoraSistema {

	static String HoraSistema_ttl(){
		
		Calendar calendario = Calendar.getInstance();

		int hora, minutos, segundos;
		String horasegundos;
		
	    hora =calendario.get(Calendar.HOUR_OF_DAY);
	    minutos = calendario.get(Calendar.MINUTE);
	    segundos = calendario.get(Calendar.SECOND);
		horasegundos= Integer.toString(hora*3600+minutos*60+segundos);
		
		return horasegundos;
	}
	
}
>>>>>>> 20e0deb74a11a26b75c710a357fc45930ee8e6d3
