package otus.homeworkTestOOP;

import java.util.Scanner;

public class IntGetter implements UserInput {
    @Override
    public int read() {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        do {
            if (sc.hasNextInt()) {
                res = sc.nextInt();
                break;
            } else {
                System.out.println("Введите число");
                sc.next();
            }
        } while (sc.hasNext());
        return res;
    }
}
