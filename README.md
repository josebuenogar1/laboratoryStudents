# Api rest app for record of laboratory students

##DataBase

### Create database pgAdmin
https://www.pgadmin.org/docs/pgadmin4/4.27/database_dialog.html
### create tables
```sql
CREATE TABLE allen_network
(
date_id date NOT NULL,
seven_am boolean NOT NULL DEFAULT false,
eight_am boolean NOT NULL DEFAULT false,
nine_am boolean NOT NULL DEFAULT false,
ten_am boolean NOT NULL DEFAULT false,
eleven_am boolean NOT NULL DEFAULT false,
twelve_am boolean NOT NULL DEFAULT false,
one_pm boolean NOT NULL DEFAULT false,
two_pm boolean NOT NULL DEFAULT false,
three_pm boolean NOT NULL DEFAULT false, 
four_pm boolean NOT NULL DEFAULT false,
five_pm boolean NOT NULL DEFAULT false,
six_pm boolean NOT NULL DEFAULT false,
seven_pm boolean NOT NULL DEFAULT false,
eight_pm boolean NOT NULL DEFAULT false,
nine_pm boolean NOT NULL DEFAULT false,
CONSTRAINT allen_network_pkey PRIMARY KEY (date_id)
);

CREATE TABLE allen_neumatic
(
date_id date NOT NULL,
seven_am boolean NOT NULL DEFAULT false,
eight_am boolean NOT NULL DEFAULT false,
nine_am boolean NOT NULL DEFAULT false,
ten_am boolean NOT NULL DEFAULT false,
eleven_am boolean NOT NULL DEFAULT false,
twelve_am boolean NOT NULL DEFAULT false,
one_pm boolean NOT NULL DEFAULT false,
two_pm boolean NOT NULL DEFAULT false,
three_pm boolean NOT NULL DEFAULT false, 
four_pm boolean NOT NULL DEFAULT false,
five_pm boolean NOT NULL DEFAULT false,
six_pm boolean NOT NULL DEFAULT false,
seven_pm boolean NOT NULL DEFAULT false,
eight_pm boolean NOT NULL DEFAULT false,
nine_pm boolean NOT NULL DEFAULT false,
CONSTRAINT allen_neumatic_pkey PRIMARY KEY (date_id)
);

CREATE TABLE siemmens
(
date_id date NOT NULL,
seven_am boolean NOT NULL DEFAULT false,
eight_am boolean NOT NULL DEFAULT false,
nine_am boolean NOT NULL DEFAULT false,
ten_am boolean NOT NULL DEFAULT false,
eleven_am boolean NOT NULL DEFAULT false,
twelve_am boolean NOT NULL DEFAULT false,
one_pm boolean NOT NULL DEFAULT false,
two_pm boolean NOT NULL DEFAULT false,
three_pm boolean NOT NULL DEFAULT false, 
four_pm boolean NOT NULL DEFAULT false,
five_pm boolean NOT NULL DEFAULT false,
six_pm boolean NOT NULL DEFAULT false,
seven_pm boolean NOT NULL DEFAULT false,
eight_pm boolean NOT NULL DEFAULT false,
nine_pm boolean NOT NULL DEFAULT false,
CONSTRAINT siemmens_pkey PRIMARY KEY (date_id)
);
```

### insert values from cvs 
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
VALUES ("2021-03-01"),
       ("2021-03-02"),
       ("2021-03-03"),
       ("2021-03-04"),
       ("2021-03-05");
```