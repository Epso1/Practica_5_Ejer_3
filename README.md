# API de Fechas

Esta aplicación es una API RESTful desarrollada en Java utilizando el framework Spring Boot.
La API permite trabajar con fechas y no requiere una base de datos.

## Características

La API tiene los siguientes endpoints:

- `GET /api/date`: Devuelve la fecha actual.
- `GET /api/date/{n}`: Devuelve la fecha actual más `n` días. Por ejemplo, si hoy es 1 de enero y `n` es 5, devolverá el 6 de enero.
- `POST /api/date`: Permite cambiar la fecha del sistema. No está implementado en el código, pero en el método updateSystemDate() de la clase DateController se explica cómo se accedería a los datos de la fecha para actualizar la del sistema.

Las fechas se devuelven en el siguiente formato:

```json
{
    "day" : 28,
    "month" : 2,
    "year" : 2023
}
```

## Requisitos del sistema

- Java 8 o superior
- Maven
- IntelliJ IDEA

## Instalación

Para instalar y ejecutar el proyecto en IntelliJ IDEA, sigue estos pasos:

1. Abre IntelliJ IDEA.
2. Haz clic en `File` > `New` > `Project from Version Control`.
3. En la ventana que aparece, selecciona `Git`.
4. En el campo `URL`, introduce la URL del repositorio del proyecto y haz clic en `Clone`.
5. Una vez que el proyecto se haya clonado en tu máquina local, IntelliJ debería abrirlo automáticamente.
6. Como es un proyecto Maven, IntelliJ IDEA debería detectarlo automáticamente y descargar todas las dependencias necesarias especificadas en el archivo `pom.xml`. Si no lo hace automáticamente, puedes hacerlo manualmente haciendo clic derecho en el archivo `pom.xml` y seleccionando `Maven` > `Reload project`.



## Uso

1. Para ejecutar la aplicación, navega hasta la clase principal (en este caso, `Practica5Ejer3Application.java`), haz clic derecho en el archivo y selecciona `Run 'Practica5Ejer3Application'`.
2. Una vez que la aplicación esté en ejecución y se muestre un mensaje "Started Practica5Ejer3Application" en la consola de ejecución, puedes acceder a los endpoints de la API utilizando una herramienta como RESTer, RESTED o Postman.

- Para obtener la fecha actual, realiza una solicitud GET a `http://localhost:8080/api/date`.
- Para obtener la fecha actual más `n` días, realiza una solicitud GET a `http://localhost:8080/api/date/{n}`, reemplazando `{n}` con el número de días que deseas agregar.
- Para cambiar la fecha del sistema (no implementado), realiza una solicitud POST a `http://localhost:8080/api/date` con un cuerpo de solicitud JSON que represente la nueva fecha, como se muestra a continuación:

```json
{
    "day" : 28,
    "month" : 2,
    "year" : 2023
}
```
* Por favor, ten en cuenta que el endpoint `POST /api/date` no está implementado y dará un error en la ejecución.