FROM gradle:7 AS BUILD
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY build.gradle.kts settings.gradle.kts gradlew $APP_HOME
COPY gradle $APP_HOME/gradle
RUN ./gradlew clean build || return 0
COPY . .
RUN ./gradlew build

FROM openjdk:17 AS RUNTIME
EXPOSE 8080
COPY --from=BUILD /usr/app/build/libs/demo-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]