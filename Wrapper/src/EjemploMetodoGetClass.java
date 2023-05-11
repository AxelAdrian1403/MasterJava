import java.lang.reflect.Method;

public class EjemploMetodoGetClass 
{
    public static void main(String[] args)
    {
        String texto = "Hola que tal";
        
        Class strClass = texto.getClass();

        System.out.println("Metadata String");
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass.getPackage() = " + strClass.getPackage());
        System.out.println("Metodos String");
        for(Method metodo : strClass.getMethods())
        {
            System.out.println("\tmetodo.getName() = " + metodo.getName());
        }

        System.out.println();
        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("Metadata Integer");
        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getPackageName() = " + intClass.getPackageName());
        System.out.println("intClass.getPackage() = " + intClass.getPackage());
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());
        System.out.println("Metodos Integer");
        for(Method metodo : intClass.getMethods())
        {
            System.out.println("\tmetodo.getName() = " + metodo.getName());
        }
    }
}
