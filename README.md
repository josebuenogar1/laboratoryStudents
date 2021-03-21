# Api rest app for lab student record
This is a branch to deploy your app with aws beanstalk. 

---
## Getting Started

1. Download or clone the code.
2. Open  pom.xml file as a project (intelilliJ).
3. Create aws beanstalk enviroment [link](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/java-getstarted.html) 
4. Add AWS RDS to your enviroment. 
5. Connect your RDS instance to pgadmin.[link](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ConnectToPostgreSQLInstance.html)
6. Add your tables to your database. [tables](https://github.com/josebuenogar1/laboratoryStudents/blob/main/README.md#database)
7. Add info about your DB conection in your app. <br/>
   [file](https://github.com/josebuenogar1/laboratoryStudents/blob/aws_rds/src/main/resources/application.properties) 
8. Generate the .jar file and upload to aws beanstalk.
9. Open the link to the project.
