#!/bin/sh
mvn clean package && docker build -t com.pruebaEJB/FiltroDTO .
docker rm -f FiltroDTO || true && docker run -d -p 9080:9080 -p 9443:9443 --name FiltroDTO com.pruebaEJB/FiltroDTO