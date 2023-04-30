package org.example;

import IdeaProjects.JavaLab5.ArticleDeleter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleDeleterTest {
    ArticleDeleter obj = new ArticleDeleter();

    @Test
    public void testDeleteArticles() {
        assertEquals(" String  not followed", obj.deleteArticles("A String are not followed"));
    }

    @Test
    public void testIfStringIsEmpty() {
        String text = "";
        Assertions.assertThrows(IllegalArgumentException.class, () ->
            obj.deleteArticles(text));
        
    }

    @Test()
    public void testInTextNoArticles() {
        String text = "There is articles";
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                obj.deleteArticles(text));
    }
}