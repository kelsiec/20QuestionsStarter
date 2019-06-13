import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuestionsGame {

    public static void main(String[] args) throws FileNotFoundException {
        QuestionsTree tree = new QuestionsTree("src/main/resources/small_questions.txt");
        play(tree);
    }

    public static void play(QuestionsTree tree) {
        System.out.println("Please think of something for me to guess.");

        QuestionsNode current = tree.getRoot();
        Scanner reader = new Scanner(System.in);
        while (!current.isAnswer()) {
            System.out.println(current.getText() + " y/n");
            String answer = reader.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                current = current.getYes();
            } else {
                current = current.getNo();
            }
        }

        System.out.println("You're thinking of " + current.getText());
    }
}
