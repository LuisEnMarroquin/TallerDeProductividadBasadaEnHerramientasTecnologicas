# Actividad 4

Inicia un nuevo proyecto y realiza lo siguiente.

1. Escribe una clase llamada AddressBook, que representará la agenda telefónica.

2. La clase AddressBook deberá tener un atributo de tipo HashMap que almacene los contactos, HashMap será un Map<String, String>, el primer atributo String utilizará el número telefónico como llave.

3. En la clase AddressBook se implementarán los métodos para la lectura y escritura de los contactos en un archivo de texto.

* load: cargará los contactos del archivo.
* save: guardará los cambios en el archivo.

4. Se implementarán tres métodos para modificar la información de los contactos.

* list: mostrar los contactos de la agenda.
* create: crear un nuevo contacto.
* delete: borrar un contacto.

5. Los tres métodos anteriores deberán estar conectados a un menú interactivo que proporcionará al usuario de la aplicación una interfaz para realizar las tres acciones anteriores:

* list: iterar el HashMap de AddressBook y mostrar los contactos con el siguiente formato:

```
Contactos:
{Número} : {Nombre}
{Número} : {Nombre}
{Número} : {Nombre}
{Número} : {Nombre}
```

* create: solicitar el nombre y número de contacto a guardar.
* delete: solicitar el número telefónico a eliminar.

6. Crea un repositorio en línea y sube el proyecto.

7. Realiza un reporte sobre la solución implementada para el problema, explicando el funcionamiento del programa.

* Incluye capturas de pantalla como evidencia del funcionamiento del programa.
* Incluye la liga al repositorio en el reporte realizado.

8. Eres libre de incluir funcionalidades adicionales que pueden tomarse en cuenta como puntos extra.

Nota: El archivo será un archivo de texto plano que almacenará los contactos en un formato de CSV (Comma Separated Values).

```
{Número},{Nombre}
{Número},{Nombre}
{Número},{Nombre}
{Número},{Nombre}
```

## Entregable

Documento en formato DOC, DOCX o PDF, que incluye:

* Reporte sobre la solución implementada para el problema, explicando el funcionamiento del programa.
* Capturas de pantalla como evidencia del funcionamiento del programa.
* Liga al repositorio en el reporte realizado.
