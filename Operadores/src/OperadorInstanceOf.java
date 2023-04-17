public class OperadorInstanceOf 
{
    public static void main(String[] args) 
    {
        String texto = "Creando un objeto de la clase String ... que tal";
        Integer num = 7;
        
        boolean b1 = texto instanceof String;
        System.out.println("b1 = " + b1);
        
        boolean b2 = texto instanceof Object;
        System.out.println("b1 = " + b1);
        
        boolean b3 = num instanceof Integer;
        System.out.println("b3 = " + b3);

        Double d1 = 45.5D;
       // boolean b4 = d1 instanceof Integer;
        
        Object o1 = new Object();
        boolean b5 = o1 instanceof Number;
        System.out.println("b5 = " + b5);
    }
}
