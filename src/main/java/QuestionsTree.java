import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class QuestionsTree {
    QuestionsNode root;

    public QuestionsNode getRoot() {
        return this.root;
    }

    public QuestionsTree(String filePath) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(filePath));
        QuestionsNode current = root;

        // Hint: Your todos will manipulate this stack
        Stack<QuestionsNode> stack = new Stack<>();

        while (scan.hasNextLine()) {
            String[] data = scan.nextLine().split("\t");
            QuestionsNode node = new QuestionsNode(data[1]);

            if (root == null) {
                root = node;
                current = node;
            } else {
                boolean inserted = false;
                while (!inserted) {
                    if (current.getYes() == null) {
                        current.setYes(node);
                        inserted = true;
                    } else if (current.getNo() == null) {
                        current.setNo(node);
                        inserted = true;
                    }
                    // TODO: What should happen if both pointers are filled for this question?
                }
            }

            if (data[0].equals("Q")) {
                // TODO: What should happen if this is a new Question node?
                current = node;
            }
        }
    }
}
