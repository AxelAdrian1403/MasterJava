public class ConversionDeTipos 
{
    public static void main(String[] args) 
    {
        //Conversión de str a primitivos
        System.out.println("Convertir String a Integer");
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        System.out.println("Convertir String a Double");
        String realStr = "97.8E3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        System.out.println("Convertir String a Boolean");
        String logicoStr = "false";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //Cualquier cadena distinta de true, tendrá como resultado false

        //Conversión de números enteros a str
        System.out.println("Convertir Entero a String");
        int otroNumeroInt = 100;
        //Convierte a str
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("Integer.toString()");
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        //Segunda opcion
        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("String.valueOf()");
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        //Conversión de números reales a str
        System.out.println("Convertir Real a String");
        double otroRealDouble = 1.25E2;
        String otroRealStr = Double.toString(otroRealDouble);
        //Automáticamente, pone la notación decimal, no la científica
        System.out.println("otroRealStr = " + otroRealStr);
        otroRealStr = String.valueOf(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        //Conversión entre primitivos
        int i = 10000;
        //Se debe hacer un casteo, cuando se pasa de un tipo más grande a uno más chico
        //Habrá perdida de datos si supera el max o min value
        short s = (short)i;
        //No es necesario si se pasa de uno chico a uno grande
        long l = i;

        
        //No se podría castear si fueran de diferente tipo
        //boolean b = i
        
        //Si se puede castear a char, ya que está asociado a un valor HTML
        char c = 64;
        System.out.println("c = " + c);
    }
}
