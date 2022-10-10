# Patrones de diseño con java
Proyecto tomado de 
- [javatechonline](https://javatechonline.com/java-design-patterns-java)
- [refactoring.guru](https://refactoring.guru/es/design-patterns/java)


## Tipos de patrones de diseño
Los patrones de diseño más utilizados se clasifican en tres categorías principales
conformando un total de **23 patrones de diseño**

```
Patrones de diseño creacional
Patrones de diseño estructural
Patrones de diseño de comportamiento
```

![](JavaDesingPatterns.jpg)

## Patrones de diseño creacional
Veamos las siguientes tres definiciones:

- Los patrones de diseño creacional se ocupan de proporcional soluciones para
  instanciar un objeto de la mejor manera posible para situaciones específicas.


- Los patrones de creación proporcionan diversos mecanismos de creación de objetos, 
  que aumentan la flexibilidad y la reutilización del código existente de una manera 
  adecuada a la situación. Esto le da al programa más flexibilidad para decidir qué 
  objetos deben crearse para un caso de uso dado.


- Los patrones de diseño creacionales se centran en resolver problemas acerca de cómo 
  crear instancias de las clases de nuestra aplicación.

### Patrón de diseño singleton
Este patrón de diseño fue desarrollado en un proyecto aparte. Ir al 
[singleton-design-pattern en repositorio de GitHub](https://github.com/magadiflo/singleton-design-pattern)

### Patrón de diseño Factory
El patrón de diseño de fábrica se utiliza cuando tenemos una superclase con múltiples 
subclases y, según la entrada, necesitamos devolver una de las subclases. 
Este patrón elimina la responsabilidad de la creación de instancias de una clase de un 
programa cliente a la clase de fábrica. Además, podemos aplicar el patrón Singleton también 
en la clase Factory o hacer que el método factory sea estático.

La superclase en patrón de fábrica puede ser una interfaz, o una clase abstracta, 
o una clase Java normal.

