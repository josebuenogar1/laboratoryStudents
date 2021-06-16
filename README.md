# Api rest app for lab student record
This is a branch to deploy your app with aws beanstalk.

---

## Getting Started

# Prerequisites
1. Intelillij
2. Postgres SQL
3. AWS acount

# Installing
1. Download or clone the code.
2. Open  pom.xml file as a project (intelilliJ).
3. Create aws beanstalk enviroment. [link](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/java-getstarted.html)
4. Add AWS RDS to your enviroment. </br>
   4.1 Add rule to connect 5432 port with pgadmin modifiying Security Groups.
5. Connect your RDS instance to pgadmin. [link](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ConnectToPostgreSQLInstance.html) </br>
   5.1 Create a database called 'laboratory'.
6. Add your tables to your database and insert values. [tables](https://github.com/josebuenogar1/laboratoryStudents/blob/main/README.md#database)
7. Add info about your DB conection in your app. 
   [file](https://github.com/josebuenogar1/laboratoryStudents/blob/aws_rds/src/main/resources/application.properties) <br/>
   7.1 Add your information about your login and password.
   [file](https://github.com/josebuenogar1/laboratoryStudents/blob/aws_rds/src/main/java/laboratoryestudents/app/configuration/SecurityConfig.java) <br/>
8. Generate the .jar file and upload to aws beanstalk.
9. Open the link to the project.


