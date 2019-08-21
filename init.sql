CREATE DATABASE micro;

\c micro;

CREATE TABLE "microservice" (
  "service_id" integer NOT NULL PRIMARY KEY,
  "service_name" character(100) NOT NULL
);

INSERT INTO "microservice" ("service_id","service_name") VALUES
(1,'Hello world');
