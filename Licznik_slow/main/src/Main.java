import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("****LICZNIK SŁÓW****");

        Scanner scanner = new Scanner(System.in);

        boolean EndText = true;
        String resultText = "";
        while (EndText) {

            System.out.println("Napisz zdanie, a obliczymy ile ma słów.");
            String text = scanner.nextLine();
            //usunięcie nadmariów spacji .replaceAll("\\s++"," ")
            text = text.replaceAll("\\s++"," ").strip();

            if(text.isEmpty()){
                System.out.println("Wprowadź jakieś zdanie, tekst nie może być pusty!");
                continue;
            }

            System.out.println("Czy napewno chcesz to zdanie?\n" + text + "\nTAK/NIE");
            String decisionText = scanner.nextLine();

            if (decisionText.equalsIgnoreCase("tak")) {
                resultText = text;
                EndText = false;
            }
        }
        // Podział na słowa przy użyciu spacji jako separatora
        String[] slowa=resultText.split(" ");

        // Wyświetlenie każdego słowa
        for (int i=0; i < slowa.length; i++) {
            System.out.println((i+1)+ ". " + slowa[i]);
        }

        if (slowa.length == 1){
            System.out.println("Twoje zdanie posiada " + slowa.length + " słowo.");
        }
        else if (slowa.length >= 2 && slowa.length <= 4){
            System.out.println("Twoje zdanie posiada " + slowa.length + " słowa.");
        }
        else if (slowa.length >= 5){
            System.out.println("Twoje zdanie posiada " + slowa.length + " słów.");
        }


    }
}