class Persona
{
    private String nombre;

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
}

public class PasarPorReferenciaPersona
{
    public static void main(String[] args)
    {
        Persona persona = new Persona();
        persona.setNombre("Andres");

        System.out.println("Iniciamos el metodo main");
        System.out.println("Antes del metodo test");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println();

        test(persona);

        System.out.println("Despues del metodo test");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Finaliza el metodo main con los datos del String modificado");
    }

    public static void test(Persona persona)
    {
        System.out.println("Iniciamos el metodo test");
        persona.setNombre("Adrian");
    }
}
