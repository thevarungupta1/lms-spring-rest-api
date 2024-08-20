# LMS - Deployment 


# Create MySQL Container
> docker run -d --name mysql --network my-network -v mysql-vol:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=demo mysql:8.0


# Create api gateway container
> docker run -d --name apigateway --network my-network -p 9191:9191 apigateway


# Create auth service container
> docker run -d --name authservice --network my-network -p 9000:9000 authservice


# Create course service container
> docker run -d --name courseservice --network my-network -p 9001:9001 courseservice


# Create registry service container
> docker run -d --name registryservice --network my-network -p 8761:8761 registryservice
