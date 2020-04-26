# Spring Boot Mircro Servico Deploy Kubernetes

## Versao Usada
- Spring Boot - 2.2.0-M1
- H2 Database - 1.4.197

## Comandos Imagem Docker
mvn clean package
docker build -t us.gcr.io/animal-home-care/spring-microservicos-bv:1.0.0 .
docker run -p 8080:8080 us.gcr.io/animal-home-care/spring-microservicos-bv:1.0.0

## Comandos Publicação Docker
gcloud auth configure-docker
docker push us.gcr.io/animal-home-care/spring-microservicos-bv:1.0.0
 
## Comando Deploy Gcloud
gcloud container clusters get-credentials cluster-microservicos --zone us-central1-c --project animal-home-care
kubectl apply -f deployment.yaml

## Comandos Consulta
kubectl get pods
kubectl get service
kubectl cluster-info
kubectl delete -f deployment.yaml