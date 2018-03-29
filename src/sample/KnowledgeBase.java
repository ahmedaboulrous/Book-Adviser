package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class KnowledgeBase {

    public static ObservableList<Book> getRecommendations(String field, String level, String language, String publisher) {

        ObservableList<Book> recommendations = FXCollections.observableArrayList();
        ArrayList<Book> listOfBooks = DataBase.getListOfBooks();

        for (Book book : listOfBooks) {
            if(
                        book.getField().equals(field)
                    &&  book.getLevel().equals(level)
                    &&  book.getLanguage().equals(language)
                    &&  book.getPublisher().equals(publisher)
                )
            {
                recommendations.add(book);
            }
        }

        return recommendations;

    }

}
