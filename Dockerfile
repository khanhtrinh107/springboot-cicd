FROM openjdk:11
ADD target/springboot-cicd.jar springboot-cicd.jar
ENTRYPOINT ["java" ,"-jar" , "springboot-cicd.jar"]