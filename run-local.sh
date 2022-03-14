#!/usr/bin/env bash

cd descovery-server
chmod +x generarImagen.sh
./generarImagen.sh

cd ../

cd servergateway
chmod +x generarImagen.sh
./generarImagen.sh

cd ../


cd adminservercoe
chmod +x generarImagen.sh
./generarImagen.sh

cd ../

cd login
chmod +x generarImagen.sh
./generarImagen.sh

cd ../

cd registrousuarios
chmod +x generarImagen.sh
./generarImagen.sh

cd ../


docker-compose up --build

docker-compose stop
docker-compose kill
docker-compose rm -f
