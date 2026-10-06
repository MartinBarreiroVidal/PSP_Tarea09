## DOCUMENTACIÓN TAREA09 PSP

### Nivel 1 - Obligatorio

#### Clase Descarga

Simula descargar un archivo en 10 partes haciendo pausas al azar. Al terminar, guarda el tiempo total que ha tardado en completarse.

![img.png](Capturas/img.png)

#### Clase GestorDescargas

Es el programa principal que arranca las cuatro descargas a la vez y las espera. Al acabar, muestra el tiempo real frente a lo que tardaría una tras otra.

![img_2.png](Capturas/img_2.png)

![img_1.png](Capturas/img_1.png)


#### Tabla Descargas:

| Ejecución | Descarga más lenta        |    Tiempo real (ms)    |    Suma (ms)     |
| :---: |:--------------------------|:----------------------:|:----------------:|
| 1 | [horoscopo.pdf]  3752 ms  |        3778 ms         |     12173 ms     |
| 2 | [meditacion.mp4] 2984 ms  |        3114 ms         |     11750 ms     |
| 3 | [cuarzos.png] 2636 ms     |        3327 ms         |     12280 ms     |

· ¿Por qué el tiempo real es mucho menor que la suma?

Porque los hilos se ejecutan a la vez. Mientras una descarga está en pausa (sleep), el procesador avanza con las demás descargas en segundo plano.


· ¿Qué pasa si hacéis start() y join() dentro del mismo bucle?


Se convierte en un programa secuencial porque bloqueas el main con el join(). No arranca el siguiente hilo hasta que el anterior termina por completo.


He usado Gemini para algunas funciones concretas como por ejemplo  System.currentTimeMillis(); para obtener la hora exacta de mi ordenador, ya que la tarea pide que imprima , el tiempo real que ha
tardado el programa. También le pedí ayuda a cómo hacer la estructura de la tabla para que quede bien en el Readme, que la mía quedaba desordenada.