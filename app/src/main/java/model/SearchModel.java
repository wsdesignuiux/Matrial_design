package model;

/**
 * Created by wolfsoft4 on 28/11/18.
 */

public class SearchModel {

    Integer img,imgmore;
    String txtbeoplay,txtbang,txtprice;

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public Integer getImgmore() {
        return imgmore;
    }

    public void setImgmore(Integer imgmore) {
        this.imgmore = imgmore;
    }

    public String getTxtbeoplay() {
        return txtbeoplay;
    }

    public void setTxtbeoplay(String txtbeoplay) {
        this.txtbeoplay = txtbeoplay;
    }

    public String getTxtbang() {
        return txtbang;
    }

    public void setTxtbang(String txtbang) {
        this.txtbang = txtbang;
    }

    public String getTxtprice() {
        return txtprice;
    }

    public void setTxtprice(String txtprice) {
        this.txtprice = txtprice;
    }

    public SearchModel(Integer img, Integer imgmore, String txtbeoplay, String txtbang, String txtprice) {
        this.img = img;
        this.imgmore = imgmore;
        this.txtbeoplay = txtbeoplay;
        this.txtbang = txtbang;
        this.txtprice = txtprice;
    }
}
