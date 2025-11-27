import matematicas.Operaciones;

public class Examen27112025 {
    public static void main(String[] args) {
        System.out.println("  Pruebas unitarias");
        System.out.println("**********************");
        
        System.out.printf("Función suma: %s\n", Operaciones.suma(5,3)==8 && Operaciones.suma(-5,-3)==-8?"correcto":"fallo");
        System.out.printf("Función suma (casos adicionales): %s\n", Operaciones.suma(5,-3)==2 && Operaciones.suma(-5,3)==-2 && Operaciones.suma(0,0)==0 && Operaciones.suma(0,5)==5?"correcto":"fallo");
        
        System.out.printf("Función inc: %s\n", Operaciones.inc(5)==6 && Operaciones.inc(-5)==-4?"correcto":"fallo");
        System.out.printf("Función inc (casos adicionales): %s\n", Operaciones.inc(0)==1 && Operaciones.inc(-1)==0?"correcto":"fallo");
        
        System.out.printf("Función resta: %s\n", Operaciones.resta(5,3)==2 && Operaciones.resta(-5, -3)==-2?"correcto":"fallo");
        System.out.printf("Función resta (regla de signos): %s\n", Operaciones.resta(5,-3)==8 && Operaciones.resta(-5,3)==-8 && Operaciones.resta(0,5)==-5 && Operaciones.resta(5,0)==5?"correcto":"fallo");
        
        System.out.printf("Función dec: %s\n", Operaciones.dec(5)==4 && Operaciones.dec(-5)==-6?"correcto":"fallo");
        System.out.printf("Función dec (casos adicionales): %s\n", Operaciones.dec(0)==-1 && Operaciones.dec(1)==0?"correcto":"fallo");
        
        System.out.printf("Función esMayor: %s\n", Operaciones.esMayor(5,4) && !Operaciones.esMayor(4, 5) && !Operaciones.esMayor(5,5)?"correcto":"falso");
        System.out.printf("Función esMayor (con negativos): %s\n", Operaciones.esMayor(5,-5) && Operaciones.esMayor(-3,-5) && !Operaciones.esMayor(-5,-3) && Operaciones.esMayor(0,-1)?"correcto":"falso");
        
        System.out.printf("Función esMenor: %s\n", Operaciones.esMenor(4,5) && !Operaciones.esMenor(5, 4) && !Operaciones.esMenor(5,5)?"correcto":"falso");
        System.out.printf("Función esMenor (con negativos): %s\n", Operaciones.esMenor(-5,5) && Operaciones.esMenor(-5,-3) && !Operaciones.esMenor(-3,-5) && Operaciones.esMenor(-1,0)?"correcto":"falso");
        
        System.out.printf("Función esIgual: %s\n", Operaciones.esIgual(5,5)?"correcto":"falso");
        System.out.printf("Función esIgual (casos adicionales): %s\n", Operaciones.esIgual(0,0) && Operaciones.esIgual(-5,-5) && !Operaciones.esIgual(5,-5)?"correcto":"falso");
        
        System.out.printf("Función multiplica: %s\n", Operaciones.multiplica(5,2)==10?"correcto":"falso");
        System.out.printf("Función multiplica (regla de signos): %s\n", Operaciones.multiplica(5,-2)==-10 && Operaciones.multiplica(-5,2)==-10 && Operaciones.multiplica(-5,-2)==10?"correcto":"falso");
        System.out.printf("Función multiplica (casos especiales): %s\n", Operaciones.multiplica(5,0)==0 && Operaciones.multiplica(0,5)==0 && Operaciones.multiplica(5,1)==5 && Operaciones.multiplica(1,5)==5?"correcto":"falso");
        
        System.out.printf("Función divide: %s\n", Operaciones.divide(10,2)==5?"correcto":"falso");
        System.out.printf("Función divide (regla de signos): %s\n", Operaciones.divide(10,-2)==-5 && Operaciones.divide(-10,2)==-5 && Operaciones.divide(-10,-2)==5?"correcto":"falso");
        System.out.printf("Función divide (casos especiales): %s\n", Operaciones.divide(0,5)==0 && Operaciones.divide(5,1)==5 && Operaciones.divide(5,5)==1?"correcto":"falso");
        
        try {
            Operaciones.divide(10,0);
            System.out.printf("Función divide (división por 0): %s\n", "falso - debería lanzar excepción");
        } catch (ArithmeticException e) {
            System.out.printf("Función divide (división por 0): %s\n", "correcto");
        } catch (Exception e) {
            System.out.printf("Función divide (división por 0): %s\n", "falso - excepción incorrecta");
        }
        
        System.out.printf("Función resto: %s\n", Operaciones.resto(10,3)==1 && Operaciones.resto(10, 2)==0?"correcto":"falso");
        System.out.printf("Función resto (con negativos): %s\n", Operaciones.resto(-10,3)==-1 && Operaciones.resto(10,-3)==1 && Operaciones.resto(-10,-3)==-1?"correcto":"falso");
        System.out.printf("Función resto (casos especiales): %s\n", Operaciones.resto(0,5)==0 && Operaciones.resto(5,5)==0?"correcto":"falso");
        
        try {
            Operaciones.resto(10,0);
            System.out.printf("Función resto (módulo por 0): %s\n", "falso - debería lanzar excepción");
        } catch (ArithmeticException e) {
            System.out.printf("Función resto (módulo por 0): %s\n", "correcto");
        } catch (Exception e) {
            System.out.printf("Función resto (módulo por 0): %s\n", "falso - excepción incorrecta");
        }
        
        System.out.printf("Función potencia: %s\n", Operaciones.potencia(2,3)==8?"correcto":"falso");
        System.out.printf("Función potencia (casos especiales): %s\n", Operaciones.potencia(2,0)==1 && Operaciones.potencia(5,1)==5 && Operaciones.potencia(0,5)==0?"correcto":"falso");
        System.out.printf("Función potencia (base negativa): %s\n", Operaciones.potencia(-2,2)==4 && Operaciones.potencia(-2,3)==-8 && Operaciones.potencia(-3,4)==81?"correcto":"falso");
        
        System.out.printf("Función cuadrado: %s\n", Operaciones.cuadrado(3)==9?"correcto":"falso");
        System.out.printf("Función cuadrado (casos adicionales): %s\n", Operaciones.cuadrado(-3)==9 && Operaciones.cuadrado(0)==0 && Operaciones.cuadrado(1)==1?"correcto":"falso");
        
        System.out.printf("Función cubo: %s\n", Operaciones.cubo(3)==27?"correcto":"falso");
        System.out.printf("Función cubo (casos adicionales): %s\n", Operaciones.cubo(-3)==-27 && Operaciones.cubo(0)==0 && Operaciones.cubo(1)==1 && Operaciones.cubo(-1)==-1?"correcto":"falso");
        
        System.out.printf("Función esMultiplo: %s\n", Operaciones.esMultiplo(25, 5) && !Operaciones.esMultiplo(25, 3)?"correcto":"falso");
        System.out.printf("Función esMultiplo (casos adicionales): %s\n", Operaciones.esMultiplo(0, 5) && Operaciones.esMultiplo(25, 1) && Operaciones.esMultiplo(-25, 5) && Operaciones.esMultiplo(25, -5)?"correcto":"falso");
        
        System.out.printf("Función esDivisor: %s\n", Operaciones.esDivisor(5, 25) && !Operaciones.esDivisor(3, 25)?"correcto":"falso");
        System.out.printf("Función esDivisor (casos adicionales): %s\n", Operaciones.esDivisor(1, 25) && Operaciones.esDivisor(-5, 25) && Operaciones.esDivisor(5, -25) && !Operaciones.esDivisor(0, 25)?"correcto":"falso");
        
        System.out.printf("Función esPrimo: %s\n", Operaciones.esPrimo(13) && !Operaciones.esPrimo(4) && !Operaciones.esPrimo(-5) && !Operaciones.esPrimo(1) && !Operaciones.esPrimo(0)?"correcto":"falso");
        System.out.printf("Función esPrimo (casos adicionales): %s\n", Operaciones.esPrimo(2) && Operaciones.esPrimo(3) && Operaciones.esPrimo(5) && Operaciones.esPrimo(7) && Operaciones.esPrimo(11)?"correcto":"falso");
        System.out.printf("Función esPrimo (no primos): %s\n", !Operaciones.esPrimo(6) && !Operaciones.esPrimo(8) && !Operaciones.esPrimo(9) && !Operaciones.esPrimo(10) && !Operaciones.esPrimo(100)?"correcto":"falso");
        
        System.out.printf("Función esCuadradoPerfecto: %s\n", Operaciones.esCuadradoPerfecto(25) && !Operaciones.esCuadradoPerfecto(8)?"correcto":"falso");
        System.out.printf("Función esCuadradoPerfecto (casos adicionales): %s\n", Operaciones.esCuadradoPerfecto(0) && Operaciones.esCuadradoPerfecto(1) && Operaciones.esCuadradoPerfecto(4) && Operaciones.esCuadradoPerfecto(9) && Operaciones.esCuadradoPerfecto(16)?"correcto":"falso");
        System.out.printf("Función esCuadradoPerfecto (negativos): %s\n", !Operaciones.esCuadradoPerfecto(-4) && !Operaciones.esCuadradoPerfecto(-25)?"correcto":"falso");
    }
}
