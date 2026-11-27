package es.iesmontenaranco.programacion.UT3;

public class Teoria {

    /* SINTAXIS de una clase:
    [modificadores] class <NombreClase>{
        Atributos
        Métodos
    }
    * */


    /* SINTAXIS de un atributo:
    [modificadores <tipo><NombreAtributo>;
    modificadores de acceso de los atributos: public, private, protected o ninguno
    modificadoes de contenido: static, final -> pueden aparecer varios a la vez
        - final: el atributo es una constante: se inicializa,
        pero no se puede modicifar su valor a lo largo del programa.
    * */


    /* SINTAXIS de un método:
    [modificadores] <tipo> <nombreMetodo> ([<lista_parametros>])
    modificadores: public, private, protectec, ninguno | static, final
    * */


    /* TIPS
    * ----Modificadores----
    *   - public: cualquier clase de cualquier paquete puede 'ver' el atributo/metodo
    *   - private: solo es 'visible' el atributo/metodo dentro de la propia clase
    *   - sin modificador: se puede 'ver' el atributo/metodo desde la propia clase y desde todas las clases dentro del mismo paquete
    *   - protected: se puede 'ver' el atributo/metodo desde la propia clase, desde sus clases hijas y desde las clases que estén dentro del mismo paquete
    *   - final: El atributo es una constante, por lo tanto, su nombre debe escribirse en MAYÚSCULASy debe inicializarse cuando se cree el objeto
    *   - static: El atributo/metodo es de la clase, es decir, es el mismo para todos los objetos y no es necesario crear objetos para que exista. Se puede acceder a traves del nombre de la clase
    * ([nombre de la clase].atributo)
    *
    * Como norma general, en las clases:
    *  .- Los atributos serán private: porque no podemos modificarlos/consuktarlos directamente sino que le tenemos que hacer a través de sus métodos.
    *  .- Los métodos serán public: porque es lo que utilizaremos para acceder/modificar/consultar los atributos de la clase
    *  .- Las constantes (modificador final) se pueden inicializar de dos formas distintas:
    *       - a la vez que declaramos el atributo lo podemos inicializar (private final float PI = 3.14f;) -> todos los objetos tendrçan el mismo valor para ese atributo
    *       - inicializarlo en todos los constructores que existan en la clase (Ej:public Punto(char cardinalidad){CARDINALIDAD = cardinalidad;}) -> cada objeto va a tener un valor distinto en ese atributo
    *   .- El acceso a los metodos y a los atributos se realiza a traves del operador .(punto)
    *       - Sintaxis del acceso de los metodos de instancia (Es un objeto): [nombre del objero].nombre del metodo
    *       - Sintaxis del acceso de los metodos de clase: [nombre de la clase].nombre del metodo
    *   .- Un metodo estatico solo puede llamar a metodos y atributos que sean estaticos
    *
    *
    * ----Tipos de metodos----
    *   - GET (Obtener, leer): Solo devuelve el valor de un atributo usando return y no reciben parametros. Tiene que existir uno por cada atributo. El nombre del metodo es 'get seguido del nombre del atributo con la incial en mayusculas'
    *   - SET (Establecer, modificar): Modifica el valor de un atributocon el valr proporcionado a traves del parametro de entrada. No devuelve ningun valor
    *   - TOSTRING: Devuelve un String con la informacion completa del objeto (el valor de sus atributos) y no tiene parametros
    *   - DE PROPÓSITO GENERAL: Aquellos que realizan operaciones de caracter general y que no son ni getters ni setters ni toString ni constructores.
    *   - CONSTRUCTORES: Nos permiten crear el objeto
    * */


    /* ----THIS----
        - Se usa para referirse a atributos/metodos de instancia (los que no son de la clase)
        - No se puede utilizar para acceder a atributos/metodos estaticos o de clase
        - Evita ambigüedades (ej: setters) y ayuda a la legibilidad del codigo
        - this(): se utiliza en un constructor para llamar a otro constructor de la misma clase. Tiene que ser la primera instruccion
    * */


    /* ----CONSTRUCTORES----
        -Debe existir al menos el constructor por defecto
        - Si existe otro constructor, OBLIGATORIAMENTE, debemos escribir el constructor por defecto
        - Sirven para crean los objetos y tienen que inicializan todos sus atributos
        - Desde un constructor para llamar a otro constructor, hay que hacerlo con this()
        - Sobrecarga de métodos: mismo nombre con distinto numero de parametros
        - Solo se puede llamar a un constructor desde otro constructor. No se puede llamar como si estuviesemos llamando a un metodo normal

    * */




}
