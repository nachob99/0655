public class Acceso
{
    //Campo año
    private int ano;
    //Campo mes
    private int mes;
    //Campo dia
    private int dia;
    //Campo hora
    private int hora;
    //Campo minutos
    private int minutos;
    
    public Acceso(int ano, int mes, int dia, int hora, int minutos)
    {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minutos = minutos;
    }
    /**
     * Obtenemoss el año
     */
    public int getAno() 
    {
        return ano;
    }
    /**
     * Obtenemoss el mes
     */
    public int getMes()
    {
        return mes;
    }
    /**
     * Obtenemoss el dia
     */
    public int getDia()
    {
        return dia;
    }
    /**
     * Obtenemoss la hora
     */
    public int getHora()
    {
        return hora;
    }
    /**
     * Obtenemoss los minutos
     */
    public int getMinutos()
    {
        return minutos;
    }
}