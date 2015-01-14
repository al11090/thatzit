package thatzit;

import java.util.List;
import java.util.LinkedList;

public class Question {
    private String title;
    private String password;
    private int id;
    private QuestionGenre genre;
    private int status;
    private int likes;
    private boolean deleted=false;
    private List<Description> descriptions;

    public Question() {
        status = 1;
        likes = 0;
        descriptions = new LinkedList<Description>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumDescription() {
        return descriptions.size();
    }

    public void setId(int id){
    	this.id=id;
    }
    public int getId(){
    	return id;
    }
    public Description getDescription(int index) {
        if(index < getNumDescription()) {
            return descriptions.get(index);
        }
        else {
            return null;
        }
    }

    public void appendDescription(Description description) {
        if(description != null) {
            descriptions.add(description);
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public QuestionGenre getGenre() {
        return genre;
    }

    public void setGenre(QuestionGenre genre) {
        this.genre = genre;
    }

    public boolean isClosed() {
        if(status == 2) {
            return true;
        }
        else {
            return false;
        }
    }

    public void close() {
        status = 2;
    }

    public void like() {
        likes = likes + 1;
    }

    public void report() {
        status = 3;
    }

    public void delete() {
  deleted=true;
    }
    public boolean getDeleted(){
    	return deleted;
    }
}
