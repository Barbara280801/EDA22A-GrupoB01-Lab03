<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div>
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />

<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Pilas y Colas</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>03</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA DE PRESENTACIÓN:</td><td>5/06/2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="3"></td>
</tr>
<tr><td colspan="3">INTEGRANTE(s):
<ul>
<li>Cárdenas Martines Franco Luchiano - fcardenasm@unsa.edu.pe</li>
<li>Carrillo Daza Barbara Rubi - bcarrillo@unsa.edu.pe</li>
<li>Diaz Portilla Carlo Rodrigo - cdiazpor@unsa.edu.pe</li>
<li>Hancco Condori Bryan Orlando - bhanccoco@unsa.edu.pe</li>
<li>Mamani Cañari Gabriel Anthony - gmamanican@unsa.edu.pe</li>
</ul>
</td>
<td>NOTA:</td><td colspan="2"></td>
</<tr>
<tr><td colspan="6">DOCENTE(s):
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tbody>
</table>

<!-- Reportes -->
## SOLUCIÓN Y RESULTADOS

---

I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS <br>
* La organización del repositorio es la siguiente
    ```sh
   <!-- tree -->
    ```
* Cada integrante tenía la tarea de solucionar los ejercicios agregando y/o modificando la información obtenida en las 
  clases de teoría
    * Ejercicio 1: Pilas Iguales
      - En primer lugar se crea una función que devuelve un arreglo que acumula la altura constantemente
        ```java
        public static int[] arrHeights(int[] h) {
        ...
            for (int i = 0; i < h.length; i++) {
                sum += h[i];
                heightsArr[i] = sum; 
            }
            return heightsArr;                                
        }
        ```
      - Una vez con esta función, se completa la función equalStacks(), se crean los arreglos de alturas correspondientes a
        h1, h2 y h3. Después, en un bucle anidado se hacen las comparaciones entre cada arreglo, buscando una igualdad entre
        cada valor de cada arreglo.    
        ```java                                
        for (int n1 : arr1) {
	        for (int n2 : arr2) {		
			if (n1 < n2) break;
			if (n2 == n1) {
				for (int n3 : arr3) {
					if (n1 < n3) break;
					if (n3 == n1)
						maxHeight = n1;
				}
			}
		}
	}
        ```
      - Finalmente _maxHeight_ devolvera el valor de la altura común a las 3 pilas más alta, si es que existe
      - _Ejemplos_                            
    * Ejercicio 2

    * Ejercicio 3

     
---

II. SOLUCIÓN DEL CUESTIONARIO

* ¿Qué similitudes hay entre una Lista Enlazada y una Pila?
  

* ¿En que casos seria favorable/desfavorable utilizar Pila/Cola?
   
---

III. CONCLUSIONES

- Los Stacks (Pilas) pueden ser una estructura de datos sencilla con un comportamiento de tipo LIFO, teniendo diversas aplicaciones como en el uso de los compiladores. En cuanto a programación de sistemas nos permmite recuperar datos y parámetros, por otro lado, en lenguajes de programación puede garantizar llamadas anidadas.
- Las Queue (Colas) poseen un comportamiento de tipo FIFO, primero en entrar primero en salir, usada en simulación de procesos como un método para simular las colas reales. Las aplicaciones son infinitas pero la más común sería la organización de tareas en una computadora.
- Las estructuras de datos como las Pilas y Colas pueden resultar de gran ayuda donde se nota una gran aplicacion en el mundo de las computadoras. Cada estructura de datos tiene sus ventajas y desventajas, entonces hacer uso correcto de estas podría mejorar significativamente algunos procesos.
    
---
    
## RETROALIMENTACIÓN GENERAL

---
    
### REFERENCIAS Y BIBLIOGRAFÍA
<ul>
    <li>https://www.w3schools.com/java/</li>
    <li>https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers</li>
    <li>https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html</li>
    <li>https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html</li>
</ul>
