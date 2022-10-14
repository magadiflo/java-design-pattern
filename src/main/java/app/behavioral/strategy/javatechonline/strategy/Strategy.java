package app.behavioral.strategy.javatechonline.strategy;

/**
 * Pattern Strategy: Debe considerar el uso de este patrón cuando necesite seleccionar un algoritmo en tiempo de ejecución.
 *
 * El patrón de estrategia sugiere mantener la implementación de cada uno de los algoritmos en una clase separada.
 * Cada uno de estos algoritmos encapsulados en una clase separada se conoce como Estrategia.
 */

public interface Strategy {

    void sort(int[] numbers);

}
