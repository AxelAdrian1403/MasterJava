public class OperadorRelacional
{
    public static void main(String[] args)
    {
        int i = 3;
        byte j = 7;
        float k = 127E-7F;
        double l = 2.1413E3D;
        boolean m = false;

        //Relación igualdad
        boolean b1 = (i == j);
        System.out.println("b1 = " + b1);
        
        //Relación desigualdad
        boolean b2 = (i != j);
        System.out.println("b2 = " + b2);
        
        //Negación
        boolean b3 = !m;
        System.out.println("b3 = " + b3);
        
        //Comparar booleanos
        boolean b4 = (m == true);
        System.out.println("b4 = " + b4);

        //Mayor que
        boolean b5 = (i > j);
        System.out.println("b5 = " + b5);
        
        //Menor que
        boolean b6 = (i < j);
        System.out.println("b6 = " + b6);
        
        //Mayor o igual que
        boolean b7 = (i >= j);
        System.out.println("b7 = " + b7);
        
        //Menor o igual que
        boolean b8 = (i <= j);
        System.out.println("b8 = " + b8);
    }
}
