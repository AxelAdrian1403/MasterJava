public class EjemploStringInmutable
{
    public static void main(String[] args)
    {
        String curso = "Programación Java";
        String profesor = "Adrián Flores";

        //No altera a curso
        curso.concat(profesor);
        System.out.println("curso = " + curso);

        String resultado = curso.concat(profesor);;
        System.out.println("resultado = " + resultado);

        String resultado2 = curso.transform
                (
                        c ->
                        {
                            return c + " con " + profesor;
                        }
                );
        System.out.println("resultado2 = " + resultado2);

        //con replace, sustituimos un caracter o cadena, por otra
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);


    }
}
