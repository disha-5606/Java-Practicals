import java.util.Scanner;

class Question {
    String question;

    Question() {
    }

    void display() {
        System.out.println(question);
    }

    boolean checkAns(String userAnswer) {
        return false;
    }
}

class MCQ extends Question {
    String[] options;
    String ans;

    MCQ(String question, String[] options, String answer) {
        super.question = question;
        this.options = options;
        this.ans = answer;
    }

    void display() {
        super.display();
        for (String option : options) {
            System.out.println(option);
        }
    }

    boolean checkAns(String userAnswer) {
        return userAnswer.equals(ans);
    }
}

class TrueFalse extends Question {
    boolean ans;

    TrueFalse(String question, boolean answer) {
        super.question = question;
        this.ans = answer;
    }

    void display() {
        super.display();
        System.out.println("True or False?");
    }

    boolean checkAns(String userAnswer) {
        return (userAnswer.equalsIgnoreCase("true") && ans) || (userAnswer.equalsIgnoreCase("false") && !ans);
    }
}

public class Practical12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MCQ mcq = new MCQ("What is your favorite city?",
                new String[] { "A. Pune", "B. Jaipur", "C. Delhi", "D. Mumbai" }, "Pune");
        mcq.display();
        System.out.println("Ans:");
        String ans = scanner.nextLine();
        if (mcq.checkAns(ans)) {
            System.out.println("Correct Answer");
        } else {
            System.out.println("Incorrect Answer");
        }
        System.out.println("-------------------------------------------------------------");

        TrueFalse t = new TrueFalse("My favorite city is Pune", true);
        t.display();
        String answer = scanner.nextLine();
        if (t.checkAns(answer)) {
            System.out.println("Correct Answer");
            System.out.println("-------------------------------------------------------------");

        } else {
            System.out.println("Incorrect Answer");
            System.out.println("-------------------------------------------------------------");

        }

        scanner.close();
    }

}