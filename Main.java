import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static ArrayList<User> users = new ArrayList<User>();
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        
        int command = 0;
        boolean hasChosenExit = false;

        while (!hasChosenExit) {
            System.out.println("=============== Silahkan pilih menu! ===============");
            System.out.println("1. Mulai bermain");
            System.out.println("2. Cek leaderboard");
            System.out.println("3. Keluar");

            System.out.print("Masukkan pilihan menu: ");
            command = Integer.parseInt(input.nextLine());

            if (command == 1) {
                System.out.println("=============== Selamat datang di Trivia Arkan! ===============");
                start();
            } else if (command == 2) {
                System.out.println("=============== Leaderboard Trivia Arkan! ===============");
                leaderboard();
            } else if (command == 3) {
                System.out.println("=============== Terima kasih telah bermain Trivia Arkan! ===============");
                hasChosenExit = true;
            } else {
                System.out.println("=============== Menu tidak dikenal! ===============");
            }
        }


    }

    public static void start() {
        
        System.out.print("Masukkan nama anda: ");
        String name = input.nextLine();

        // check if theres already a user with the same name
        boolean found = false;
        for (User user : users) {
            if (user.getName().equals(name)) {
                found = true;
                break;
            }
        }

        if (!found) {
            User user = new User(name);
            users.add(user);
            int counter = 1;
            while (user.getHealth() > 0) {
                System.out.println("\n");
                System.out.println(String.format("Sisa nyawa: %d", user.getHealth()));
                // get random question
                int randomNum = ThreadLocalRandom.current().nextInt(1, Questions.getQuestionAnswerCount() + 1);
                String question = Questions.getQuestion(randomNum);
                String answer = Questions.getAnswer(randomNum);

                System.out.println(String.format("Pertanyaan ke-%d: %s", counter, question));
                System.out.print("Jawab (case insensitive): ");
                String userAnswer = input.nextLine();

                if (userAnswer.equalsIgnoreCase(answer)) {
                    user.correct();
                    System.out.println("Jawaban anda benar!");
                } else {
                    user.wrong();
                    System.out.println(String.format("Jawaban yang benar: %s", answer));
                }

                counter++;
            }
            System.out.println(String.format("Game over! Skor anda: %d", user.getSkor()));
        } else {
            System.out.println("Nama sudah ada di database!");
        }

        
    }

    public static void leaderboard() {
        Collections.sort(users); // sorted by skor
        if (users.size() > 0) {
            for (int i = 0; i < users.size(); i++) {
                User user = users.get(i);
                System.out.println(String.format("=============== Peringkat ke %s ===============", i + 1));
                System.out.println(String.format("%s: dengan skor %d", user.getName(), user.getSkor()));
            }
        } else {
            System.out.println("Leaderboard kosong!");
        }
    }
    

    public static void main(String[] args) {
        menu();
        input.close();
    }

}
