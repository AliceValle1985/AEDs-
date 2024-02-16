package Unidade00Exercicios;
public class Unid00b {
    // Mostrar se tem o valor de x no array
    public static boolean FindInt(int a[], int x) {
        boolean result = false;
        int atamanho = a.length;
        for (int i = 0; i < atamanho; i++) {
            if (x == a[i]) {
                result = true;
            }
        }
        return (result);
    }

    // Mostrar o menor valor do array
    public static void MostrarMenor(int a[]) {
        int x = a[0];
        int atamanho = a.length;
        for (int i = 1; i < atamanho; i++) {
            if (a[i] < x) {
                x = a[i];
            }
        }
        System.out.println("O menor elemento do array é: " + x);
    }

    /*
     * O que o codigo abaixo faz?
     * converte o c para um formato int e v recebe o valor em inteiro de c ( ou
     * seja, c em ascii )
     * depois verifica de o valor de v é igual aos numeros da tabela ascii ( q
     * significam caracteres )
     */
    public static boolean doidao(char c) {
        boolean resp = false;
        int v = (int) c;
        if (v == 65 || v == 69 || v == 73 || v == 79 || v == 85 || v == 97 || v == 101 || v == 105 || v == 111
                || v == 117) {
            resp = true;
        }
        return resp;
    }

    public static char toUpper(char c) {
        /* Verifica se c é minusculo, se for é subtraido 32 do valor ascii dele ( quando
        é subtraido 32 de um char minusculo, vc o torna um caractere maiusculo, e vice versa ( maiusculo -> minusculo é +32 ) ) então se essa função recebe um caractere minusculo, ela retorna esse msm caractere maiusculo*/
        return (c >= 'a' && c <= 'z') ? ((char) (c - 32)) : c;
    }
    /* A diferença entre i--; e --i; é o momento em que a subtração é feita
     * o i--; subtrai o valor logo depois da execução em que o i--; esteja
     * i-- exemplo: 
     * int i = 5;
     * System.out.println ( i-- );
     * isso imprimiria 5, porque a subtração é feita depois do uso da variavel
     * 
     * --i; exemplo:
     * System.out.println ( --i );
     * isso imprimiria 4, pois a subtração já é feita antes do uso da variavel i
     * 
     */

     /*  
     O que o programa abaixo mostra na tela?
     byte b = 0; short s = 0; int i = 0; long l = 0;
     while ( true )
     {
        b++; s++; i++; l++;
        System.out.println ( b + " " + s + " " + i + " " + l  );
     }
     R-> irá exibir os valores sendo incrementados até a condição while deixar de ser verdadeira 
     */
    public static void main(String[] args) {
        int array[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int x = 19;
        char c = 'B';
        boolean Temx = FindInt(array, x);
        System.out.println(Temx);
        MostrarMenor(array);
        boolean Temc = doidao(c);
        System.out.println(Temc);
    }
}
/*
 * Por que o codigo abaixo imprime [ 46 - 11 ]?
 * int x = 23, int y = 23;
 * x = x << 1;
 * y = y >> 1;
 * System.out.println ( "[" + x + " - " + y + "]" );
 * 
 * ( x = x << 1; ) esse "<< 1" adiciona um 0 no final do valor de bits 
 * ( y = y >> 1; ) esse ">> 1" retira um 0 no final do valor de bits
 * 
 * então o 10111 ( 23 ) teme um 0 adicionado no final de seus bits, 101110 e virou 46
 * então o 10111 ( 23 ) teme um 0 retirado no inicio de seus bits, 1011 e virou 11
*/