public class EjemploStringMetodos
{
    public static void main(String[] args)
    {
        String nombre = "Adrián";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Adrián\") = " + nombre.equals("Adrián"));
        System.out.println("nombre.equalsIgnoreCase(\"adRián\") = " + nombre.equalsIgnoreCase("adRián"));
        System.out.println("nombre.compareTo(\"Luis\") = " + nombre.compareTo("Luis"));
        System.out.println("\"*\".compareTo(\"+\") = " + "*".compareTo("+"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(1,5) = " + nombre.substring(1,5));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('z') = " + trabalenguas.lastIndexOf('z'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("     trabalenguas  ");
        System.out.println("     trabalenguas  ".trim());


    }
}
