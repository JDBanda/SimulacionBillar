/*
 * Controlador, aquí es donde se ejecutan lasoperaciones con las variables de entrada
 */
package SimulacionBillar;
public class Controller extends Model {

    //Variables auxiliares
    private int[] vecesMesa = new int[6];
    private int[] vecesDesc = new int[4];
    private int[] vecesHoras = new int[9];

    /**
     * Este método proporciona la probabilidad de que una mesa sea seleccionada
     * de acuerdo a la probabilidad obtenida de la unidad 2.
     * Aumenta en uno cada coincidencia encontrada en los rangos
     */
    public void probabilidadMesa() {
        if (getMesaRandom() < 0.001382853) {
            setMesa(1);
            vecesMesa[0] = (1 + vecesMesa[0]);
        } else if (getMesaRandom() < 0.002568155) {
            setMesa(3);
            vecesMesa[1] = 1 + vecesMesa[1];
        } else if (getMesaRandom() < 0.002963256) {
            setMesa(4);
            vecesMesa[2] = 1 + vecesMesa[2];
        } else if (getMesaRandom() < 0.438166733) {
            setMesa(5);
            vecesMesa[3] = 1 + vecesMesa[3];
        } else if (getMesaRandom() < 0.623864085) {
            setMesa(6);
            vecesMesa[4] = 1 + vecesMesa[4];
        } else if (getMesaRandom() < 1) {
            setMesa(7);
            vecesMesa[5] = 1 + vecesMesa[5];
        } else {
            System.out.println("Error en la distribución de probabilidad");
        }
        setVecesMesa(vecesMesa);
    }

    /**
     * Este método proporciona la probabilidad del descuento de aparecer
     * respecto al número random
     */
    public void probabilidadDesc() {
        if (getDescRandom() < 0.979652311) {
            setDesc(0);
            vecesDesc[0] = 1 + vecesDesc[0];
        } else if (getDescRandom() < 0.981430265) {
            setDesc(100);
            vecesDesc[1] = 1 + vecesDesc[1];
        } else if (getMesaRandom() < 0.999604899) {
            setDesc(15);
            vecesDesc[2] = 1 + vecesDesc[2];
        } else if (getMesaRandom() < 1) {
            setDesc(50);
            vecesDesc[3] = 1 + vecesDesc[3];
        }
        setVecesdesc(vecesDesc);
    }

    /**
     * Método para obtener el valor de la primer raíz de la fórmula general
     *
     * @param a coeficiente de X^2
     * @param b coeficiente de X
     * @param c coeficiente -R
     * @return Devuelve el valor de X1 (la suma), en su defecto devuelve 0 si
     * las raíces son imaginarias.
     */
    public double formulaGeneral(double a, double b, double c) {
        double valor;
        valor = (-(b) + Math.sqrt(Math.pow((b), 2) - 4 * (a) * (c))) / (2 * (a));
        return (double) Math.round(valor * 10000d) / 10000d;
    }

    /**
     * Se obtiene la probabilidad de encontrarse en alguno de los rangos por
     * medio de la distribución proporcionada en el tema 2.
     * Aumenta en uno cada coincidencia encontrada en los rangos
     */
    public void probabilidadTiempoHoras() {
        //1er Intervalo
        if (getTiempoHorasRandom() < 0.271247336) {
            setTiempoHoras(formulaGeneral(0.0194, 2.4132, -getTiempoHorasRandom()));
            vecesHoras[0] = 1 + vecesHoras[0];
        } //2do Intervalo
        else if (getTiempoHorasRandom() < 0.5670780967) {
            setTiempoHoras(formulaGeneral(0.46945, 1.8396, -0.75975 - getTiempoHorasRandom()));
            vecesHoras[1] = 1 + vecesHoras[1];
        } //3er Intervalo
        else if (getTiempoHorasRandom() < 0.8169938933) {
            setTiempoHoras(formulaGeneral(-1.6329, 5.793299, -3.670255 - getTiempoHorasRandom()));
            vecesHoras[2] = 1 + vecesHoras[2];
        } //4to Intervalo
        else if (getTiempoHorasRandom() < 0.9185993721) {
            setTiempoHoras(formulaGeneral(-4.541185, 15.5498, -12.29493 - getTiempoHorasRandom()));
            vecesHoras[3] = 1 + vecesHoras[3];
        } //5to Intervalo
        else if (getTiempoHorasRandom() < 0.9564347825) {
            setTiempoHoras(formulaGeneral(4494.3528, 12088.0326, (-32234.9861 - getTiempoHorasRandom())));
            vecesHoras[4] = 1 + vecesHoras[4];
        } //6to Intervalo
        else if (getTiempoHorasRandom() < 0.9849516793) {
            setTiempoHoras(formulaGeneral(-5.07142, 25.07101, -30.14595 - getTiempoHorasRandom()));
            vecesHoras[5] = 1 + vecesHoras[5];
        } //7mo Intervalo
        else if (getTiempoHorasRandom() < 0.9916879533) {
            setTiempoHoras(formulaGeneral(2.14965, -9.12025, 9.40008 - getTiempoHorasRandom()));
            vecesHoras[6] = 1 + vecesHoras[6];
        } //8mo Intervalo
        else if (getTiempoHorasRandom() < 0.9977506007) {
            setTiempoHoras(formulaGeneral(-3.039934, 21.2536, -36.03675 - getTiempoHorasRandom()));
            vecesHoras[7] = 1 + vecesHoras[7];
        } //9no Intervalo
        else if (getTiempoHorasRandom() < 1) {
            setTiempoHoras(formulaGeneral(-1.758815, 14.76997, -29.6 - getTiempoHorasRandom()));
            vecesHoras[8] = 1 + vecesHoras[8];
        } else {
            System.out.println("Problemas con la probabilidad tiempoHoras");
        }
        setVecesHora(vecesHoras);
    }

    /**
     * En este método se obtiene el monto de cada cliente, se puede usar
     * multiples veces para obtener el valor de cada cliente.
     * @param tiempo es necesario ingresar el tiempo que se ocupa la mesa
     * @param desc se refiere al descuento que se obtuvo
     * @return Devuelve el valor real del monto por persona.
     */
    public double monto(double tiempo, double desc) {
        return (tiempo * 25) - (tiempo * 25) * (desc * 0.01);
    }

    /**
     * Se suman los montos obtenidos.
     * @return El valor total de ganancia.
     */
    public double totalGanancia() {
        double total = 0;
        total = monto(getTiempoHoras(), getDesc()) + total;
        return total;
    }

}
