![img.png](img.png)
# Conversation-app
This project is an imitation of operator work. The program is developed using framework Spring Boot, Spring Data JPA and package util.concurrent.
# Features
* Add operator
* Get all conversation by operator
* Start generating conversations
* Get conversation by operator
* Skip conversation by operator
* Wait 15 second, and conversation comeback to queue 
* Close conversation by user
# Getting Started
* Clone repository with GitHub
* Build the project using Maven: ```mvn clean install```
* Run the project using Maven: ```mvn spring-boot:run```
# Structure
* controller: Servlets that handle HTTP requests and responses
    - OperatorController - GET ```/operators/add``` - get page for add operator 
    - OperatorController - GET ```/operators/conversation``` - get page for get conversation by operator 
    - OperatorController - GET ```/operators/conversation/return``` - return conversation to queue 
    - OperatorController - POST ```/add``` - add new operator
    - OperatorController - POST ```/conversation``` - get conversation by operator
    - ConversationController - GET ```/conversations/by-operator``` - get page for choose operator
    - ConversationController - POST ```/conversations/by-operator``` - get operator and show him conversation
    - IndexController - GET ```/index``` - get menu page
    - StartController - GET ```/generation/start``` - start generating conversations
    - UserController - GET ```/users/close-conversation``` - get page for close conversation
    - UserController - POST ```/users/close-conversation``` - close conversation
* repository: Interfaces that extends JpaRepository, for work with database
* model: Contains classes that represent data models
* service: Service interfaces and their implementations that perform business logic
* thread: Thread for generating conversation
* util: Utility class that contain queue
# Video presentation of the application
* Video presentation: https://www.loom.com/share/9270c5bab37745ddae2688d3c41b93f4
# Used technologies
* Java ```v.17.0.5```
* Maven ```v.3.8.7```
* Spring Boot ```v.3.1.0```
* Spring Boot Data JPA ```v.3.0.0```
* Spring Boot Web ```v.3.1.0```
* Jakarta Servlet JSP JSTL ```v.2.0.0```
* Lombok ```v.1.18.24```
* H2 Database ```v.2.1.214```
* Tomcat ```v.10.1.8```
# Authors
Nazar Zvarych