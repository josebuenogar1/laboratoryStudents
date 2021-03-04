package laboratoryestudents.app.model;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "siemmens")
public class Siemmens extends DatabaseTemplate {
    public Siemmens(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public Date getDate_id() {
        return super.getDate_id();
    }

    @Override
    public void setDate_id(Date date_id) {
        super.setDate_id(date_id);
    }

    @Override
    public Boolean getSeven_am() {
        return super.getSeven_am();
    }

    @Override
    public void setSeven_am(Boolean seven_am) {
        super.setSeven_am(seven_am);
    }

    @Override
    public Boolean getEight_am() {
        return super.getEight_am();
    }

    @Override
    public void setEight_am(Boolean eight_am) {
        super.setEight_am(eight_am);
    }

    @Override
    public Boolean getNine_am() {
        return super.getNine_am();
    }

    @Override
    public void setNine_am(Boolean nine_am) {
        super.setNine_am(nine_am);
    }

    @Override
    public Boolean getTen_am() {
        return super.getTen_am();
    }

    @Override
    public void setTen_am(Boolean ten_am) {
        super.setTen_am(ten_am);
    }

    @Override
    public Boolean getEleven_am() {
        return super.getEleven_am();
    }

    @Override
    public void setEleven_am(Boolean eleven_am) {
        super.setEleven_am(eleven_am);
    }

    @Override
    public Boolean getTwelve_am() {
        return super.getTwelve_am();
    }

    @Override
    public void setTwelve_am(Boolean twelve_am) {
        super.setTwelve_am(twelve_am);
    }

    @Override
    public Boolean getOne_pm() {
        return super.getOne_pm();
    }

    @Override
    public void setOne_pm(Boolean one_pm) {
        super.setOne_pm(one_pm);
    }

    @Override
    public Boolean getTwo_pm() {
        return super.getTwo_pm();
    }

    @Override
    public void setTwo_pm(Boolean two_pm) {
        super.setTwo_pm(two_pm);
    }

    @Override
    public Boolean getThree_pm() {
        return super.getThree_pm();
    }

    @Override
    public void setThree_pm(Boolean three_pm) {
        super.setThree_pm(three_pm);
    }

    @Override
    public Boolean getFour_pm() {
        return super.getFour_pm();
    }

    @Override
    public void setFour_pm(Boolean four_pm) {
        super.setFour_pm(four_pm);
    }

    @Override
    public Boolean getFive_pm() {
        return super.getFive_pm();
    }

    @Override
    public void setFive_pm(Boolean five_pm) {
        super.setFive_pm(five_pm);
    }

    @Override
    public Boolean getSix_pm() {
        return super.getSix_pm();
    }

    @Override
    public void setSix_pm(Boolean six_pm) {
        super.setSix_pm(six_pm);
    }

    @Override
    public Boolean getSeven_pm() {
        return super.getSeven_pm();
    }

    @Override
    public void setSeven_pm(Boolean seven_pm) {
        super.setSeven_pm(seven_pm);
    }

    @Override
    public Boolean getEight_pm() {
        return super.getEight_pm();
    }

    @Override
    public void setEight_pm(Boolean eight_pm) {
        super.setEight_pm(eight_pm);
    }

    @Override
    public Boolean getNine_pm() {
        return super.getNine_pm();
    }

    @Override
    public void setNine_pm(Boolean nine_pm) {
        super.setNine_pm(nine_pm);
    }


}