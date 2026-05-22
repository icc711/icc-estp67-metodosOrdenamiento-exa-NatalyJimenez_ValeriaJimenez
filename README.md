

# Examen Práctico – Ordenamiento y Búsqueda de Autos

## Enunciado

Se tiene una estructura de datos con:

- Una clase `Brand` (Marca), que contiene un arreglo de `CarModel` (Modelos).
- Cada `CarModel` contiene un arreglo de `CarYear` (Años).
- Cada `CarYear` tiene un año (int) y un atributo booleano `isValid`.

![alt text](image.png)

### Objetivo

Implementar los siguientes requerimientos:

1. **REQUERIMIENTO CRÍTICO**: Crear el método `getTotalValidYears()` en la clase `Brand`. Este método debe calcular y retornar cuántos años **válidos** tiene la marca (sumando todos los años válidos de todos sus modelos).
   - **Nota**: Un año se considera válido si su atributo `isValid` es `true`.
   - **IMPORTANTE**: Sin este método implementado correctamente, el resto del examen no funcionará.

```java
public class Brand {
    // ... otros atributos y métodos
    
    /**
     * Calcula el total de años válidos de todos los modelos de esta marca
     * @return número total de años con isValid = true
     */
    public int getTotalValidYears() {
        // Implementar aquí
    }
}
```
2. Implementar y probar los siguientes **métodos de ordenamiento**, usando como criterio la **cantidad total de años válidos por marca** (obtenida mediante `getTotalValidYears()`) según la FILA que le tocó:
    | Fila   | Descripción                       | Nombre del método sugerido      |
    |--------|-----------------------------------|---------------------------------|
    | A      | Selection Sort descendente        | sortSelectionDesc               |
    | B      | Selection Sort ascendente         | sortSelectionAsc                |
    | C      | Insertion Sort descendente        | sortInsertionDesc               |
    | D      | Bubble Sort descendente           | sortBubbleDesc                  |

    NOTA: el nombre del método debe ser el indicado en la tabla, y debe recibir un arreglo de marcas.

```java
public Brand[] sortSelectionDesc(Brand[] brands) {
    // Implementación del método
}
```

3. Implementar un método de **búsqueda binaria** para encontrar una marca según la **cantidad de años válidos**. El método debe recibir como parámetro un valor booleano que indique si el arreglo de marcas fue ordenado de forma ascendente (`true`) o descendente (`false`), y realizar la búsqueda acorde al tipo de orden utilizado.

El nombre del método debe ser `binarySearchByValidYears` y debe recibir un arreglo de marcas, un número de años válidos y un booleano que indique el orden.

El método deberá servir para ascendente y descendente, por lo que se debe tener en cuenta el orden de los datos al realizar la búsqueda.

Para la implementación mandar el parámetro `isAscending` como `true` si el arreglo fue ordenado de forma ascendente, o `false` si fue ordenado de forma descendente, según el ordenamiento que se haya realizado previamente.

No puede cambiar el nombre del método ni su firma. El método debe retornar la marca encontrada o `null` si no se encuentra.

```java
public Brand binarySearchByValidYears(
    Brand[] brands, 
    int validYears,
    boolean isAscending
    ) {
    // Implementación del método
}
```
Cada fila deberá utilizar el método `binarySearchByValidYears` para buscar dos valores diferentes de años válidos, según la siguiente tabla:


### Tabla de criterios de búsqueda por fila 

| Fila | Criterio 1            | Criterio 2            |
| ---- | --------------------- | --------------------- |
| A    | 8 años, `false`       | 10 años, `false`      |
| B    | 7 años, `true`        | 5 años, `true`        |
| C    | 6 años, `false`       | 9 años, `false`       |
| D    | 7 años, `false`       | 4 años, `false`       |


## Instrucciones Importantes

### Configuración Obligatoria

**ANTES DE COMENZAR**, debe configurar el archivo `student.env` con sus datos:

```env
STUDENT_NAME=SU-NOMBRE-COMPLETO
STUDENT_EMAIL=su.email@est.ups.edu.ec
FILA_ESTUDIANTE=A
```

⚠️ **IMPORTANTE**: Debe cambiar `FILA_ESTUDIANTE=A` por la letra de su fila asignada (A, B, C o D). Si no configura correctamente este archivo, los tests no funcionarán.

### Requisitos de Implementación

1. **El método `getTotalValidYears()` es OBLIGATORIO** y debe estar en la clase `Brand`
2. **Los tests deben ejecutarse sin errores** - esto valida que su implementación es correcta
3. **La salida en consola es OBLIGATORIA** - debe ejecutar `App.java` y copiar la salida completa
4. **NO MODIFICAR los datos de prueba** - La clase `TestData.java` contiene el método `createBrands()` que genera 7 marcas con sus respectivos modelos y años. **NO debe modificar estos datos**, debe usarlos tal como están proporcionados.

