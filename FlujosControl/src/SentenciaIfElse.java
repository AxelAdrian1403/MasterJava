public class SentenciaIfElse
{
    public static void main(String[] args)
    {
        float promedio = 7.1F;
        if(promedio >= 7.0)
        {
            System.out.println("Excelente promedio");
        }
        else if(promedio >= 6.0)
        {
            System.out.println("Muy buen promedio");
        }
        else if(promedio >= 5.5)
        {
            System.out.println("Buen promedio");
        }
        else if(promedio >= 5.0)
        {
            System.out.println("Regular, necesitas esforzarte un poco más");
        }
        else if(promedio >= 4.0)
        {
            System.out.println("Necesitas estudiar más");
        }
        else
        {
            System.out.println("Reprobado");
        }

        System.out.println("Tu promedio es: " + promedio);
    }
}
