import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n = 0;
    static String names[] = new String[10];
    static String namePerson;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean nextName = true;
        while (nextName) {
            System.out.println("Pleas enter you name: " + n);
            namePerson = scanner.nextLine();
            if (checkUserName() == true) {
                System.out.println("okey");
                System.out.println("Ваше имя имеет длину " + namePerson.length() + " Символов");
                String noProbel = namePerson.replace(" ", "");
                System.out.println("А без пробелов ваше имя занимает " + noProbel.length() + " символов");
                n++;
            } else if (checkUserName() == false) {
                System.out.println("Rename please");}
            System.out.println("Массив: " + Arrays.toString(names));
        }
    }
    public static boolean checkUserName(){
        boolean checkName = true;
        boolean report_checkUserName = true;
        while (checkName){
            if (names[0] == null) {
                System.out.println("Nice name: 1");
                names[n] = namePerson;
                break;
            } else if (namePerson.equalsIgnoreCase(names[n-1])) { //Почему не работает ни преинкримент, не постинкримент
            report_checkUserName = !report_checkUserName;
            System.out.println("This name already used"); // При отработке этого сценария, показывается 2 раза подряд.
            break;
            } else if (!(namePerson.equalsIgnoreCase(names[n-1]))){ //Почему не работает ни преинкримент, не постинкримент
                System.out.println("Nice name");
                names[n] = namePerson;
                break;
            }
        }
        return report_checkUserName;
    }
}