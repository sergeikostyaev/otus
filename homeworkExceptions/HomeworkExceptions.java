package otus.homeworkExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HomeworkExceptions {

    public static void main(String[] args) throws IOException {

        try(Scanner sc = new Scanner(System.in)){

            Car c = new Car(new Engine(sc.nextInt()));

            c.drive(250);


        }

    }
}

