public class PasarPorReferencia
{
    public static void main(String[] args)
    {
        int[] edad = {10, 11, 12};
        System.out.println("Iniciamos el metodo main");
        System.out.println("Antes del metodo test");
        for(int i : edad)
        {
            System.out.print("[" + i + "] ");
        }
        System.out.println();

        test(edad);

        System.out.println("Despues del metodo test");
        for(int i : edad)
        {
            System.out.print("[" + i + "] ");
        }
        System.out.println();
        System.out.println("Finaliza el metodo main con los datos del arreglo modificado");
    }

    public static void test(int[] edadArr)
    {
        System.out.println("Iniciamos el metodo test");
        for(int i = 0; i < edadArr.length; i++)
        {
            edadArr[i] += 20;
        }
    }
}
