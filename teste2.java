package estagio;

public class teste2 {
    public static void main(String[] args) {
    	
        String texto = "Um dia, um cão ia atravessando uma ponte, carregando um osso na boca.\r\n"
        		+ "\r\n"
        		+ "Olhando para baixo, viu sua própria imagem refletida na água. Pensando ver outro cão, cobiçou-lhe logo o osso e pôs-se a latir. Mal, porém, abriu a boca, seu próprio osso caiu na água e se perdeu para sempre.";
        int contador = 0;

        String textoMinusculo = texto.toLowerCase();

        for (int i = 0; i < textoMinusculo.length(); i++) {
            if (textoMinusculo.charAt(i) == 'a') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }
    }
}
