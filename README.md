

# Microservicio ProyectoFinal IBM

Repositorio de los microservicios desarrollados como parte del Proyecto Final de la academia de microservicios en IBM

# API de Tarjetas de Credito
----
Esta API se encarga de mandar el tipo de tarjeta de credito más optima para el perfil del usuario que la solicite, por medio de parámetros como su Pasión, su ingreso mensual y su edad.

#### Pasos a seguir
                
1. Abre la carpeta EurekaServer y abre el proyecto en tu IDE
2. Ejecuta la clase con el metodo main, espera hasta que haya cargado en la consola el mensaje "Aplication Initialized"
3. En tu navegador ya estará dispoible la consola de [Eureka]( http://localhost:8761 )
4. Ahora regresa a la carpeta raiz, abre la carpeta ConfigServer, abre el proyecto en tu IDE y ejecuta la clase con el metodo main y espera hasta que inicie la aplicación
5. Ahora regresa a la carpeta raiz y abre la carpeta API_Tarjetas/TarjetasAPI, abre el proyecto en tu IDE y ejecuta la clase con el metodo main
6. Vuelve al navegador y ahora se mostrara desplegada la aplicación "TARJETAS_SERVICE" en el puerto 8899 del [localhost]( http://localhost:8899 )
7. Abre Postman, crea una peticion GET con el endpoint `http://localhost:8899/Banamex/API/cards/cardOption`
8. En el body de la peticion coloca en formato JSON los datos a probar
                

### Ejemplo  de petición en Postman

![](./ReadmeImages/NuevoRequest.PNG)

> Peticion GET a API


	
