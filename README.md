# LlanquihueTourApp

## Descripción

**LlanquihueTourApp** es una aplicación desarrollada en Java como parte del proyecto académico de la agencia de turismo **Llanquihue Tour**.

El sistema permite gestionar diferentes entidades relacionadas con la agencia utilizando los principios de Programación Orientada a Objetos (POO). A lo largo de las distintas semanas del proyecto se incorporaron conceptos como encapsulamiento, herencia, polimorfismo, interfaces, colecciones genéricas e interfaces gráficas básicas mediante `JOptionPane`.

En esta versión (Semana 8) se implementa una interfaz común para todas las entidades gestionables, una colección polimórfica utilizando `ArrayList<Registrable>`, validación de tipos mediante `instanceof` y una interfaz gráfica simple para registrar y visualizar información.

---

## Funcionalidades

* Registro de guías turísticos.
* Registro de vehículos.
* Gestión de colaboradores externos.
* Implementación de una interfaz común (`Registrable`).
* Uso de herencia y polimorfismo.
* Almacenamiento de objetos mediante `ArrayList`.
* Identificación de objetos utilizando `instanceof`.
* Interfaz gráfica básica con `JOptionPane`.
* Visualización de resúmenes personalizados para cada entidad.

---

## Tecnologías utilizadas

* Java JDK 25
* IntelliJ IDEA
* Programación Orientada a Objetos (POO)
* JOptionPane (Swing)
* Colecciones Genéricas (`ArrayList`)

---

## Estructura del proyecto

```
LlanquihueTourApp
│
├── src
│   ├── app
│   │   └── Main.java
│   │
│   ├── data
│   │   └── GestorEntidades.java
│   │
│   ├── model
│   │   ├── Registrable.java
│   │   ├── ServicioTuristico.java
│   │   ├── TourGastronomico.java
│   │   ├── PaseoLacustre.java
│   │   ├── ExcursionCultural.java
│   │   ├── GuiaTuristico.java
│   │   ├── Vehiculo.java
│   │   └── ColaboradorExterno.java
│   │
│   └── ui
│       └── VentanaPrincipal.java
│
└── README.md
```

---

## Principales conceptos aplicados

* Clases y objetos.
* Encapsulamiento.
* Herencia.
* Sobrescritura de métodos.
* Polimorfismo.
* Interfaces.
* Colecciones genéricas (`ArrayList`).
* Validación de tipos mediante `instanceof`.
* Interfaz gráfica básica utilizando `JOptionPane`.

---

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Compilar el proyecto.
3. Ejecutar la clase `Main`.
4. Utilizar el menú gráfico para:

   * Registrar un guía turístico.
   * Registrar un vehículo.
   * Visualizar los registros almacenados.
   * Salir de la aplicación.

---

## Autor

Desarrollado por **Nicolás** como actividad académica para la asignatura de Programación Orientada a Objetos.
