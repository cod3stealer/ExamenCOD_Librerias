package libreriaESC;

/**
 * Libreria operaciones aritméticas
 * 
 * El usuario introduce los valores de los numeros con los
 * que quiere realizar operciones aritméticas y selecciona 
 * una de las 5 operaciones posibles.
 */

public class operaciones {
    /**
     * OPCIONES ELEGIBLES POR USUARIO
     */
    public static final int SUMA = 0;
    public static final int RESTA = 1;
    public static final int MULTIPLICACION = 2;
    public static final int DIVISION = 3;
    public static final int RAIZ = 4;

    /**
     * Es importante el orden: Num1 y Num2
     * 
     * @param num1 primer numero de la operacion
     * @param num2 segundo numero de la operacion
     * @param operacion que queremos realizar
     * @return resultado. (Null en caso de 'operacion' no valida.
     */

    public static Float operar(Float num1, Float num2, int operacion){
        switch(operacion){
            case SUMA:
                return num1 + num2;
            case RESTA:
                return num1 - num2;
            case MULTIPLICACION:
                return num1 * num2;
            case DIVISION:
                return num1 / num2;
            //case RAIZ:
               // return por hacer
            default:
                return null;
        }
    }
}