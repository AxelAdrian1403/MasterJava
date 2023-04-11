public class EjemploStringTestRendimiento
{
    public static void main(String[] args)
    {
        //+
        String a = "a";
        String b = "b";
        String c = a;

        System.out.println("Concat()");
        long inicio1 = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++)
        {
            c = c.concat(a).concat(b).concat("\n");
        }
        long fin1 = System.currentTimeMillis();

        //500 vueltas => 2 ms
        //1000 vueltas => 3 ms
        //10000 vueltas => 126 ms
        System.out.println("Tiempo total con (concat())");
        //System.out.println(c);
        System.out.println(fin1 - inicio1);
        System.out.println();

        System.out.println("+");
        long inicio2 = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++)
        {
            c += a + b + "\n";
        }
        long fin2 = System.currentTimeMillis();

        //500 vueltas => 17 ms
        //1000 vueltas => 21 ms
        //10000 vueltas => 54 ms
        System.out.println("Tiempo total con (+)");
        //System.out.println(c);
        System.out.println(fin2 - inicio2);
        System.out.println();

        System.out.println("StringBuilder");
        StringBuilder sb = new StringBuilder(c);
        long inicio3 = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++)
        {
             sb.append(a).append(b).append("\n");
        }
        long fin3 = System.currentTimeMillis();

        //500 vueltas => 0 ms
        //1000 vueltas => 0 ms
        //10000 vueltas => 1 ms
        System.out.println("Tiempo total con (+)");
        //System.out.println(sb.toString());
        System.out.println(fin3 - inicio3);
    }
}
