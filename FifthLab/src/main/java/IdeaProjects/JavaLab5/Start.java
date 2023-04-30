package IdeaProjects.JavaLab5;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Enter a text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println("Fixed text: ");
        ArticleDeleter obj = new ArticleDeleter();
        obj.deleteArticles(text);
    }
}
