public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2025;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = ("Plus");

        if (anoDeLancamento > 2022){
            System.out.println("Filme Lançamento");
        } else {
            System.out.println("Filme retro que vale a pena assistir");
        }
        if (incluidoNoPlano == true && tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Precisar assinar");
        }
    }
}
