# gateway-service
Microservicio encargado de centralizar las rutas de entrada hacia los demás microservicios. Permite consumir las APIs desde una sola URL y redirige las peticiones a producto, proveedor, cliente, inventario, ventas, compras, pagos, reportes y notificaciones.
## Puerto
```
8080
```
## Tecnologías
- Java 21
- Spring Boot
- Spring Cloud
- Eureka
- Swagger/OpenAPI
- Mockito/JUnit
- Docker
- Railway

## Base de datos
```
No utiliza base de datos
```
## Endpoints V1
```
/api/v1/productos/** -> producto-service
/api/v1/proveedores/** -> proveedor-service
/api/v1/clientes/** -> cliente-service
/api/v1/usuarios/** -> usuario-service
/api/v1/inventario/** -> inventario-service
/api/v1/notificaciones/** -> notificaciones-service
/api/v1/compras/** -> compra-service
/api/v1/ventas/** -> venta-service
/api/v1/pagos/** -> pago-service
/api/v1/reportes-stock/** -> reporte-service
```
## Endpoints V2 HATEOAS
```
/api/v2/productos/** -> producto-service
/api/v2/proveedores/** -> proveedor-service
/api/v2/clientes/** -> cliente-service
/api/v2/usuarios/** -> usuario-service
/api/v2/inventario/** -> inventario-service
/api/v2/notificaciones/** -> notificaciones-service
/api/v2/compras/** -> compra-service
/api/v2/ventas/** -> venta-service
/api/v2/pagos/** -> pago-service
/api/v2/reportes-stock/** -> reporte-service
```
## Swagger
```
Las rutas Swagger se consultan directamente en cada microservicio
```
## Ejemplo JSON
```json
{
  "mensaje": "El gateway redirige las solicitudes a cada microservicio"
}
```
## Ejecutar pruebas
```bash
mvn test
```
## Ejecutar localmente
```bash
mvn spring-boot:run
```
## Configuración Railway
```properties
server.port=${PORT:8080}
```
