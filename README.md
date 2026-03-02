# Proyecto HotelJava

Este es un proyecto práctico desarrollado en Java para aplicar conceptos de Programación Orientada a Objetos (POO).

El programa simula el sistema básico de un hotel, donde se pueden gestionar personas y crear reservas con diferentes servicios.

## Conceptos aplicados en el código:
*Herencia:* Se creó una clase base llamada Person, de la cual heredan las clases Guest (huésped) y Employee (empleado) para no repetir código.
*Composición:* La clase Booking (reserva) es la principal, y está compuesta por objetos de otras clases, como el huésped, la habitación (BedRoom) y una lista de servicios adicionales (Services).

## Estructura del proyecto
A continuación se muestra el diagrama de clases con la arquitectura del código:

![Diagrama del Hotel](img/diagrama_claseshotel.png)