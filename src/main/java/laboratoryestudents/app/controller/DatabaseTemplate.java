package laboratoryestudents.app.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;


public class DatabaseTemplate {
    private Date date_id;
    private Boolean seven_am;
    private Boolean eight_am;
    private Boolean nine_am;
    private Boolean ten_am;
    private Boolean eleven_am;
    private Boolean twelve_am;
    private Boolean one_pm;
    private Boolean two_pm;
    private Boolean three_pm;
    private Boolean four_pm;
    private Boolean five_pm;
    private Boolean six_pm;
    private Boolean seven_pm;
    private Boolean eight_pm;
    private Boolean nine_pm;

    public DatabaseTemplate() {}


    public Date getDate_id() {
        return date_id;
    }

    public void setDate_id(Date date_id) {
        this.date_id = date_id;
    }


    public Boolean getSeven_am() {
        return seven_am;
    }

    public void setSeven_am(Boolean seven_am) {
        this.seven_am = seven_am;
    }

    public Boolean getEight_am() {
        return eight_am;
    }

    public void setEight_am(Boolean eight_am) {
        this.eight_am = eight_am;
    }

    public Boolean getNine_am() {
        return nine_am;
    }

    public void setNine_am(Boolean nine_am) {
        this.nine_am = nine_am;
    }

    public Boolean getTen_am() {
        return ten_am;
    }

    public void setTen_am(Boolean ten_am) {
        this.ten_am = ten_am;
    }

    public Boolean getEleven_am() {
        return eleven_am;
    }

    public void setEleven_am(Boolean eleven_am) {
        this.eleven_am = eleven_am;
    }

    public Boolean getTwelve_am() {
        return twelve_am;
    }

    public void setTwelve_am(Boolean twelve_am) {
        this.twelve_am = twelve_am;
    }

    public Boolean getOne_pm() {
        return one_pm;
    }

    public void setOne_pm(Boolean one_pm) {
        this.one_pm = one_pm;
    }

    public Boolean getTwo_pm() {
        return two_pm;
    }

    public void setTwo_pm(Boolean two_pm) {
        this.two_pm = two_pm;
    }

    public Boolean getThree_pm() {
        return three_pm;
    }

    public void setThree_pm(Boolean three_pm) {
        this.three_pm = three_pm;
    }

    public Boolean getFour_pm() {
        return four_pm;
    }

    public void setFour_pm(Boolean four_pm) {
        this.four_pm = four_pm;
    }

    public Boolean getFive_pm() {
        return five_pm;
    }

    public void setFive_pm(Boolean five_pm) {
        this.five_pm = five_pm;
    }

    public Boolean getSix_pm() {
        return six_pm;
    }

    public void setSix_pm(Boolean six_pm) {
        this.six_pm = six_pm;
    }

    public Boolean getSeven_pm() {
        return seven_pm;
    }

    public void setSeven_pm(Boolean seven_pm) {
        this.seven_pm = seven_pm;
    }

    public Boolean getEight_pm() {
        return eight_pm;
    }

    public void setEight_pm(Boolean eight_pm) {
        this.eight_pm = eight_pm;
    }

    public Boolean getNine_pm() {
        return nine_pm;
    }

    public void setNine_pm(Boolean nine_pm) {
        this.nine_pm = nine_pm;
    }
}
