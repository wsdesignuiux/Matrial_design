package model;

/**
 * Created by wolfsoft3 on 3/12/18.
 */

public class Item_Gmail_Model {
    String titile,sub_titile,description;

    public Item_Gmail_Model(String titile, String sub_titile, String description) {
        this.titile = titile;
        this.sub_titile = sub_titile;
        this.description = description;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getSub_titile() {
        return sub_titile;
    }

    public void setSub_titile(String sub_titile) {
        this.sub_titile = sub_titile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
