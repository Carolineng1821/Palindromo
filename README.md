# Palíndromo

## Descripción

Aplicación de consola desarrollada en Java que permite determinar si una palabra o frase es un palíndromo.

Un palíndromo es un texto que puede leerse de la misma manera de izquierda a derecha y de derecha a izquierda.

La aplicación permite ingresar palabras o frases y realiza una normalización básica del texto para ignorar mayúsculas y espacios.

## Objetivo

Practicar conceptos fundamentales de Java mediante el desarrollo de una aplicación sencilla, aplicando:

- Métodos.
- Parámetros y valores de retorno.
- Tipo `boolean`.
- Manejo de `String`.
- `StringBuilder`.
- Inversión de cadenas.
- Comparación de contenido.
- Normalización de texto.
- Separación de responsabilidades entre clases.

## Funcionalidades

- Solicitar al usuario una palabra o frase.
- Convertir el texto a minúsculas.
- Eliminar espacios.
- Invertir el texto utilizando `StringBuilder`.
- Comparar el texto original normalizado con el texto invertido.
- Determinar si el texto es o no un palíndromo.
- Mostrar el resultado en consola.

## Cómo ejecutar el proyecto

### Requisitos

Para ejecutar el proyecto necesitas tener instalado:

- Java JDK 21 o superior.
- IntelliJ IDEA u otro IDE compatible con Java.

### Ejecución desde IntelliJ IDEA

1. Clonar o descargar el repositorio.
2. Abrir el proyecto `Palindromo` en IntelliJ IDEA.
3. Verificar que el proyecto utilice Java 21.
4. Abrir la clase `Main.java`.
5. Ejecutar el método `main()`.
6. Escribir una palabra o frase cuando la aplicación lo solicite.
7. Presionar `Enter`.
8. La aplicación mostrará si el texto es o no un palíndromo.

### Ejemplo de ejecución

```text
Escribe alguna palabra:
Anita lava la tina

si es palíndromo
```

También puedes probar:

```text
Escribe alguna palabra:
java

no es palíndromo
```

## Funcionamiento

La lógica principal se encuentra en el método:

```java
public boolean esPalindromo(String texto);
```

El proceso realizado es:

```text
Texto ingresado
      ↓
Convertir a minúsculas
      ↓
Eliminar espacios
      ↓
Crear StringBuilder
      ↓
Invertir texto
      ↓
Comparar ambos textos
      ↓
    boolean
      ↓
Mostrar resultado
```

La normalización permite reconocer correctamente casos como:

```text
Ana
→ ana
→ ana
→ true
```

También permite reconocer frases como:

```text
Anita lava la tina
→ anitalavatina
→ anitalavatina
→ true
```

## Ejemplos

### Palíndromo

```text
Escribe alguna palabra:
radar

si es palíndromo
```

### Palíndromo ignorando mayúsculas

```text
Escribe alguna palabra:
Ana

si es palíndromo
```

### Frase palíndroma

```text
Escribe alguna palabra:
Anita lava la tina

si es palíndromo
```

### No es palíndromo

```text
Escribe alguna palabra:
java

no es palíndromo
```

## Estructura del proyecto

```text
Palindromo/
│
├── src/
│   ├── Main.java
│   └── Palindromo.java
│
└── README.md
```

### `Main.java`

Se encarga de:

- Solicitar información al usuario.
- Leer la entrada mediante `Scanner`.
- Crear el objeto `Palindromo`.
- Ejecutar el método `esPalindromo()`.
- Mostrar el resultado.

### `Palindromo.java`

Contiene la lógica de negocio encargada de:

- Normalizar el texto.
- Invertir la cadena.
- Comparar el texto.
- Retornar `true` o `false`.

## Validaciones realizadas

| Entrada | Resultado |
|---|---|
| `radar` | Palíndromo |
| `Ana` | Palíndromo |
| `Anita lava la tina` | Palíndromo |
| `reconocer` | Palíndromo |
| `oso` | Palíndromo |
| `java` | No es palíndromo |
| `hola` | No es palíndromo |

## Conceptos Java utilizados

- Clases y objetos.
- Métodos.
- Parámetros.
- Valores de retorno.
- Tipo primitivo `boolean`.
- `String`.
- `StringBuilder`.
- `toLowerCase()`.
- `replace()`.
- `reverse()`.
- `toString()`.
- `equals()`.
- `Scanner`.
- Condicional `if / else`.

## Tecnologías

- Java 21
- Eclipse Temurin JDK 21
- IntelliJ IDEA
- Aplicación de consola

## Aprendizajes

Este proyecto permitió practicar la transformación y manipulación de cadenas de texto, además de reforzar la separación de responsabilidades entre la clase principal y la clase que contiene la lógica de negocio.

También se identificó la importancia de normalizar los datos antes de realizar una comparación, evitando que diferencias como mayúsculas o espacios afecten el resultado.

## Autor

**Carolina Neri**

Proyecto desarrollado como parte de mi preparación en **Java Backend**, con enfoque en fundamentos de programación orientada a objetos y desarrollo de aplicaciones backend.