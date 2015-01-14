package thatzit;

import java.util.Date;

public class Description {
    private Date date;
    private String message;

    public Description() {
        this("");
    }

    public Description(String message) {
        date = new Date();
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        if(date != null) {
            this.date = date;
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
