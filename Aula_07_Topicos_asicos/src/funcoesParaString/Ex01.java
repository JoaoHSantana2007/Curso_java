package funcoesParaString;

public class Ex01 {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG";

        System.out.println("Original:" + original);

        // Formatar
            System.out.println();
            String s01 = original.toLowerCase();
            String s02 = original.toUpperCase();
            String s03 = original.trim();

            System.out.println("toLowerCase:" + s01);
            System.out.println("toUpperCase:" + s02);
            System.out.println("trin:" + s03);

        // Recortar
            System.out.println();
            String s04 = original.substring(2);
            String s05 = original.substring(2, 9);

            System.out.println("subString 1:" + s04);
            System.out.println("subString 2:" + s05);

        // Subistituir
            System.out.println();
            String s06 = original.replace('a', 'x');
            String s07 = original.replace("abc", "xy");

            System.out.println("replace Char:" + s06);
            System.out.println("replace String:" + s07);

        // Buscar
            System.out.println();
            int i = original.indexOf("bc");
            int j = original.lastIndexOf("bc");

            System.out.println("indexOf:" + i);
            System.out.println("latIndexOf:" + j);

    }
}
