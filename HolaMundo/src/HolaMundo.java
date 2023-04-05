public class HolaMundo //La clase siempre inicia en mayúscula, palabras compuestas CamelCase
{
    public static void main(String[] args)
    {
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar); //Imprimir en consola
        //out es una instancia de PrintStream, que se utiliza para imprimir en la consola

        //Cambiar a mayúsculas el contenido
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        //Primitivo de enteros
        int numero = 10;
        System.out.println("numero = " + numero);

        //Creando un contexto para el flujo de control
        boolean valor = true;
        if(valor)
        {
            //Lo declarado dentro del contexto, sólo se puede utilizar aquí
        }

        //Variable dinámica
        var num = 15;
        System.out.println("num = " + num);

        //Reglas para definir una variable
    }
}
