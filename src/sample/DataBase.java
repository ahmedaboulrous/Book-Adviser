package sample;

import java.util.ArrayList;

public class DataBase {

    public static ArrayList<String> getFields() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Science");
        list.add("History");
        list.add("Literature");
        list.add("Math");

        return list;
    }

    public static ArrayList<String> getLevels() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Beginner");
        list.add("Intermediate");
        list.add("Advanced");

        return list;
    }

    public static ArrayList<String> getLanguages() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Arabic");
        list.add("English");
        list.add("French");
        list.add("German");

        return list;
    }

    public static ArrayList<String> getPublishers() {
        ArrayList<String> list = new ArrayList<>();

        list.add("O'Raily");
        list.add("MIT");
        list.add("Oxford Press");
        list.add("Cambridge Press");

        return list;
    }



    public static ArrayList<Book> getListOfBooks() {
        ArrayList<Book> list = new ArrayList<>();

        list.add(new Book("123","The Selfish Gene", "12","Beginner","Science","Arabic","O'Raily"));
        list.add(new Book("183","Guns, Germs and Steel", "26","Beginner","History","English","Oxford Press"));
        list.add(new Book("433","Silent Spring", "12","Beginner","Science","English","O'Raily"));
        list.add(new Book("553","Pride and Prejudice", "12","Beginner","Literature","French","MIT"));
        list.add(new Book("149","The Rise and fall of the third Reich", "26","Beginner","History","French","O'Raily"));

        list.add(new Book("243","Black Hole Blues", "12","Advanced","Science","Arabic","MIT"));
        list.add(new Book("203","Discrete Mathematics", "12","Advanced","Math","English","Oxford Press"));
        list.add(new Book("207","The Elegant Universe", "12","Advanced","Science","Arabic","O'Raily"));
        list.add(new Book("963","Histories", "26","Advanced","History","Arabic","MIT"));
        list.add(new Book("753","To kill a Mockingbird", "12","Advanced","Literature","English","Oxford Press"));

        list.add(new Book("973","Lolita", "12","Beginner","Literature","German","MIT"));
        list.add(new Book("346","Statistics", "12","Intermediate","Math","Arabic","O'Raily"));
        list.add(new Book("126","Night", "26","Beginner","History","English","MIT"));
        list.add(new Book("427","Surely You're Joking", "12","Beginner","Science","Arabic","O'Raily"));
        list.add(new Book("456","Calculus I", "12","Beginner","Math","German","MIT"));

        list.add(new Book("342","Physics of the Impossible", "12","Advanced","Science","English","O'Raily"));
        list.add(new Book("258","Stalingrad", "25","Advanced","History","Arabic","MIT"));
        list.add(new Book("149","A Crack in Creation", "12","Advanced","Science","French","O'Raily"));
        list.add(new Book("202","Salt", "25","Advanced","History","Arabic","MIT"));
        list.add(new Book("777","Bad Science", "12","Advanced","Science","Arabic","MIT"));

        list.add(new Book("555","Frankenstein", "12","Beginner","Science","Arabic","Cambridge Press"));
        list.add(new Book("576","Hiroshima", "25","Beginner","History","English","O'Raily"));
        list.add(new Book("826","Moby Dick", "12","Advanced","Literature","German","MIT"));
        list.add(new Book("716","The Time Machine", "12","Intermediate","Science","Arabic","MIT"));
        list.add(new Book("423","The ILIAD", "25","Intermediate","History","English","Cambridge Press"));

        list.add(new Book("498","The Great Gatsby", "12","Intermediate","Literature","French","Cambridge Press"));
        list.add(new Book("485","Beloved", "24","Intermediate","History","Arabic","O'Raily"));
        list.add(new Book("458","The Universe in a nutshell", "12","Intermediate","Science","English","MIT"));
        list.add(new Book("362","Geometry II", "12","Intermediate","Math","German","Cambridge Press"));
        list.add(new Book("371","The Age of Revolution", "24","Intermediate","History","English","O'Raily"));

        return list;
    }

}