### Datos de Prueba Proporcionados

La clase `TestData.java` incluye el método `createBrands()` que retorna un arreglo con las siguientes 7 marcas:

1. **Honda** - Modelos: Civic, Accord
2. **Toyota** - Modelos: Corolla, Camry  
3. **Ford** - Modelos: Mustang, F-150
4. **Chevrolet** - Modelos: Silverado, Camaro
5. **Nissan** - Modelos: Altima, Sentra
6. **Mazda** - Modelos: Mazda3, CX-5
7. **Hyundai** - Modelos: Elantra, Tucson

Cada modelo contiene entre 6-7 años con diferentes valores de `isValid`. **Utilice estos datos tal como están**, no los modifique.


## Explicación con datos de ejemplo para Datos de Entrada

Estos datos no serán los evaluados, pero sirven para entender el funcionamiento del programa.



El método `createBrands()` crea dos marcas:

```java
Honda:
  - Civic: 2021 (✖️), 2022 (✖️)
  - Accord: 2020 (✔️)
  → Total años válidos: 1

Toyota:
  - Corolla: 2020 (✔️), 2021 (✖️), 2022 (✔️)
  - Camry: 2019 (✔️), 2023 (✔️)
  → Total años válidos: 4
````

---

## Salida Esperada en Consola

**NOTA**: Debe ejecutar `App.java` y copiar la salida completa al final de este README en la sección "Resultados de Ejecución".

```plaintext
Original:
Honda - Años válidos: 1
Toyota - Años válidos: 4

Ordenado por Selection Sort descendente:
Toyota - Años válidos: 4
Honda - Años válidos: 1

Buscar marca con 4 años válidos que se ordenaron de mayor a menor:
Encontrada: Marca: Toyota, Total de años válidos: 4

Buscar marca con 3 años válidos que se ordenaron de mayor a menor:
No encontrada
```

---

## Criterios de Evaluación (Rúbrica)

| Item                                          | Descripción                                                                                              | Puntos |
| --------------------------------------------- | -------------------------------------------------------------------------------------------------------- | ------ |
| **getTotalValidYears()**                      | Método implementado correctamente en la clase `Brand`. **SIN ESTE MÉTODO NO FUNCIONA NADA DEL EXAMEN** | 2 pts  |
| **Método de Ordenamiento**                    | Implementación correcta del algoritmo asignado según fila (nombres y firma exactos)                     | 2 pts  |
| **Búsqueda Binaria**                          | Implementación correcta de `binarySearchByValidYears` que funcione para asc/desc                        | 2 pts  |
| **Código y Nomenclaturas**                    | Nombres correctos de métodos, clases bien estructuradas, código limpio                                  | 1 pt   |
| **Salida de Consola**                         | Output completo, claro y copiado en la sección de resultados                                            | 1 pt   |
| **Tests Ejecutados Exitosamente**            | Los 3 tests en `BrandControllerTest` pasan sin errores                                                  | 2 pts  |
| **Total**                                     |                                                                                                          | **10 puntos** |



## ℹNota para estudiantes
* **Los nombres de los métodos deben ser EXACTOS** a los especificados.
* **El archivo `student.env` debe estar configurado correctamente** con su fila asignada.
* **Los tests deben pasar** - esto valida que su implementación es correcta.
* **La salida en consola es OBLIGATORIA** - debe ejecutar `App.java` y copiar el resultado completo.

---

##  Resultados de Ejecución

**INSTRUCCIONES**: Ejecute `App.java` y copie TODA la salida de consola aquí (Ctrl+C / Ctrl+V):

```
[Examen interciclo de Estructuras de Datos

Original:
Honda - Años Válidos: 6
Toyota - Años Válidos: 10
Ford - Años Válidos: 5
Chevrolet - Años Válidos: 8
Nissan - Años Válidos: 7
Mazda - Años Válidos: 12
Hyundai - Años Válidos: 8

Ordenado por Selection Sort descendente:
Mazda - Años válidos: 12
Toyota - Años válidos: 10
Chevrolet - Años válidos: 8
Hyundai - Años válidos: 8
Nissan - Años válidos: 7
Honda - Años válidos: 6
Ford - Años válidos: 5

Buscar marca con 4 años válidos que se ordenaron de mayor a menor: 
No encontrada. 

Buscar marca con 3 años válidos que se encontraron de mayor a menor:
No encontrada]
```

---




