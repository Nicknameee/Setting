echo Building Dockerfile described image
docker build -t setting .
echo Launching docker compose services for upstanding setting:latest image
docker-compose up