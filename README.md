# Spring Boot Mircro Servico Deploy Kubernetes

# Autor
- Maike Silva - maikejo@gmail.com

## Versao Usada
- Spring Boot - 2.2.0-M1

## Comandos Imagem Docker
mvn clean package
docker build -t us.gcr.io/{ID-PROJETO-GOOGLE}/spring-microservicos-bv:1.0.0 .
docker run -p 8080:8080 us.gcr.io/{ID-PROJETO-GOOGLE}/spring-microservicos-bv

## Comandos Publicação Docker
gcloud auth configure-docker
docker push us.gcr.io/{ID-PROJETO-GOOGLE}/spring-microservicos-bv
 
## Comando Deploy Gcloud
gcloud container clusters get-credentials {NOME-CLUSTER-CRIADO}	--zone us-central1-c --project {ID-PROJETO-GOOGLE}
kubectl apply -f deployment.yaml

## Teste local do serviço
kubectl port-forward svc/spring-microservicos-bv-service 8080:8080

## Comandos Consulta
kubectl get pods
kubectl get service
kubectl cluster-info
kubectl delete -f deployment.yaml