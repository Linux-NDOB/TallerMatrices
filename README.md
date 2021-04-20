# TallerMatrices
Trabajo Matrices:

Nos piden que implementemos el software para una máquina expendedora de golosinas.  Cada golosina tiene un nombre, suministro a continuación los datos que tendrá a continuación:

	String[][] nombresGolosinas = {
 
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
 
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
 
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
 
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
                                      
};
 
  
double[][] precio = {
 
  {1000, 200, 500, 950},
 
  {1800, 100, 120, 100},
 
  {1750, 130, 120, 800},
 
  {1500, 110, 720, 350}
 
};

También tendrán una cantidad inicial, que en principio será de 5.
double[][] cantidad = {
 
  {5, 5, 5, 5},
 
  {5, 5, 5, 5},
 
  {5, 5, 5, 5},
 
  {5, 5, 5, 5}
 
};

Tendremos un pequeño menú con las siguientes opciones:
-Pedir golosina: pedirá la posición de la golosina que quiera. Esta máquina tiene golosinas en cada posición, identificados por su fila y columna, que será lo que introduzca el usuario al pedir una golosina, por ejemplo, si el usuario teclea 20 significa que está pidiendo la golosina que está en la fila 2 columna 0. Cuando no haya más golosinas se le indicará al usuario. Solo puede pedir una golosina y supondremos que el usuario siempre tiene dinero al elegir. Recuerda de disminuir la cantidad la pedir.

-Mostrar golosinas: mostrará todas las golosinas disponibles. Mostrará el código que debe introducir el usuario, el nombre, precio y la cantidad de golosinas disponibles.

-Rellenar golosinas: esta es una función exclusiva de un técnico por lo que nos pedirá una contraseña, si el usuario escribe “Maquina2020” le pedirá la posición de la golosina y la nueva cantidad.
Estadísticas de la maquina: Mostrara las ventas totales de cada golosina y el total acumulado de todas las ventas.

-Salir: Finaliza el programa.

Este programa deberá ser resuelto utilizando el lenguaje de programación Java + Netbeans, utilizando métodos que crea necesarios para la solución del problema.
