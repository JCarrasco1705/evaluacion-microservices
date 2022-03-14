#!/usr/bin/env sh
mvn install -Dmaven.test.skip=true
docker build -t jcarrascotoledo/eurkaserver:0.0.1-SNAPSHOT .