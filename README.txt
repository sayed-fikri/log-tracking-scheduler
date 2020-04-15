Demo-Backend-Application[Mobile Assestment]

This demo represents simple spring REST application that uses

Spring boot 2.1.1
Postgres SQL

Pre-requisite
Maven 2.x or Maven 3.x
Command prompt

Installation
Clone this repository
Open the cloned folder
Run command prompt (windows), type in mvn spring-boot:run

Swagger
List of APIs are documented using swagger. You may access it by running http://localhost:5000/swagger-ui.html#/

Building war file
mvn -DskipTests=true -o clean package

Configuration cron scheduler
-LoggerService.Impl
-SchedulerService.Impl

Separate Tomcat Logger Config
-log4j.xml
-application.properties
-pom.xml
