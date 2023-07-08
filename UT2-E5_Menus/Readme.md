# Ejercicio UT2-E2 Menús
Crea una aplicación llamada **casa** que disponga de un *menú* con la siguiente distribución:
- Casa (tendrá un icono con una casa)
    - Habitaciones (Menu)
        - Habitación 1 (MenuItem).
        - Habitación 2 (MenuItem): desactivado.
    - Salón (CheckBox): seleccionado. Ctrl+S
    - SEPARADOR
    - Cocina (RadioButton): seleccionado. Ctrl+C
    - Baño (RadioButton): Ctrl+B
- Extras
    - Garaje (MenuItem): Alt+G
    - Trastero (MenuItem): Alt+T

A continuación se pueden ver dos prototipos del menú:
Menu Casa
Menu Casa
Menu Extras
Menu Extras

* Aparte, el **JFrame** deberá incluir un **JTextPane**, en el que se incluirán, a modo de log o registro cada vez que el usuario pulsa uno de los elementos, escribiendo un mensaje de este tipo:
    Has entrado al Salón 3 veces. Estado: activado” (siendo el estado el valor del **RadioButton** o del **CheckBox** en ese momento, y el número de veces un contador que se irá incrementando a medida que se entra en cada una de las opciones).
TextPane menús
TextPane menús
* Asegúrate de nombrar correctamente cada uno de los componentes con su prefijo adecuado (mnb, mnu, mni).

