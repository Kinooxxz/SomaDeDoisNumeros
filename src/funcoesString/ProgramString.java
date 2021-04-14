package funcoesString;

import java.util.Locale;

public class ProgramString {

    //formatar : toLowerCase(), toUpperCase(), trim()

    //recortar : substring(inicio),substring(inicio, fim)

    //substituir : Replace(char, char), Replace(string, string)

    //buscar : IndexOf, LastIndexOf

    // str.Split("")
    public static void main(String[] args) {
        String original = "abcde ABCD Abc asdsad AFCC";
        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String trim = original.trim();
        String substring = original.substring(2);
        String substring2 = original.substring(2,9);
        String replace = original.replace('a','x');
        String replace2 = original.toUpperCase().replace("AB", "xy");
        int i = original.indexOf("bc");
        int i2 = original.lastIndexOf("bc");




        System.out.println("original : " + original);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(trim);
        System.out.println(substring);
        System.out.println(substring2);
        System.out.println(replace);
        System.out.println(replace2);
        System.out.println(i);
        System.out.println(i2);

        //operação split

        String s = "eae cara blz?";
        String vector[] = s.split(" ");

        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);
    }
}
