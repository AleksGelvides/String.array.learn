import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String names[] = new String[10];
        Scanner scanner = new Scanner(System.in);
        names[0] = "иван иванов";
        boolean cycle = true;
        while (cycle){
            int i = 1;
            names[i] = scanner.nextLine();
            if (names[i--].equals(names[i])){
                System.out.println("Имя уже занято");
                names[i] = null;
            } else
                System.out.println("Успешно добавленно");
            i++;
        }
    }
}