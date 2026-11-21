# U3-ejercicio3_
# 🌡️ Termostato Inteligente

Ejercicio de **Programación Orientada a Objetos en Java** que modela un termostato digital aplicando el principio de **encapsulamiento**. La temperatura interna del dispositivo está protegida y solo puede modificarse a través de métodos que validan que el valor se mantenga dentro del rango seguro de operación (15°C a 30°C).

## 🎯 Objetivo

Construir una clase que garantice que el estado del termostato permanezca siempre dentro de parámetros seguros, rechazando cualquier intento de cambio inválido y mostrando una advertencia por consola.

## ✨ Características

- Atributos privados: `temperaturaActual` y `modoOperacion`.
- `setTemperatura(double nuevaTemperatura)`: rechaza valores fuera del rango permitido e imprime una advertencia, conservando la temperatura anterior.
- `getTemperatura()`: permite consultar la temperatura actual de forma segura.
- Modo de operación validado (`FRIO`, `CALOR` o `AUTO`).
- Límites del rango definidos como constantes privadas.
- Validaciones internas en métodos privados, reutilizadas por el constructor y los setters.
- El termostato siempre se crea en un estado válido.
## 📚 Conceptos aplicados

Encapsulamiento · Modificadores de acceso · Getters y setters · Validación de datos · Constantes · Constructores · Métodos privados
![U3 ejercicio3](U3%20ejercicio3.png)

