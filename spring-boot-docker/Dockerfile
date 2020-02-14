FROM nexus.corp.dmz:8083/java-base:latest
VOLUME /tmp
COPY target/spring-boot-docker-*.jar app.jar
ADD src/main/docker/entrypoint.sh entrypoint.sh
ADD src/main/resources/conf1.properties /opt/conf/conf1.properties
ADD src/main/resources/conf2.properties /opt/conf/conf2.properties
ADD src/main/resources/conf3.properties /opt/conf/conf3.properties
USER root
RUN chmod +x  entrypoint.sh

RUN mkdir -p /opt/test
RUN chown nobody /opt/test

ENV JAVA_OPTS=""
USER nobody
ENTRYPOINT [ "/entrypoint.sh"]




