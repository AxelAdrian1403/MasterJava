public class SentenciaDoWhile
{
    public static void main(String[] args)
    {
        boolean prueba = false;

        do
        {
            System.out.println("Se ejecuta al menos una vez");
        }while(prueba);

        int i = 0;
        prueba = true;
        do
        {
            if(i == 10)
            {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while(prueba);
    }
}
