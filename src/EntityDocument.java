import org.w3c.dom.NodeList;

import java.util.List;


public class EntityDocument {

    public  String  id;
    public  String  title;
    public  String  author;
    public  String  creationDate;
    public  String  registrationDate;
    public  String  status;
    public int c;
    public EntityDocument( String  id, String title, String  author,  String creationDate,  String egistrationDate, String status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.creationDate = creationDate;
        this.registrationDate = registrationDate;
        this.status = status;
    }



    public EntityDocument(String id, String title) {

        this(id, title, null, null, null, null);
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "Documents{" +
                "Title:'" + title + '\'' +
                ", Id:" + id +
                ", Author:" + author +
                ", Datecreate:" + creationDate +
                ", Dateregistration:" + registrationDate +
                ", Status:" + status +
                '}';
       
    }

}
