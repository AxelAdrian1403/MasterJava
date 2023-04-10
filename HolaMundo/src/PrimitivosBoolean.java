public class PrimitivosBoolean 
{
    public static void main(String[] args) 
    {
        boolean datoLogico = false;
        //Definir mediante la constante
        boolean datoLogicoConstante = Boolean.FALSE;
        System.out.println("datoLogico = " + datoLogico);
        System.out.println("datoLogicoConstante = " + datoLogicoConstante);

        //Casos de uso
        double numeroDouble = 9.87E3D; //9870
        float numeroFloat = 12.34E2F; //1234
        
        datoLogico = (numeroDouble > numeroFloat);
        System.out.println("datoLogico = " + datoLogico);
    }
}
