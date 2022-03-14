#!/usr/bin/env sh
mvn install -Dmaven.test.skip=true
docker build -t jcarrascotoledo/admninservercoe:0.0.1-SNAPSHOT .