## Monitory
## Trabajo Practico 4

### Maven
Comando | Explicación
------------ | -------------
clean | Limpia clases compiladas del proyecto.
compile | Compila el código fuente del proyecto.
package | Utiliza el código compilado y lo empaqueta en un formato de distribución, por ejemplo .JAR
install | Instala el paquete en el repositorio local para luego usarlo como dependencia en proyectos almacenados en el ambiente local.

Scopes | Explicación
------------ | -------------
compile| Indica que la dependencia es necesaria para compilar, se extiende a proyectos dependientes
provided| Es como Compile pero implica que el contenedor ya tenga esa libreria.
runtime| La dependencia se necesita en tiempo de ejecución pero no para compilar.
test| La dependencia es solo para la fase de testing.
system| Es como provided pero es explicitamente necesario definir la ruta de la dependencia, no se busca en el repositorio local, es necesario especificar la ruta mediante la etiqueta <systemPath>.
import| Es utilizada en dependencyManagement, indica que la dependencia sera reemplada con las que se encuentren en el POM.

1. Archetype: es un patrón o modelo original sobre el que pueden desarrollar todas aquellas cosas que son de un mismo tipo. Puede decirse que son plantillas, parametrizadas o configuradas para utilizar determinadas tecnologías, que los programadores utilizan como base para escribir y organizar el código de la aplicación.
2. Estructura de un proyecto Maven:
3. Diferencia entre Archetype y Artifact: Archetype seria el esqueleto de nuestra aplicación y Artifact es un elemento que se ubica dentro de ese esqueleto.

### Spring
Anotación | Explicación
------------ | -------------
@Component| Es una anotación general que indica que la clase es un componente
@Repository| Indica que la clase define un repositorio de datos.
@Service | Indica que la clase contiene la logica de negocio.
@Controller| Indica que la clase indica cumple la función de un controlador.

### Rest
Verbo | Explicación
------------ | -------------
Get| Consultar y leer recursos.
Post| Crear Recursos
Put| editar recursos.
Delete| Eliminar Recursos.
Patch| editar partes concretas de un recurso.
