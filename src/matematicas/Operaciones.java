package matematicas;
public class Operaciones {

    /** suma
    * Devuelve la suma de dos números.
    * <p>
    * @param a Sumando primero
    * @param b Sumando segundo
    * @return  La suma de a y b
    */
    public static int suma(int num1, int num2){
        int solucion = num1 + num2;
        return solucion;
    }

    /** inc
    * Incrementa en uno el valor recibido y lo devuelve
    * <p>
    * @param a Valor a incrementar
    * @return  El valor recibido incrementado en uno
    */
    public static int inc(int num1){
        int solucion = suma(num1, 1);
        return solucion;
    }
    
    /** resta
    * Devuelve la resta de dos números
    * <p>
    * @param a Minuendo
    * @param b Sustraendo
    * @return La resta de los dos números
    */
    public static int resta(int num1, int num2){
        int solucion = suma(num1, -num2);
        return solucion;
    }

    /** dec
    * Decrementa en uno el valor recibido y lo devuelve
    * <p>
    * @param a Valor a decrementar
    * @return  El valor recibido decrementado en uno
    */
    public static int dec(int num1){
        int solucion = suma(num1, -1);
        return solucion;
    }

    /** esMayor
    * Comprueba si un número es mayor que otro
    * <p>
    * @param a Valor a comparar si es mayor
    * @param b Valor a comparar si es menor
    * @return  true si a es mayor que b y
    *          false si es igual o menor
    */
    public static boolean esMayor(int num1, int num2){
        if(resta(num1, num2) > 0){
            return true;
        }
        return false;
    }

    /** esMenor
    * Comprueba si un número es menor que otro
    * <p>
    * @param a Valor a comparar si es menor
    * @param b Valor a comparar si es mayor
    * @return  true si a es menor que b y
    *          false si es igual o mayor
    */
    public static boolean esMenor(int num1, int num2){
        if(esMayor(num1, num2)){
            return false;
        }else if(inc(resta(num1, num2)) > 0){
            return false;
        }
        return true;
    }

    /** esIgual
    * Comprueba si un número es igual que otro
    * <p>
    * @param a Primer valor a comparar
    * @param b Segundo valor a comparar
    * @return  true si son iguales y false si son distintos
    */
    public static boolean esIgual(int num1, int num2){
        if(esMayor(resta(num1, num2), 0)){
            return false;
        }else if(esMenor(resta(num1, num2), 0)){
            return false;
        }
        return true;
    }

    /** multiplica
    * Devuelve la multiplicación de dos números usando sumas
    * <p>
    * @param a Multiplicando
    * @param b Multiplicador
    * @return  El resultado de sumar b veces a
    */
    public static int multiplica(int num1, int num2){
        int solucion = 0;

        if(esMenor(num1, 0) && esMayor(num2, 0)){
            num1 = -num1;
            for(int i=0; esMenor(i, num2); i = inc(i)){
                solucion = suma(solucion, num1);
            }

            solucion = -solucion;
        }else if(esMenor(num2, 0) && esMayor(num1, 0)){
            num2 = -num2;
            for(int i=0; esMenor(i, num2); i = inc(i)){
                solucion = suma(solucion, num1);
            }
            solucion = -solucion;
        }else if(esMenor(num1, 0) && esMenor(num2, 0)){
            num1 = -num1;
            num2 = -num2;
            for(int i=0; esMenor(i, num2); i = inc(i)){
                solucion = suma(solucion, num1);
            }
        }else{
            for(int i=0; esMenor(i, num2); i = inc(i)){
                solucion = suma(solucion, num1);
            }
        }

        
        return solucion;
    }

    /** divide
    * Devuelve el cociente de la división entera de dos números usando restas
    * <p>
    * @param a Dividendo
    * @param b Divisor
    * @return  Devuelve el cociente de la división entera de a entre b
    *          realizando restas
    */
    public static int divide(int num1, int num2){

            int solucion = 0;

            if(esIgual(num2, 0))
                throw new ArithmeticException();

            if(esMenor(num1, 0) && esMayor(num2, 0)){
                num1 = -num1;
                while(esMayor(num1, num2) || esIgual(num1, num2)){
                    num1 = resta(num1, num2);
                    solucion = inc(solucion);
                }
                solucion = -solucion;
            }else if(esMenor(num2, 0) && esMayor(num1, 0)){
                num2 = -num2;
                while(esMayor(num1, num2) || esIgual(num1, num2)){
                    num1 = resta(num1, num2);
                    solucion = inc(solucion);
                }
                solucion = -solucion;
            }else if(esMenor(num1, 0) && esMenor(num2, 0)){
                num1 = -num1;
                num2 = -num2;
                while(esMayor(num1, num2) || esIgual(num1, num2)){
                    num1 = resta(num1, num2);
                    solucion = inc(solucion);
                }
            }else{
                while(esMayor(num1, num2) || esIgual(num1, num2)){
                    num1 = resta(num1, num2);
                    solucion = inc(solucion);
                }
            }

            return solucion;

    }

