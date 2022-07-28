package CHP_Diary;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Entry {
    private final String id;
    private String body;
    private String title;
    private final LocalDate dateCreated = LocalDate.now();

    public Entry(String title, String body) {
        this(UUID.randomUUID().toString(), title, body);
    }

    public Entry(String id, String title, String body) {
        if (title.length() == 0) {
            throw new IllegalArgumentException("Title can not be empty");
        }
        if (body.isEmpty()) {
            throw new IllegalArgumentException("Body can not be empty");
        }
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        if(title == null){
            throw new NullPointerException();
        }
        this.title = title;
    }

    public String getTitle() {

        return title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void editEntry(String body, String title) {
        this.body = body;
        this.title = title;

    }

//    @Override
//    public String toString() {
//        return ("Body :" + getBody()+
//                "\nTitle :"+ getTitle() +
//                "\nID: " + getId() +
//                "\nDate :" + getDateCreated());
//    }

    @Override
    public String toString() {
        String store ="""
                 id ->  %s
                 body -> %s
                 title -> %s
                 date -> %s
                """; return store.formatted(getId(),getBody(),getTitle(),getDate());
    }

    private LocalDate getDate() {
        return dateCreated;
    }


}


