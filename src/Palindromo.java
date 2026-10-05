public class Palindromo {

    public boolean esPalindromo(String texto) {

        String textoNormalizado = texto.toLowerCase().replace(" ", "");

        StringBuilder invertido = new StringBuilder(textoNormalizado);
        invertido.reverse();

        return textoNormalizado.equals(invertido.toString());
    }

}
