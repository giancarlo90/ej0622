
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int day;
    private int month;
    private int year;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        day = 1;
        month = 1;
        year = 1;
    }

    /**
     * Metodo para fijar una fecha
     */
    public void fijarFecha ( int dia, int mes, int ano)
    {
        day = dia;
        month = mes;
        year = ano;
    }

    /**
     * Metodo para avanzar la fecha
     */
    public void avanzarFecha()
    {
        if (day == 30 & month == 12){
            day = 1;
            month = 1;
            year = year + 1;
        }
        else {
            if (day < 30) {
                day = day + 1;
            }
            else {
                if (day == 30){
                    day = 1;
                    month = month + 1;
                }
            }
        }
    }

    /**
     * Metodo para que devuelva la fecha deseada 
     */
    public String obtenerFecha()
    {
        String fechaADevolver;
        String parte1 = day + "";
        String parte2 = month + "";
        String parte3 = year + "";
        if (parte1.length() < 2) {
            parte1 = "0" + parte1;   
        }
        if (month < 10) {
            parte2 = "0" + parte2;    
        }
        if (parte3.length() < 2) {
            parte3 = "0" + parte3;
        }
        fechaADevolver = parte1 + "-" + parte2 + "-" + parte3;
        return fechaADevolver;
    }
}