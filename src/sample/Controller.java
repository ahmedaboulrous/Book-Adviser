package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller {

    public ComboBox cbField;
    public ComboBox cbLevel;
    public ComboBox cbLanguage;
    public ComboBox cbPublisher;

    public TableView recommendedBooksTable;

    @FXML
    public void initialize() {

        cbField.getItems().addAll(DataBase.getFields().toArray());
        cbLevel.getItems().addAll(DataBase.getLevels().toArray());
        cbLanguage.getItems().addAll(DataBase.getLanguages().toArray());
        cbPublisher.getItems().addAll(DataBase.getPublishers().toArray());

        TableColumn<Book, String> idColumn = new TableColumn<>("ID");
        idColumn.setPrefWidth(100);
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        recommendedBooksTable.getColumns().add(idColumn);

        TableColumn<Book, String> titleColumn = new TableColumn<>("Book Title");
        titleColumn.setPrefWidth(400);
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        recommendedBooksTable.getColumns().add(titleColumn);

        TableColumn<Book, String> shelfColumn = new TableColumn<>("Shelf Number");
        shelfColumn.setPrefWidth(100);
        shelfColumn.setCellValueFactory(new PropertyValueFactory<>("shelf"));
        recommendedBooksTable.getColumns().add(shelfColumn);


    }



    public void handleQField() {
        VBox vBox = new VBox();
        Button okay = new Button("Okay");
        Label label = new Label("This Combobox helps you choose one of the available Book Fields");
        vBox.getChildren().addAll(label,okay);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10.0);
        Scene scene = new Scene(vBox,400,100);
        Stage msg =  new Stage();
        msg.setTitle("What is: Field Property");
        msg.setScene(scene);
        msg.show();
        okay.setOnAction(event -> msg.close());
    }

    public void handleQLevel() {
        VBox vBox = new VBox();
        Button okay = new Button("Okay");
        Label label = new Label("This Combobox helps you choose one of the available Levels of Difficulty");
        vBox.getChildren().addAll(label,okay);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10.0);
        Scene scene = new Scene(vBox,400,100);
        Stage msg =  new Stage();
        msg.setTitle("What is: Level Property");
        msg.setScene(scene);
        msg.show();
        okay.setOnAction(event -> msg.close());
    }

    public void handleQLanguage() {
        VBox vBox = new VBox();
        Button okay = new Button("Okay");
        Label label = new Label("This Combobox helps you choose one of the available Book Languages");
        vBox.getChildren().addAll(label,okay);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10.0);
        Scene scene = new Scene(vBox,400,100);
        Stage msg =  new Stage();
        msg.setTitle("What is: Language Property");
        msg.setScene(scene);
        msg.show();
        okay.setOnAction(event -> msg.close());
    }

    public void handleQPublisher() {
        VBox vBox = new VBox();
        Button okay = new Button("Okay");
        Label label = new Label("This Combobox helps you choose one of the Book Publishing Facilities");
        vBox.getChildren().addAll(label,okay);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10.0);
        Scene scene = new Scene(vBox,400,100);
        Stage msg =  new Stage();
        msg.setTitle("What is: Publisher Property");
        msg.setScene(scene);
        msg.show();
        okay.setOnAction(event -> msg.close());
    }



    public void handleQuery() {

        String field = (String)cbField.getValue();
        String level = (String)cbLevel.getValue();
        String language = (String)cbLanguage.getValue();
        String publisher = (String)cbPublisher.getValue();

        ObservableList<Book> recommendations =
                KnowledgeBase.getRecommendations(field, level, language, publisher);


        recommendedBooksTable.setItems(recommendations);


    }


}
