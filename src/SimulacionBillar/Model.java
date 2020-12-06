/**
 * Esta clase contiene las variables que se usarán para crear objetos en las
 * otras clases, son los datos.
 */
package SimulacionBillar;
public class Model {
    //valores acumulables
    private int[] vecesMesa;
    private int[] vecesdesc;
    private int[] vecesHora;
    //valores para operaciones
    private int mesa;
    private double tiempoHoras;
    private int desc;
    private double mesaRandom;
    private double tiempoHorasRandom;
    private double descRandom;

    //Getters y Setters de variables
    public int[] getVecesdesc() {
        return vecesdesc;
    }
    public void setVecesdesc(int[] vecesdesc) {
        this.vecesdesc = vecesdesc;
    }
    public int[] getVecesHora() {
        return vecesHora;
    }
    public void setVecesHora(int[] vecesHora) {
        this.vecesHora = vecesHora;
    }
    public int[] getVecesMesa() {
        return vecesMesa;
    }
    public void setVecesMesa(int[] vecesMesa) {
        this.vecesMesa = vecesMesa;
    }
    public int getMesa() {
        return mesa;
    }
    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
    public double getTiempoHoras() {
        return tiempoHoras;
    }
    public void setTiempoHoras(double tiempoHoras) {
        this.tiempoHoras = tiempoHoras;
    }
    public int getDesc() {
        return desc;
    }
    public void setDesc(int desc) {
        this.desc = desc;
    }
    public double getMesaRandom() {
        return mesaRandom;
    }
    public void setMesaRandom(double mesaRandom) {
        this.mesaRandom = mesaRandom;
    }
    public double getTiempoHorasRandom() {
        return tiempoHorasRandom;
    }
    public void setTiempoHorasRandom(double tiempoHorasRandom) {
        this.tiempoHorasRandom = tiempoHorasRandom;
    }
    public double getDescRandom() {
        return descRandom;
    }
    public void setDescRandom(double descRandom) {
        this.descRandom = descRandom;
    }

    
    
}
