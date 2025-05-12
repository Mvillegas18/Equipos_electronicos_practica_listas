# GESTIÓN PRÉSTAMO

## EQUIPOS ELECTRÓNICOS SAN JUAN DE DIOS

### ENUNCIADO

La Universidad San Juan de Dios, debido a las necesidades de los estudiantes de las carreras de **ingenierías** y **diseño**, ha decidido comenzar a hacer préstamos de equipos electrónicos para los estudiantes de estas carreras de la siguiente manera:

-   Para los estudiantes de **ingenierías** que lo soliciten, se les asignará un **computador portátil** en comodato.
-   Para los estudiantes de **diseño** que lo soliciten, se les asignará una **tableta digital** en comodato.

A continuación, se nombrarán los objetos y métodos que deben incluir el código, respetando las indicaciones dadas al inicio de este documento.

---

## Objeto `ESTUDIANTE_INGENIERIA`

-   Cedula: cadena de texto, no se permiten caracteres especiales.
-   Nombre: cadena de texto, no se permiten números ni caracteres especiales.
-   Apellido: cadena de texto, no se permiten números ni caracteres especiales.
-   Teléfono: cadena de texto, no se permiten caracteres especiales.
-   Número Semestre actualmente cursado: número entero.
-   Promedio acumulado: número flotante.
-   Serial: cadena de texto, no se permiten caracteres especiales.

## Objeto `ESTUDIANTE_DISENO`

-   Cedula: cadena de texto, no se permiten caracteres especiales.
-   Nombre: cadena de texto, no se permiten números ni caracteres especiales.
-   Apellido: cadena de texto, no se permiten números ni caracteres especiales.
-   Teléfono: cadena de texto, no se permiten caracteres especiales.
-   Modalidad de estudio: cadena de texto donde se especifique si es estudiante virtual o presencial.
-   Cantidad de Asignaturas que está viendo: número entero.
-   Serial: número entero, asociado al equipo en préstamo.

## Objeto `TABLETA_GRAFICA`

-   Serial: cadena de texto, no se permiten caracteres especiales.
-   Marca: cadena de texto, no se permiten números ni caracteres especiales.
-   Tamaño: número flotante (en pulgadas).
-   Precio: número flotante.
-   Almacenamiento: método con submenú para escoger:
    1. 256 GB
    2. 512 GB
    3. 1 TB
-   Peso: número flotante (en kg).

## Objeto `COMPUTADOR_PORTATIL`

-   Serial: cadena de texto, no se permiten caracteres especiales.
-   Marca: cadena de texto, no se permiten números ni caracteres especiales.
-   Tamaño: número flotante (en pulgadas).
-   Precio: número flotante.
-   Sistema operativo: método con submenú para escoger:
    1. Windows 7
    2. Windows 10
    3. Windows 11
-   Procesador: método con submenú para escoger:
    1. AMD Ryzen
    2. Intel® Core™ i5
