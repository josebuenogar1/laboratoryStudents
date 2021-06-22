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
2. Open [pom.xml](https://github.com/josebuenogar1/laboratoryStudents/blob/kubernetes/pom.xml) file as a project (intelilliJ).
   
3. Configuring the database postgres: </br>
   3.1 Edit [lab-secret.yml](https://github.com/josebuenogar1/laboratoryStudents/blob/kubernetes/kubernetes-files/lab-secret.yml) with your user and password in base64. </br>
   3.2 Edit [lab-configmap.yml](https://github.com/josebuenogar1/laboratoryStudents/blob/kubernetes/kubernetes-files/lab-configmap.yml) with your database name. </br>
   3.3 Edit [lab-postgres.yml](https://github.com/josebuenogar1/laboratoryStudents/blob/kubernetes/kubernetes-files/lab-postgres.yml) with your directory to volumes>hostPath>path. </br>
   3.4 Run ```kubectl apply -f lab-secret.yml``` </br>
   3.5 Run ```kubectl apply -f lab-configmap.yml```  </br>
   3.6 Run ```kubectl apply -f lab-postgres.yml``` </br>
   
4. Create database on your pod: </br>
   4.1 Run ```kubectl exec -it <pod> --/bin/bash/``` </br>
   4.2 Inside container run ```psql -U postgres``` </br>
   4.3 Inside psql run ```\connect laboratory;``` </br>
   4.4 Follow this section to insert tables and values [link](https://github.com/josebuenogar1/laboratoryStudents/blob/main/README.md#create-tables) </br> 
   
5. Edit [application.properties](https://github.com/josebuenogar1/laboratoryStudents/blob/kubernetes/src/main/resources/application.properties) with your user, password, and url with your service(lab-postgres-service) and database. 
   
6. Generate .jar package with maven.
   
7. Create image and push to Docker Hub with: </br>
   7.1 Run ```docker build -t andresbueno/lab-image .``` </br>
   7.2 Run ```docker push andresbueno/lab-image``` </br>
   
8. Create deployment for the app: </br>
   8.1 Edit [lab-deployment.yaml](https://github.com/josebuenogar1/laboratoryStudents/blob/kubernetes/kubernetes-files/lab-deployment.yml) with your image. </br> 
   8.2 Edit nodePort to external service. </br>
   8.3 Run ```kubectl apply -f lab-deployment.yml``` </br>
   
9. Start service with ```minikube service lab-service``` 

