package model;

public class Contact_model {

    Integer image;
    String text_letter,username;

    public Contact_model(Integer image, String text_letter, String username) {
        this.image = image;
        this.text_letter = text_letter;
        this.username = username;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getText_letter() {
        return text_letter;
    }

    public void setText_letter(String text_letter) {
        this.text_letter = text_letter;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
