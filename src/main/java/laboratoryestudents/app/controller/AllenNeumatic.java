package laboratoryestudents.app.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class AllenNeumatic extends DatabaseTemplate {
    public AllenNeumatic(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Date getDate_id() {
        return super.getDate_id();
    }
}
