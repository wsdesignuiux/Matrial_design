package model;

public class Alumbs1_model {
    Integer image1;

    public Integer getImage1() {
        return image1;
    }

    public void setImage1(Integer image1) {
        this.image1 = image1;
    }

    public String getTv1() {
        return tv1;
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    String tv1;

    public Alumbs1_model(Integer image1, String tv1) {
        this.image1 = image1;
        this.tv1 = tv1;
    }
}
