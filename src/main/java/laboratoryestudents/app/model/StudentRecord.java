
package laboratoryestudents.app.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments",schema = "public")
public class StudentRecord {

    /**
    this is generated by workstation_date_hour
     */
    @Id
    @Column(name = "student_record_id")
    private String studentRecordId;

    @Column(name = "work_station")
    private String workStation;

    private Date date_id;
    private String hour_number;


    @NotEmpty(message="Please enter your name")
    private String name;

    /**
     * this is "matrícula".
     */
    @NotEmpty(message="Please enter your id")
    @Column(name = "id_student")
    private String idStudent;

    @NotEmpty(message=" Empty please enter your e-mail address")
    @Email(message="Please enter a valid e-mail address")
    private String email;

    /**
     * this si "integrantes del equipo".
     */
    private String member1;
    private String member2;
    private String member3;
    private String member4;
    private String member5;
    private String member6;
    private String member7;
    private String material;

    //@Column(name = "creation_time")
    private LocalDateTime creation_time = LocalDateTime.now();

    /**
     * Don't forget getters and setter.
     */


    public String getMember1() {
        return member1;
    }

    public void setMember1(String member1) {
        this.member1 = member1;
    }

    public String getMember2() {
        return member2;
    }

    public void setMember2(String member2) {
        this.member2 = member2;
    }

    public String getMember3() {
        return member3;
    }

    public void setMember3(String member3) {
        this.member3 = member3;
    }

    public String getMember4() {
        return member4;
    }

    public void setMember4(String member4) {
        this.member4 = member4;
    }

    public String getMember5() {
        return member5;
    }

    public void setMember5(String member5) {
        this.member5 = member5;
    }

    public String getMember6() {
        return member6;
    }

    public void setMember6(String member6) {
        this.member6 = member6;
    }

    public String getMember7() {
        return member7;
    }

    public void setMember7(String member7) {
        this.member7 = member7;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public String getStudentRecordId() {
        return studentRecordId;
    }

    public void setStudentRecordId(String studentRecordId) {
        this.studentRecordId = studentRecordId;
    }

    public void setStudentRecordId(String workStation, Date date_id, String hour_number) {
        this.workStation=workStation;
        this.date_id=date_id;
        this.hour_number=hour_number;
        this.studentRecordId = workStation + '_' + date_id + '_' + hour_number;
    }

    public Date getDate_id() {
        return date_id;
    }

    public void setDate_id(Date date_id) {
        this.date_id = date_id;
    }

    public String getHour_number() {
        return hour_number;
    }

    public void setHour_number(String hour_number) {
        this.hour_number = hour_number;
    }

    public LocalDateTime getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(LocalDateTime creation_time) {
        this.creation_time = creation_time;
    }

    @Override
    public String toString() {
        return "StudentRecord{" +
                "studentRecordId='" + studentRecordId + '\'' +
                ", workStation='" + workStation + '\'' +
                ", date_id=" + date_id +
                ", hour_number='" + hour_number + '\'' +
                ", name='" + name + '\'' +
                ", idStudent='" + idStudent + '\'' +
                ", email='" + email + '\'' +
                ", member1='" + member1 + '\'' +
                ", member2='" + member2 + '\'' +
                ", member3='" + member3 + '\'' +
                ", member4='" + member4 + '\'' +
                ", member5='" + member5 + '\'' +
                ", member6='" + member6 + '\'' +
                ", member7='" + member7 + '\'' +
                ", material='" + material + '\'' +
                ", creation_time=" + creation_time +
                '}';
    }
}