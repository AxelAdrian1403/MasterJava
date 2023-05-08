public class SentenciaForEach
{
    public static void main(String[] args)
    {
        int[] numeros = {1, 3, 5, 7, 9, 11, 13};

        //Ciclo foreach
        for(int num : numeros)
        {
            System.out.println("num = " + num);
        }
        
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Pepa"};
        for(String nomb : nombres)
        {
            System.out.println("nomb = " + nomb);
        }
    }
}
