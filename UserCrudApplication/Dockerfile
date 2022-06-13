FROM maven:3.8.5-eclipse-temurin-17-alpine AS MAVEN_TOOL_CHAIN

ENV PROJECT_DIR_MAVEN=/tmp/application
WORKDIR $PROJECT_DIR_MAVEN

COPY ./pom.xml $PROJECT_DIR_MAVEN
RUN mvn dependency:resolve

COPY ./src/ $PROJECT_DIR_MAVEN/src
RUN mvn install

FROM eclipse-temurin:17.0.3_7-jre

ENV PROJECT_DIR=/opt/application
ENV PROJECT_DIR_MAVEN=/tmp/application
RUN mkdir -p $PROJECT_DIR
WORKDIR $PROJECT_DIR
COPY --from=MAVEN_TOOL_CHAIN $PROJECT_DIR_MAVEN/target/*.jar $PROJECT_DIR/user-crud.jar

EXPOSE 8000

CMD ["java", "-jar", "/opt/application/user-crud.jar"]