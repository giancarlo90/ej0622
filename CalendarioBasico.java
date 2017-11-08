
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private DisplayDosCaracteres day;
    private DisplayDosCaracteres month;
    private DisplayDosCaracteres year;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        day = new DisplayDosCaracteres(31);
        month = new DisplayDosCaracteres(13);
        year = new DisplayDosCaracteres(100);
    }

    /**
     * Metodo para fijar una fecha
     */
    public void fijarFecha ( int dia, int mes, int ano)
    {
        day.setValorAlmacenado(dia);
        month.setValorAlmacenado(mes);
        year.setValorAlmacenado(ano);
    }

    /**
     * Metodo para avanzar la fecha
     */
    public void avanzarFecha()
    {
        day.incrementaValorAlmacenado();
        if (day.getValorAlmacenado() == 1){
            month.incrementaValorAlmacenado();
            if (month.getValorAlmacenado() == 1){
                year.incrementaValorAlmacenado();
            }
        }
    }

    /**
     * Metodo para que devuelva la fecha deseada 
     */
    public String obtenerFecha()
    {
        String devolver = day.getTextoDelDisplay() + "-" + month.getTextoDelDisplay() + "-" + year.getTextoDelDisplay();
        day.getTextoDelDisplay();
        month.getTextoDelDisplay();
        year.getTextoDelDisplay();      
        return devolver;
    }
}