public class SentenciaFor
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; i++)
        { //Se pueden omitir las llaves si es una sola linea
            System.out.println("i = " + i);
        }

        int i = 0;
        for(; i < 5; )
        {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        for(; ;)
        {
            if(i > 5)
            {
                break;
            }
            i++;
        }

        for(int j = 0, k = 10; j < k; j++, k--)
        {
            System.out.print("j = " + j + " - - - ");
            System.out.println("k = " + k);
        }
        
        for(int j = 0; j <= 10; j++)
        {
            if(j % 2 == 0)
            {
                continue; //Sala la iteracion
            }
            System.out.println("j = " + j);
        }

        for(int j = 0; j <= 10; j++)
        {
            if(!(j % 2 == 0))
            {
                continue; //Sala la iteracion
            }
            System.out.println("j = " + j);
        }

    }
}
