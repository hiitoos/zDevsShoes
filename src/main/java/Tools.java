import java.util.Random;

/*
	Clase con varios metodos de uso generico
	Al ser estatica se pueden llamar los metodos directamente sin tener que crear la clase
	ej:
	Tools.randomConLimites(0.0, 10.0);
 */


public class Tools {

	public static String getTimeMinutes(int time){
		return String.format("%02d'%02d\"",((time % 3600) / 60), (time % 60));
	}

	public static double randomConLimites(double rangeMin, double rangeMax) {
		Random randomObject = new Random();
		double randomValue = rangeMin + (rangeMax - rangeMin) * randomObject.nextDouble();
		return randomValue;
	}

	public static double kmh2ms(double kmh) {
		return kmh/3.6;
	}
}