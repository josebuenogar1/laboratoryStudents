# Api rest app for lab student record
This is a branch to deploy your app with kubernetes.

---

## Getting Started

# Prerequisites
1. Intelillij.
2. docker installed and docker hub account.
3. minikube and kubectl installed.

# Installing
1. Download or clone the code.
2. Open  pom.xml file as a project (intelilliJ).
   
3. Configuring the database postgres: 
   3.1 Edit lab-secret.yml with your user and password in base64.
   3.2 Edit lab-configmap.yml with your database name.
   3.3 Run: kubectl apply -f lab-secret.yml
   3.3 Run: kubectl apply -f lab-configmap.yml 
   3.3 Run: kubectl apply -f lab-postgres.yml
   
4. Create database on your pod:
   4.1 Run: kubectl exec -it <pod> --/bin/bash/
   4.2 Inside container run: psql -U postgres 
   4.3 Inside psql run: create database laboratory;
   4.4 Follow this section to insert tables and values [link](https://github.com/josebuenogar1/laboratoryStudents/blob/main/README.md#create-tables) 
   
5. Edit application.properties with your user, password, and url with your service(lab-postgres-service) and database.
   
6. Generate .jar package with maven.
   
7. Create image and push to Docker Hub with:
   7.1 Run: docker build -t andresbueno/lab-image .
   7.2 Run: docker push andresbueno/lab-image
   
8. Create deployment for the app:
   8.1 Edit lab-deployment.yaml with your image. 
   8.2 Edit nodePort to external service.
   8.3 Run: kubectl apply -f lab-deployment.yml
   
9. Start service with: minikube service lab-service

