FROM registry.access.redhat.com/ubi8/openjdk-17-runtime

ENV LANGUAGE='en_US:en'

COPY --chown=185 target/${{ values.artifactId }}-*.jar /deployments/app.jar

EXPOSE 8080
USER 185
# ENV JAVA_OPTS="-Dspring.profiles.active=production"
ENV JAVA_APP_JAR="/deployments/app.jar"