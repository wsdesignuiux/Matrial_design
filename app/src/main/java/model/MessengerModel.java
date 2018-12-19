package model;

/**
 * Created by wolfsoft4 on 1/12/18.
 */

public class MessengerModel {

    Integer profileimage;
    String txtbirthdaygift,txtsandraadams,txtweek,txtyear;


    public Integer getProfileimage() {
        return profileimage;
    }

    public void setProfileimage(Integer profileimage) {
        this.profileimage = profileimage;
    }

    public String getTxtbirthdaygift() {
        return txtbirthdaygift;
    }

    public void setTxtbirthdaygift(String txtbirthdaygift) {
        this.txtbirthdaygift = txtbirthdaygift;
    }

    public String getTxtsandraadams() {
        return txtsandraadams;
    }

    public void setTxtsandraadams(String txtsandraadams) {
        this.txtsandraadams = txtsandraadams;
    }

    public String getTxtweek() {
        return txtweek;
    }

    public void setTxtweek(String txtweek) {
        this.txtweek = txtweek;
    }

    public String getTxtyear() {
        return txtyear;
    }

    public void setTxtyear(String txtyear) {
        this.txtyear = txtyear;
    }

    public MessengerModel(Integer profileimage, String txtbirthdaygift, String txtsandraadams, String txtweek, String txtyear) {
        this.profileimage = profileimage;
        this.txtbirthdaygift = txtbirthdaygift;
        this.txtsandraadams = txtsandraadams;
        this.txtweek = txtweek;
        this.txtyear = txtyear;
    }
}
