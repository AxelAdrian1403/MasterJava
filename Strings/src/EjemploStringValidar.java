public class EjemploStringValidar
{
    public static void main(String[] args)
    {
        String curso = null;
        //Validar si el objeto es nulo
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(!esNulo)
        {
            System.out.println(curso.toUpperCase());
        }
        //No se puede
        //System.out.println("Bienvenido al curso ".concat(curso));

        //Si se puede
        System.out.println("Bienvenido al curso " + curso);

        if(esNulo)
        {
            curso = "Programación Java";
        }
        
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);
        
        esVacio = curso.isEmpty();
        System.out.println("esVacio = " + esVacio);

        curso = " ";
        boolean esUnEspacio= curso.isBlank();
        System.out.println("esUnEspacio = " + esUnEspacio);
    }
}
