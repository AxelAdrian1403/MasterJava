public class OperadorLogico
{
    public static void main(String[] args)
    {
        int i = 3;
        byte j = 7;
        float k = 127E-7F;
        double l = 2.1413E3D;
        boolean m = false;

        boolean b1 = (i != j) && (k < l);
        System.out.println("b1 = " + b1);

        boolean b2 = (i != j) || (k < l);
        System.out.println("b2 = " + b2);  
        
        boolean b3 = (i == j) && (k > l) || (m == false);
        System.out.println("b3 = " + b3);
        
        //Precedencia
        boolean b4 = (i != j) || (k < l) && (m == true);
        System.out.println("b4 = " + b4);

        boolean b5 = true || true && false;
        System.out.println("b5 = " + b5);
    }
}
