public class PrimitivosEnteros
{
    public static void main(String[] args)
    {
        //Enteros

        System.out.println("Byte");
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        //Cantidad de bytes en un byte
        System.out.println("Tipo byte corresponde en byte a  = " + Byte.BYTES);
        //Cantidad de bits en un byte
        System.out.println("Tipo byte corresponde en bits a  = " + Byte.SIZE);
        //Valor máximo de un byte
        System.out.println("Valor máximo de un byte = " + Byte.MAX_VALUE);
        //Valor mínimo de un byte
        System.out.println("Valor mínimo de un byte = " + Byte.MIN_VALUE);
        System.out.println();

        System.out.println("Short");
        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        //Cantidad de bytes en un short
        System.out.println("Tipo short corresponde en byte a  = " + Short.BYTES);
        //Cantidad de bits en un short
        System.out.println("Tipo short corresponde en bits a  = " + Short.SIZE);
        //Valor máximo de un short
        System.out.println("Valor máximo de un short = " + Short.MAX_VALUE);
        //Valor mínimo de un short
        System.out.println("Valor mínimo de un short = " + Short.MIN_VALUE);
        System.out.println();

        System.out.println("Int");
        int numeroInt = 50000;
        System.out.println("numeroInt = " + numeroInt);
        //Cantidad de bytes en un int
        System.out.println("Tipo int corresponde en byte a  = " + Integer.BYTES);
        //Cantidad de bits en un int
        System.out.println("Tipo int corresponde en bits a  = " + Integer.SIZE);
        //Valor máximo de un int
        System.out.println("Valor máximo de un int = " + Integer.MAX_VALUE);
        //Valor mínimo de un int
        System.out.println("Valor mínimo de un int = " + Integer.MIN_VALUE);
        System.out.println();

        System.out.println("Long");
        long numeroLong = 400000000L;
        System.out.println("numeroLong = " + numeroLong);
        //Cantidad de bytes en un long
        System.out.println("Tipo long corresponde en byte a  = " + Long.BYTES);
        //Cantidad de bits en un long
        System.out.println("Tipo long corresponde en bits a  = " + Long.SIZE);
        //Valor máximo de un long
        System.out.println("Valor máximo de un long = " + Long.MAX_VALUE);
        //Valor mínimo de un long
        System.out.println("Valor mínimo de un long = " + Long.MIN_VALUE);

        //Var
        var numeroVar = 12000L;
        System.out.println("numeroVar = " + numeroVar);
    }
}
