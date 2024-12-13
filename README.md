# ISO2-2024-C03-Testing-P3


## **Grupo C03-Problema3 - Ingeniería del Software 2**  
Bienvenido al repositorio del grupo de laboratorio C03-Problema3  

## **1. Implementación**
Realizado por:

| Nombre                       | Correo                       |
|------------------------------|------------------------------|
| Elías González Valdepeñas    | elias.gonzalez@alu.uclm.es   |
| Jesús Calleja Soto	         | jesus.callejas@alu.uclm.es  |

## **2. Gestión de Pruebas**
Realizado por:

| Nombre                       | Correo                       |
|------------------------------|------------------------------|
| Arturo Avilés Morillas       | arturo.aviles@alu.uclm.es    |
| María Belén Gallego-Casilda Sánchez	         | mbelen.gallego@alu.uclm.es   |

(insertar la imagen aqui)

## **3. Testing con JUnit**
Realizado por: 

| Nombre                       | Correo                       |
|------------------------------|------------------------------|
| Alejandro Fernández Muñoz    | alejandro.fdez3@alu.uclm.es   |
| Lucía García Sánchez	         | lucia.garcia72@alu.uclm.es  |

Hemos detectado varios errores a la hora de realizar las pruebas y lo hemos solucionado de la siguiente forma:

- **Evaluación de Condiciones Extremas Primero**:
  
  Hemos movido la evaluación de condiciones extremas (como quedarse en casa) a una etapa inicial, antes de considerar si la persona está sana o no, y si tiene el pasaporte COVID. Con esto conseguimos que las situaciones críticas se gestionen primero, sin que se omitan por otras verificaciones.

- **Claridad en la Evaluación de Actividades**:

  Hemos simplificado la lógica para recomendar actividades. Primero verificamos las condiciones meteorológicas (temperatura, humedad, precipitaciones) y luego evaluamos las restricciones del espacio (aforo permitido, sin restricciones). Esto hace que las recomendaciones sean coherentes.

- **Enfoque en Restricciones de Espacio de Ocio**:

  Ahora evaluamos de manera más clara las restricciones del espacio (aforo permitido y sin restricciones), garantizando que respetemos las condiciones del espacio para cada actividad.

- **Simplificación de la Lógica**:

  Hemos reducido la complejidad del código al priorizar las condiciones críticas y simplificar la estructura general. Esto facilita tanto el entendimiento como el mantenimiento del código, haciéndolo más eficiente.

  Por todos estos fallos que hemos cometido, nos salía esta cobertura que refleja, efectivamente, que no se estaban manejando adecuadamente los casos críticos, y como resultado nos salían muchos fallos.
  
![image](https://github.com/user-attachments/assets/180b05fb-8546-4b47-bfc5-51107eed063a)





