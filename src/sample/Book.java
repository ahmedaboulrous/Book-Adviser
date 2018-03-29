package sample;

public class Book {
    private String id;
    private String title;
    private String shelf;
    private String level;
    private String field;
    private String language;
    private String publisher;

    public Book(String id, String title, String shelf, String level, String field, String language, String publisher) {
        this.id = id;
        this.title = title;
        this.shelf = shelf;
        this.level = level;
        this.field = field;
        this.language = language;
        this.publisher = publisher;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }
}
