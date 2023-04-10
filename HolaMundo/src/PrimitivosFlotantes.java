public class PrimitivosFlotantes
{
    public static void main(String[] args)
    {
        //Si tiene punto decimal, por defecto pasa a ser double, por lo que requiere una F de sufijo
        System.out.println("Float");
        float numeroFloatEntero = 6;
        System.out.println("numeroFloatEntero = " + numeroFloatEntero);
        float numeroFloat = 1.0F;
        System.out.println("numeroFloat = " + numeroFloat);
        //También se puede expresar como exponente, donde E equivale a multiplicar por 10, seguido de la cantidad de 0's
        float numeroFloatExponente = 2.12E3F; //Equivale a 2120F
        System.out.println("numeroFloatExponente = " + numeroFloatExponente);
        float numeroFloatExponenteNegativo = 1.5E-3F; //0.0015F
        System.out.println("numeroFloatExponenteNegativo = " + numeroFloatExponenteNegativo);
        //Llega un punto donde el resultado es mostrado de forma compacta
        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde en bits a = " + Float.SIZE);
        System.out.println("Valor máximo de float = " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de float = " + Float.MIN_VALUE);
        System.out.println();
        //Definir valor double, no es necesario indicar con una D

        System.out.println("Double");
        double numeroDouble = 3.45E4D;
        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en bits a = " + Double.SIZE);
        System.out.println("Valor máximo de double = " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de double = " + Double.MIN_VALUE);

    }
}
