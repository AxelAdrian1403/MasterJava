public class SentenciaWhile
{
    public static void main(String[] args)
    {
        int i = 0;
        while(i < 5)
        {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println();
        i = 0;
        boolean prueba = true;

        while(prueba)
        {
            if(i == 7)
            {
                prueba = !prueba;
            }
            System.out.println("i = " + i);
            i++;
        }
        System.out.println();
        prueba = false;

        while(prueba)
        {
            System.out.println("Nunca se ejecuta");
        }
    }
}
