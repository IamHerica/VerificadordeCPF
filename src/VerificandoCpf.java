import java.util.Scanner;

public class VerificandoCpf {

    public void captarCpf () {
        Scanner inserir = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        int j;
        int k;
        int soma1;
        int soma2;
        int result1;
        int result2;

        a = inserir.nextInt();
        b = inserir.nextInt();
        c = inserir.nextInt();
        d = inserir.nextInt();
        e = inserir.nextInt();
        f = inserir.nextInt();
        g = inserir.nextInt();
        h = inserir.nextInt();
        i = inserir.nextInt();
        j = inserir.nextInt();
        k = inserir.nextInt();

        soma1 = (a*10) + (b*9) + (c*8) + (d*7) + (e*6) +
                (f*5) + (g*4) + (h*3) + (i*2);

        result1 = (soma1 * 10) %11; //calculando o dígito verificador k

        soma2 = (a*11) + (b*10) + (c*9) + (d*8) + (e*7) +
                (f*6) + (g*5) + (h*4) + (i*3) + (result1 * 2);

        result2 = (soma2 *10) %11; //calculando o dígito verificador j

        if (result1 == j && result2 == k) {
            System.out.println("O CPF inserido é válido!");
        } else {
            System.out.println("O CPF inserido é inválido!");
        }







    }
}
