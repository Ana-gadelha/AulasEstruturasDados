package recursividade;

import java.util.Scanner;

class Palindromo
{
    static boolean isPalRec(String str, int s, int e)
    {
        // Se h� s� um caractere
        if (s == e)
            return true;

        // se o primeiro e o �ltimo caractere n�o correspondem
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        // Se houver mais de dois caracteres, verifica se a substring do meio tamb�m � pal�ndromo ou n�o.
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }

    static boolean isPalindrome(String str)
    {
        int n = str.length();

        // Uma string vazia � considerada pal�ndromo
        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }

    // Driver Code
    public static void main(String args[])
    {
        //String str = "geeg"; //arara, anilina, ana, ala, ama, ele, esse, osso, ovo, radar, raiar, reler, rever, rir, saias, salas, socos, somos, sopapos, sugus, tacocat
        //ler uma string do teclado via Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String str = sc.nextLine();


        if (isPalindrome(str))
            System.out.println(str + " � pal�ndromo");
        else
            System.out.println(str + " n�o � pal�ndromo");
    }
}
