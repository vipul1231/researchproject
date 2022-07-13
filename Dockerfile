FROM openjdk
RUN useradd -u 1001 -U --create-home -s /bin/bash appuser
WORKDIR /home/appuser
USER appuser
ADD build/libs/rsproject-0.0.1-SNAPSHOT.jar rsproject-0.0.1-SNAPSHOT.jar
RUN mkdir /home/appuser/config
RUN chmod -R 0777 /home/appuser/config
EXPOSE 8085
ENTRYPOINT ["java","-jar","rsproject-0.0.1-SNAPSHOT.jar"]