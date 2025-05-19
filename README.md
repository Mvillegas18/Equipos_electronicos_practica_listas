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

## ACCIONES

Crear un menú con la siguiente estructura:

### 1. ESTUDIANTES DE INGENIERÍA
- 1.1 Registrar préstamo de equipo.
- 1.2 Modificar préstamo de equipo (por serial o cédula).
- 1.3 Devolución de equipo (se elimina el registro) (por serial o cédula).
- 1.4 Buscar equipo (por serial o cédula).
- 1.5 Volver al menú principal.

### 2. ESTUDIANTES DE DISEÑO
- 2.1 Registrar préstamo de equipo.
- 2.2 Modificar préstamo de equipo (por serial o cédula).
- 2.3 Devolución de equipo (se elimina el registro) (por serial o cédula).
- 2.4 Buscar equipo (por serial o cédula).
- 2.5 Volver al menú principal.

### 3. IMPRIMIR INVENTARIO TOTAL

### 4. SALIR DEL PROGRAMA

---

## REQUISITOS

1. El tamaño de los vectores debe ser dinámico: aumentando una posición al ingresar un elemento y reduciendo una posición al eliminar algún elemento.
2. Al registrar el préstamo de un equipo, se debe comprobar que la persona no tenga ningún equipo ya registrado en su respectiva facultad.
3. Crear estructuras para almacenar los vectores, es decir:
    - `vector_ingenieros`
    - `vector_disenadores`
    - `vector_portatil`
    - `vector_tableta`
4. Utilizar sobrecarga en los métodos.
5. El **serial del equipo** ni la **cédula del estudiante** pueden ser modificados una vez ingresados (al eliminar el registro, estos se eliminarán).
6. En la opción **modificar**, se deben usar los métodos de cadenas de texto creados anteriormente para modificar los atributos relacionados con estos.

