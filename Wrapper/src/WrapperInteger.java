public class WrapperInteger
{
    public static void main(String[] args)
    {
        Integer intObjeto1 = new Integer(32768);
        Integer intObjeto2 = Integer.valueOf(32768);
        Integer intObjeto3 = 32768;

        int intPrimitivo = 32768;
        Integer intObjeto4 = Integer.valueOf(intPrimitivo);

        int num = intObjeto4;
        System.out.println("num = " + num);
        int num2 = intObjeto4.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        //Short shortObjeto = 32768; //Si tratamos de declarar un limite excedido con una literal, marcara un error
        Short shortObjeto = intObjeto1.shortValue(); //Con el metodo si es posible
    }
}