    /** resto
    * Devuelve el resto de la división entera
    * <p>
    * @param a Dividendo
    * @param b Divisor
    * @return  Devuelve el resto de la división entera de a entre b
    */
    public static int resto(int num1, int num2){ // 13/2 = cociente 6 resto 1 resto == 6*2=12; 13-12=1 

        if(esIgual(num2, 0))
            throw new ArithmeticException();

        int solucion = resta(num1, multiplica(divide(num1, num2), num2));
        return solucion;
    }

    /** potencia
    * Devuelve la potencia de un número elevado a otro
    * <p>
    * @param base      base
    * @param exponente exponente
    * @return          Devuelve la potencia de un número elevado a otro usando multiplicaciones
    */
    public static int potencia(int num1, int num2){
        int solucion = num1;

        if(esIgual(num2,0)){
            return 1;
        }else if(esIgual(num2,1)){
            return num1;
        }else if(esIgual(num1,0)){
            return 0;
        }

        for(int i=0; esMenor(i, dec(num2)); i = inc(i)){
            solucion = multiplica(solucion, num1);
        }
        return solucion;
    }

    /** cuadrado
    * Devuelve la potencia de un número elevado a 2
    * <p>
    * @param a número a calcular su cuadrado
    * @return  Devuelve la potencia de un número elevado a 2
    */
    public static int cuadrado(int num1){
        int solucion = 0;
        solucion = multiplica(num1, num1);
        return solucion;
    }

    /** cubo
    * Devuelve la potencia de un número elevado a 3
    * <p>
    * @param a número a calcular su cubo
    * @return  Devuelve la potencia de un número elevado a 3
    */
    public static int cubo(int num1){
        int solucion = 0;
        solucion = multiplica(cuadrado(num1), num1);
        return solucion;
    }
    
    /** esMultiplo
    * Indica si un número es múltiplo de otro dado
    * <p>
    * @param a valor a comprobar si es múltiplo
    * @param b valor con el que comprobar si a es múltiplo de él
    * @return  true si a es múltiplo y false en caso contrario
    */
    public static boolean esMultiplo(int num1, int num2){ // 25/5=5 15/5=3 10/5=2 9/4=
        if(esIgual(resto(num1, num2), 0)){
            return true;
        }
        return false;
    }

    /** esDivisor
    * Indica si un número es divisor de otro dado
    * <p>
    * @param a valor a comprobar si es divisor
    * @param b valor con el que comprobar si a es divisor de él
    * @return  true si a es divisor y false en caso contrario
    */
    public static boolean esDivisor(int num1, int num2){

        if(esIgual(num1, 0))
            return false;

        if(esIgual(resto(num2, num1), 0)){
            return true;
        }
        return false;
    }

    /** esPrimo
    * Indica si un número es primo
    * <p>
    * @param a número a comprobar si es primo
    * @return  true si a es primo y false en caso contrario
    */
    public static boolean esPrimo(int num1){
        if(esMenor(num1, 1) || esIgual(num1, 1))
            return false;
        for(int i=2; esMenor(i, divide(num1, 2)) || esIgual(i, divide(num1, 2)); i = inc(i)){
            if(esIgual(resto(num1, i), 0)){
                return false;
            }
        }
        return true;
    }

    /** esCuadradoPerfecto
    * Indica si un número es cuadrado perfecto
    * <p>
    * Un número es cuadrado perfecto si es el resultado del cuadrado de otro número
    * @param a número a comprobar si cuadrado perfecto
    * @return  true si a es cuadrado perfecto y false en caso contrario
    */
    public static boolean esCuadradoPerfecto(int num1){
        if(esMenor(num1, 0))
            return false;

        for(int i=0; esMenor(i, num1) || esIgual(i, num1); i = inc(i)){
            if(esIgual(cuadrado(i), num1)){
                return true;
            }
        }
        return false;
    }
}