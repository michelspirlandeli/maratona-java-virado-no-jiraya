package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);

        // casting
        int idade1 = (int) 10000000000L;
        long numeroGrande1 = (long) 155.23;
        double salarioDouble1 = 2000.0D;
        float salarioFloat1 = (float) 2500.0D;
        byte idadeByte1 = 127;
        short idadeShort1 = 32000;
        boolean verdadeiro1 = true;
        boolean falso1 = false;
        char caractere1 = '\u0041';

        System.out.println("A idade é "+idade1+" anos");
        System.out.println(falso1);
        System.out.println("char "+caractere1);
        System.out.println(numeroGrande1);
    }
}
