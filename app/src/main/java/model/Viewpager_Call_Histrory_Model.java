package model;

/**
 * Created by wolfsoft3 on 3/12/18.
 */

public class Viewpager_Call_Histrory_Model {
    String name;
    Integer image, misscall;

    public Viewpager_Call_Histrory_Model(String name, Integer image, Integer misscall) {
        this.name = name;
        this.image = image;
        this.misscall = misscall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getMisscall() {
        return misscall;
    }

    public void setMisscall(Integer misscall) {
        this.misscall = misscall;
    }
}
