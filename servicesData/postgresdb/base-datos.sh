#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL

    CREATE USER admin PASSWORD 'admin';

    CREATE DATABASE coe_social OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE coe_social TO admin;


    CREATE DATABASE coe_social_login OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE coe_social_login TO admin;

EOSQL
