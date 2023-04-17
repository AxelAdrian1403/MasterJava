public class OperadorIncremental 
{
    public static void main(String[] args) 
    {
        int i = 1;
        
        //Pre incremento
        int j = ++i; //Primero incrementa, luego asigna
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //Post incremento
        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        i = 3;
        j = --i; //i = i - 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //Post decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        j = 5;
        System.out.println("Imprimir valores");
        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);
    }
}
