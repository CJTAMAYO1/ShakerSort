Principio básico:
El Shaker Sort es una variante mejorada del Bubble Sort. Ambos algoritmos trabajan comparando y intercambiando elementos adyacentes hasta que toda la lista esté ordenada. La diferencia clave es que el Shaker Sort realiza pasadas en ambas direcciones (izquierda a derecha y derecha a izquierda) en lugar de solo una dirección como en el Bubble Sort.

Pasos del algoritmo:

Pasada de izquierda a derecha:

1. Comienza desde el primer elemento de la lista.
Compara cada elemento con su siguiente.
Si el elemento actual es mayor que el siguiente, intercámbialos.
Continúa hasta llegar al final de la lista.
Pasada de derecha a izquierda:

2. Comienza desde el último elemento de la lista.
Compara cada elemento con su anterior.
Si el elemento actual es menor que el anterior, intercámbialos.
Continúa hasta llegar al inicio de la lista.
Repetición:

3. Repite los pasos 1 y 2 hasta que no se realicen más intercambios en ninguna de las pasadas.
Cuando no hay intercambios en una pasada completa, significa que la lista está ordenada.


Optimización:
La optimización clave del Shaker Sort es que después de cada pasada, se verifica si se realizaron intercambios. Si no hay intercambios, el algoritmo sabe que la lista está ordenada y puede finalizar. Esto reduce el número de comparaciones y mejora el rendimiento en comparación con el Bubble Sort tradicional.