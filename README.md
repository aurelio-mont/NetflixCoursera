Desarrollar un código de Java siguiendo los pasos a continuación:

Crea una clase llamada Pelicula con las siguientes características:
• Atributos: titulo, genero, creador, año, duracion y visto.

• Constructores:

• Un constructor default.

• Un constructor con el titulo y creador. Los demás campos tendrán su valor default por tipo de dato. Visto tendrá false por defecto.

•	Un constructor con todos los atributos, excepto visto.

• Métodos:

• Métodos get de todos los atributos, excepto visto.

• Métodos set de todos los atributos, excepto visto.

• Sobreescribe el método toString.


2. Crea una clase Serie con las siguientes características:

• Sus atributos son titulo, no. de temporadas, visto, genero, creador y duracion.

• Por default, el número de temporadas es 1 y visto false.

• El resto de atributos serán valores por defecto según el tipo de atributo.

• Constructores:

• Un constructor default.

• Un constructor con el titulo y creador. Los demás campos tendrán su valor default por tipo de dato.

• Visto tendrá false por defecto.

• Un constructor con todos los atributos, excepto visto.

• Métodos:

• Métodos get de todos los atributos, excepto visto.

• Métodos set de todos los atributos, excepto visto.

• Sobrescribe el método toString


3. En principio, las clases anteriores no son padre-hija, pero sí tienen atributos en común. Realiza el análisis correcto e impleméntalo para tener un óptimo resultado.


4. Crea una interfaz llamada Visualizable con los siguientes métodos:

• marcarVisto() cambia el atributo de visto a true.

• esVisto() devuelve el estado del atributo visto.

• tiempoVisto() devuelve el tiempo en minutos/segundos que se visualizó el video.

Clase Ejecutable
Utiliza el programa anterior para implementar la clase ArrayList en lugar de manejar el Arreglo de Objetos.
Analiza el programa para cachar posibles eventos inesperados que pudieran ocurrir durante el programa e implementa las Excepciones necesarias.


