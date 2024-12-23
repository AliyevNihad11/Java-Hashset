import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cütlərin sayını daxil edin: ");
        int cut_sayı = scanner.nextInt();
        System.out.println("Cütləri daxil edin: ");
        scanner.nextLine(); 

        Set<String> unikal_cutler = new HashSet<>();
        for (int i = 0; i < cut_sayı; i++) {
            String cutler = scanner.nextLine();
            unikal_cutler.add(cutler);
            System.out.println(unikal_cutler.size());
        }

        scanner.close();


    }
}