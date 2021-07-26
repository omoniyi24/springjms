# SpringJMS

This project shows a simple implementation for Spring JMS

##To start ActiveMQ in docker container

Create a Dockerfile, a script file with following instructions.

```yaml
FROM openjdk:8-jre-alpine
RUN wget -O activemq.tar.gz http://archive.apache.org/dist/activemq/5.15.6/apache-activemq-5.15.6-bin.tar.gz 
RUN tar -xzf activemq.tar.gz 
CMD ["apache-activemq-5.15.6/bin/activemq", "console"]
```
To build the Image, navigate to the path you have the Dockerfile 
and run the command below:

```yaml
sudo docker  build  -t jayjav-activemq .
```
Run image: 

```yaml 
docker run -d --name myactivemq -p 61616:61616 -p 8161:8161 jayjav-activemq
```
