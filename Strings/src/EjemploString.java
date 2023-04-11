public class EjemploString
{
    public static void main(String[] args)
    {
        //Creación literal
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        String curso3 = "Programación Java";
        String curso4 = new String("Programación Java");

        boolean esIgual = (curso == curso2);
        System.out.println("curso == curso2 = " + esIgual);
    
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        //En Java hay una particularidad
        //El resultado dará true, porque cuando se crea un objeto en la literal, y tiene
        //el valor de un objeto ya existente, se comparte la referencia con fines de optimización

        esIgual = (curso == curso3);
        System.out.println("curso == curso3 = " + esIgual);

        esIgual = (curso2 == curso4);
        System.out.println("curso2 == curso4 = " + esIgual);

    }
}
