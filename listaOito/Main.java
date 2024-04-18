import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File arquivo = new File("C:\\Users\\hcgv1\\Downloads\\estudantes_una_2024.csv");
        Scanner scanner = new Scanner(arquivo);
        scanner.useDelimiter("\n");
        scanner.next();
        ArrayList<String> nomes = new ArrayList<String>();
        while(scanner.hasNext())
           nomes.add(scanner.next());
           Collections.sort(nomes);
           System.out.println("Nomes em ordem alfabetica");
           for(String nome : nomes) System.out.printf("Nomes: %s\n", nome);
           scanner.close(); 
        
    }

}
