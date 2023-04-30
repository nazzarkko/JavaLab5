package IdeaProjects.JavaLab5;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ArticleDeleter {
    public String deleteArticles(String text) {
        if (text.isEmpty()) {
            throw new IllegalArgumentException("You don`t input anything");
        }
        Pattern pattern = Pattern.compile("\\b(a|an|the|or|are|on|in|out)\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("");
        if (text.equals(result)) {
            throw new IllegalArgumentException("There is no articles");
        }
        System.out.println(result);
        return result;
    }
     public static void main(String[] args) {
        System.out.println("Enter a text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println("Fixed text: ");
        ArticleDeleter obj = new ArticleDeleter();
        obj.deleteArticles(text);
    }
}






