package ObjectsAndClasses.Article;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Article article = new Article("some title", "some content", "some author");

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i <= size; i++){
            String[] text = scanner.nextLine().split(":");

            if (text[0].equals("Edit")){
                article.edit(text[1]);
            } else if (text[0].equals("ChangeAuthor")) {
                article.changeAuthor(text[1]);
            } else if (text[0].equals("Rename")) {
                article.rename(text[1]);
            }
        }

        System.out.print(article);
    }
}
