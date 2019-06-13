public class QuestionsNode {
    private String text;
    private QuestionsNode yes;
    private QuestionsNode no;

    public QuestionsNode(String text) {
        this.text = text;
    }

    public void setYes(QuestionsNode node) {
        yes = node;
    }

    public void setNo(QuestionsNode node) {
        no = node;
    }

    public QuestionsNode getYes() {
        return yes;
    }

    public QuestionsNode getNo() {
        return no;
    }

    public String getText() {
        return text;
    }

    public boolean isAnswer() {
        return yes == null && no == null;
    }
}
