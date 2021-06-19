# Api rest app for lab student record
This is a web app used to register lab students. <br/><br/>


<img src="https://github.com/josebuenogar1/laboratoryStudents/blob/main/images/animation.gif" width="500" height="500"/> <br/><br/>

---
It shows availability. <br/>
<img src="https://github.com/josebuenogar1/laboratoryStudents/blob/main/images/hours.PNG" width="500" height="500"/> <br/><br/>
---
It checks all fields needed. <br/>
<img src="https://github.com/josebuenogar1/laboratoryStudents/blob/main/images/student_record.PNG" width="500" height="500"/> <br/><br/>
---
<img src="https://github.com/josebuenogar1/laboratoryStudents/blob/main/images/student_record_2.PNG" width="500" height="500"/> <br/><br/>
---

You can export your register to PDF. <br/><br/>
<img src="https://github.com/josebuenogar1/laboratoryStudents/blob/main/images/register_complete.PNG" /> <br/><br/>
PDF generated. <br/><br/>
<img src="https://github.com/josebuenogar1/laboratoryStudents/blob/main/images/exportPDF.PNG" width="500" height="500"/> <br/><br/>
---
## Getting Started

### Prerequisites
1. Intelillij
2. Postgres SQL


### Installing
1. Download or clone the code.
2. Open  pom.xml file as a project (intelilliJ).
3. [Create DB](#DataBase)
4. Add info about your DB conection. 
   [file](https://github.com/josebuenogar1/laboratoryStudents/blob/main/src/main/resources/application.properties) <br/>
4.1  Add your information about your login and password [file](https://github.com/josebuenogar1/laboratoryStudents/blob/main/src/main/java/laboratoryestudents/app/configuration/SecurityConfig.java)<br/>
5. Run [AppApplication](https://github.com/josebuenogar1/laboratoryStudents/blob/main/src/main/java/laboratoryestudents/app/AppApplication.java).
6. Open localhost:8080.

Note: if you can deploy in aws go to aws_rds branch. </br>
Note 2: if you can deploy in kubernetes go to kubernetes branch.

## Running the tests

1. Create your class under [folder](https://github.com/josebuenogar1/laboratoryStudents/tree/main/src/test/java/com/RecordlaboratoryEstudents/app).
2. Add your class on [testng.xml](https://github.com/josebuenogar1/laboratoryStudents/blob/main/testng.xml).
3. Run testng.xml.

## DataBase

### Create database pgAdmin 
Create a new data base called **laboratory.** <br/><br/>
https://www.pgadmin.org/docs/pgadmin4/4.27/database_dialog.html

### Create tables
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
    student_record_id character varying(50) NOT NULL,
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

### Insert values
```sql
create or replace function set_allen_network_table(len_from date, len_to int)
returns void
language plpgsql
as
$$
declare
   tempo date;
   counter integer := 0;
begin
tempo :=len_from;
while counter < len_to loop
      INSERT INTO public.allen_network(date_id) VALUES (tempo);
	  counter := counter + 1;
	  tempo := tempo + INTERVAL '1 day';
   end loop;
end;
$$;

--params: start date, days from start date
SELECT  set_allen_network_table('2021-03-20',30);


create or replace function set_allen_neumatic_table(len_from date, len_to int)
returns void
language plpgsql
as
$$
declare
   tempo date;
   counter integer := 0;
begin
tempo :=len_from;
while counter < len_to loop
      INSERT INTO public.allen_neumatic(date_id) VALUES (tempo);
	  counter := counter + 1;
	  tempo := tempo + INTERVAL '1 day';
   end loop;
end;
$$;

--params: start date, days from start date
SELECT  set_allen_neumatic_table('2021-03-20',30);


create or replace function set_siemmens_table(len_from date, len_to int)
returns void
language plpgsql
as
$$
declare
   tempo date;
   counter integer := 0;
begin
tempo :=len_from;
while counter < len_to loop
      INSERT INTO public.siemmens(date_id) VALUES (tempo);
	  counter := counter + 1;
	  tempo := tempo + INTERVAL '1 day';
   end loop;
end;
$$;

--params: start date, days from start date
SELECT  set_siemmens_table('2021-03-20',30);


```