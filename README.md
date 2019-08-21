###Step to build hello world service.
1 . build postgres flowing the command.
```
docker build -t postgres:sck-11.5 -f Dockerfile_postgres .
```
2 . build hello world service 
```
./build.sh
```
3 . build hello world service flowing the command.
```
docker build -t hello:1.0 -f Dockerfile_helloworld .
```
4 . run services with docker-compose.
```
docker-compose up -d
```