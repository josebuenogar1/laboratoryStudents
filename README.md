# Api rest app for lab student record
This is a web app used to register lab students. <br/>
 
![home](https://github.com/josebuenogar1/laboratoryStudents/blob/main/images/home.PNG) <br/>

---

It allows see availability. <br/>
<img src="https://github.com/josebuenogar1/laboratoryStudents/blob/main/images/hours.PNG" width="250" height="250"/> <br/>
---
It checks all fields needed. <br/>
![student_record](https://github.com/josebuenogar1/laboratoryStudents/blob/main/images/student_record.PNG) <br/>

---
![student_record_2](https://github.com/josebuenogar1/laboratoryStudents/blob/main/images/student_record_2.PNG) <br/>

---

You can export you register to PDF. <br/>

![register_complete](https://github.com/josebuenogar1/laboratoryStudents/blob/main/images/register_complete.PNG) <br/>

![exportPDF](https://github.com/josebuenogar1/laboratoryStudents/blob/main/images/exportPDF.PNG) <br/>

---
## DataBase

### Create database pgAdmin
https://www.pgadmin.org/docs/pgadmin4/4.27/database_dialog.html
### create tables
```sql
CREATE TABLE allen_network
(
date_id   DATE    NOT NULL,
seven_am  BOOLEAN NOT NULL DEFAULT TRUE,
eight_am  BOOLEAN NOT NULL DEFAULT TRUE,
nine_am   BOOLEAN NOT NULL DEFAULT TRUE,
ten_am    BOOLEAN NOT NULL DEFAULT TRUE,
eleven_am BOOLEAN NOT NULL DEFAULT TRUE,
twelve_am BOOLEAN NOT NULL DEFAULT TRUE,
one_pm    BOOLEAN NOT NULL DEFAULT TRUE,
two_pm    BOOLEAN NOT NULL DEFAULT TRUE,
three_pm  BOOLEAN NOT NULL DEFAULT TRUE, 
four_pm   BOOLEAN NOT NULL DEFAULT TRUE,
five_pm   BOOLEAN NOT NULL DEFAULT TRUE,
six_pm    BOOLEAN NOT NULL DEFAULT TRUE,
seven_pm  BOOLEAN NOT NULL DEFAULT TRUE,
eight_pm  BOOLEAN NOT NULL DEFAULT TRUE,
nine_pm   BOOLEAN NOT NULL DEFAULT TRUE,
CONSTRAINT allen_network_pkey PRIMARY KEY (date_id)
);


CREATE TABLE allen_neumatic
(
date_id   DATE    NOT NULL,
seven_am  BOOLEAN NOT NULL DEFAULT TRUE,
eight_am  BOOLEAN NOT NULL DEFAULT TRUE,
nine_am   BOOLEAN NOT NULL DEFAULT TRUE,
ten_am    BOOLEAN NOT NULL DEFAULT TRUE,
eleven_am BOOLEAN NOT NULL DEFAULT TRUE,
twelve_am BOOLEAN NOT NULL DEFAULT TRUE,
one_pm    BOOLEAN NOT NULL DEFAULT TRUE,
two_pm    BOOLEAN NOT NULL DEFAULT TRUE,
three_pm  BOOLEAN NOT NULL DEFAULT TRUE, 
four_pm   BOOLEAN NOT NULL DEFAULT TRUE,
five_pm   BOOLEAN NOT NULL DEFAULT TRUE,
six_pm    BOOLEAN NOT NULL DEFAULT TRUE,
seven_pm  BOOLEAN NOT NULL DEFAULT TRUE,
eight_pm  BOOLEAN NOT NULL DEFAULT TRUE,
nine_pm   BOOLEAN NOT NULL DEFAULT TRUE,
CONSTRAINT allen_neumatic_pkey PRIMARY KEY (date_id)
);

CREATE TABLE siemmens
(
date_id   DATE    NOT NULL,
seven_am  BOOLEAN NOT NULL DEFAULT TRUE,
eight_am  BOOLEAN NOT NULL DEFAULT TRUE,
nine_am   BOOLEAN NOT NULL DEFAULT TRUE,
ten_am    BOOLEAN NOT NULL DEFAULT TRUE,
eleven_am BOOLEAN NOT NULL DEFAULT TRUE,
twelve_am BOOLEAN NOT NULL DEFAULT TRUE,
one_pm    BOOLEAN NOT NULL DEFAULT TRUE,
two_pm    BOOLEAN NOT NULL DEFAULT TRUE,
three_pm  BOOLEAN NOT NULL DEFAULT TRUE, 
four_pm   BOOLEAN NOT NULL DEFAULT TRUE,
five_pm   BOOLEAN NOT NULL DEFAULT TRUE,
six_pm    BOOLEAN NOT NULL DEFAULT TRUE,
seven_pm  BOOLEAN NOT NULL DEFAULT TRUE,
eight_pm  BOOLEAN NOT NULL DEFAULT TRUE,
nine_pm   BOOLEAN NOT NULL DEFAULT TRUE,
CONSTRAINT siemmens_pkey  PRIMARY KEY (date_id)
);

CREATE TABLE public.appointments
(
    student_record_id character varying(20) NOT NULL,
    work_station character varying(20) NOT NULL,
    date_id date NOT NULL,
    hour_number character varying(2) NOT NULL,
    name character varying(30) NOT NULL,
    id_student character varying(20) NOT NULL,
    email character varying(30) NOT NULL,
    member1 character varying(30),
    member2 character varying(30),
    member3 character varying(30),
    member4 character varying(30),
    member5 character varying(30),
    member6 character varying(30),
    member7 character varying(30),
	material character varying(50),
    creation_time timestamp with time zone NOT NULL,
    PRIMARY KEY (student_record_id)
);
```

### insert values
```sql
INSERT INTO allen_network(date_id) 
VALUES ('2021-03-01'),
       ('2021-03-02'),
       ('2021-03-03'),
       ('2021-03-04'),
       ('2021-03-05');

INSERT INTO allen_neumatic(date_id)
VALUES ('2021-03-01'),
       ('2021-03-02'),
       ('2021-03-03'),
       ('2021-03-04'),
       ('2021-03-05');

INSERT INTO siemmens(date_id) 
VALUES ('2021-03-01'),
       ('2021-03-02'),
       ('2021-03-03'),
       ('2021-03-04'),
       ('2021-03-05');
```