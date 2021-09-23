@echo off
call mvn clean package
call docker build -t com.pruebaEJB/FiltroDTO .
call docker rm -f FiltroDTO
call docker run -d -p 9080:9080 -p 9443:9443 --name FiltroDTO com.pruebaEJB/FiltroDTO