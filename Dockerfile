FROM openjdk:8
EXPOSE 9090
ADD target/chat_room_app.jar chat_room_app.jar
ENTRYPOINT [ "java","-jar","/chat_room_app.jar" ]