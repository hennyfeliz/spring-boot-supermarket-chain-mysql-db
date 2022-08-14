# Spring boot Supermarket chain crud - MySQL, JPA, Hibernate.

Simple crud for handling and administration of articles with database and all the services of the CRUD concept.

Using Maven Command: Download the project source code. Go to the root folder of the project using command prompt and run the command.
`mvn spring-boot:run`

* Port: `http://localhost:8080`
* Don't forget to change the MySQL user settings in `application properties`

## Methods of use [you can use Postman to try it]

# * EMPLEADOS * 

1. Create :
HTTP Method: POST.
```
POST - http://localhost:8080/cadena_tiendas/postEmpleados
```

2. Read :

HTTP Method: GET.
```
GET -  http://localhost:8080/cadena_tiendas/empleados
```

HTTP Method: GET [for specific id].
```
GET -  http://localhost:8080/cadena_tiendas/empleado/{id}
```

3. Update :
HTTP Method: PUT.
```
PUT - http://localhost:8080/cadena_tiendas/empledo/{id}
```

4. Delete :
HTTP Method: DELETE.
```
DELETE  - http://localhost:8080/cadena_tiendas/empledo/{id}
```


# * TIENDAS * 

1. Create :
HTTP Method: POST.
```
POST - http://localhost:8080/cadena_tiendas/postTiendas
```

2. Read :

HTTP Method: GET.
```
GET -  http://localhost:8080/cadena_tiendas/tiendas
```

HTTP Method: GET [for specific id].
```
GET -  http://localhost:8080/cadena_tiendas/tienda/{id}
```

3. Update :
HTTP Method: PUT.
```
PUT - http://localhost:8080/cadena_tiendas/tienda/{id}
```

4. Delete :
HTTP Method: DELETE.
```
DELETE  - http://localhost:8080/cadena_tiendas/tienda/{id}
```



# * PRODUCTOS * 

1. Create :
HTTP Method: POST.
```
POST - http://localhost:8080/cadena_tiendas/postProductos
```

2. Read :

HTTP Method: GET.
```
GET -  http://localhost:8080/cadena_tiendas/productos
```

HTTP Method: GET [for specific id].
```
GET -  http://localhost:8080/cadena_tiendas/producto/{id}
```

3. Update :
HTTP Method: PUT.
```
PUT - http://localhost:8080/cadena_tiendas/producto/{id}
```

4. Delete :
HTTP Method: DELETE.
```
DELETE  - http://localhost:8080/cadena_tiendas/producto/{id}
```
