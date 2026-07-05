# LlanquihueTourApp

## Descripción

LlanquihueTourApp es una aplicación desarrollada en Java que simula la gestión de servicios turísticos ofrecidos por la agencia **Llanquihue Tour**. El proyecto fue construido de manera incremental aplicando los principales conceptos de la Programación Orientada a Objetos (POO).

En esta versión se incorporan los conceptos de **herencia, polimorfismo, sobrescritura de métodos y colecciones genéricas**, permitiendo almacenar distintos tipos de servicios turísticos en una misma colección y recorrerlos de forma dinámica.

## Objetivos

* Aplicar herencia mediante una jerarquía de clases.
* Implementar polimorfismo utilizando referencias de la superclase.
* Sobrescribir métodos mediante la anotación `@Override`.
* Utilizar colecciones genéricas (`List`) para almacenar objetos de diferentes subclases.
* Mantener una estructura organizada por paquetes.

## Estructura del proyecto

```
src
│
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data
│   └── GestorServicios.java
│
└── ui
    └── Main.java
```

## Tecnologías utilizadas

* Java JDK 25
* IntelliJ IDEA
* Programación Orientada a Objetos (POO)

## Funcionalidades

* Registro de distintos tipos de servicios turísticos.
* Clase base `ServicioTuristico`.
* Clases derivadas:

  * `RutaGastronomica`
  * `PaseoLacustre`
  * `ExcursionCultural`
* Método `mostrarInformacion()` sobrescrito en cada subclase.
* Gestión de servicios mediante una colección `List<ServicioTuristico>`.
* Recorrido de la colección utilizando un ciclo `for-each`.
* Aplicación de polimorfismo para mostrar la información de cada servicio sin utilizar `instanceof`.

## Conceptos aplicados

* Clases y objetos.
* Encapsulamiento.
* Constructores.
* Herencia simple.
* Sobrescritura de métodos (`@Override`).
* Polimorfismo.
* Colecciones genéricas (`ArrayList` y `List`).
* Organización del código en paquetes.

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `Main` ubicada en el paquete `ui`.
3. El programa mostrará por consola la información de los distintos servicios turísticos almacenados en la colección.

## Autor
Nicolas Sanchez

Desarrollado como actividad académica para la asignatura de Programación Orientada a Objetos utilizando Java.
