/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.gva.sanchezgarcia.jg.ut2.e3_panels.logic;

import es.gva.sanchezgarcia.jg.ut2.e3_panels.beans.Actor;
import es.gva.sanchezgarcia.jg.ut2.e3_panels.beans.Pelicula;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author josegaspar
 */
public class LogicApp {
    private Pelicula pelicula;
    /**
     * Constructor por defecto crea una pelicual con la que probar la aplicación.
     */
    public LogicApp() {
        String s="En 1314, Robert, ahora rey de Escocia, lidera un ejército escocés ante una línea ceremonial de tropas inglesas en los campos de Bannockburn, donde debe aceptar formalmente el dominio inglés. Cuando comienza a cabalgar hacia los ingleses, se detiene e invoca la memoria de Wallace, implorando a sus hombres que luchen con él como lo hicieron con Wallace. Robert luego lleva a su ejército a la batalla contra el atónito inglés, ganando la libertad de los escoceses. " + "Braveheart es una película estadounidense histórica-dramática de 1995 dirigida, producida y protagonizada por Mel Gibson. La cinta épica, basada en la vida de William Wallace, un héroe nacional escocés que participó en la Primera Guerra de Independencia de Escocia, fue ganadora de cinco Premios Óscar, incluyendo mejor película.\n" +
                "Argumento\n" +"\n" +
                "En 1280, el rey Eduardo I de Inglaterra invade y conquista Escocia tras la muerte de Alejandro III de Escocia, que no dejó heredero al trono. William Wallace es testigo de una traición del rey inglés contra un grupo de señores feudales locales, sobrevive a la muerte de su padre y su hermano, y es llevado al extranjero en una peregrinación por toda Europa por su tío paterno Argyle, donde es educado. Años después, Eduardo I le otorga a sus nobles tierras y privilegios en Escocia y así mismo concede a nobles Escoceses, para conseguir su apoyo tierras en Inglaterra, incluida la primae nocte. Mientras tanto, Wallace regresa a Escocia y se enamora de su amiga de la infancia Murron MacClannough, y los dos se casan en secreto para evitar la primae nocte. Wallace rescata a Murron de ser violada por soldados ingleses, pero mientras lucha contra su segundo intento, Murron es capturada y ejecutada públicamente. En venganza, Wallace lidera a su clan y asesina a la guarnición inglesa en su ciudad natal y envía a la guarnición invasora de Lanark de regreso a Inglaterra.\n" +
                "\n" +
                "El Zanquilargo ordena a su hijo, el príncipe Eduardo, que detenga a Wallace por todos los medios necesarios ya que él debe dirigir otra campaña en defensa de los feudos ingleses en Francia. Wallace se rebela contra los ingleses y, a medida que su leyenda se propaga, cientos de escoceses de los clanes circundantes se unen a él. Wallace lleva a su ejército a la victoria en la Batalla del Puente de Stirling y luego incursiona en el norte de Inglaterra ahora indefenso sin el ejército aniquilado en Stirling, saquea la ciudad de York matando al sobrino de El Zanquilargo y enviando su cabeza cortada al rey, el cual en su colera defenestra él mismo al ayuda de cámara del Príncipe Eduardo por sus impertinencias y por considerarlo incompetente para asesorar militarmente a su hijo. Wallace por su lado busca la ayuda de Robert Bruce, el hijo del noble Robert Bruce Sr. y aspirante a la corona escocesa. Robert está dominado por su padre enfermo de lepra, quien desea asegurar el trono para su hijo sometiéndose a los ingleses. Preocupado por la amenaza de la rebelión, El Zanquilargo envía a la esposa de su hijo, Isabel de Francia, para intentar negociar con Wallace como una distracción para el envío de otra fuerza de invasión en Escocia, esta vez por mar.\n" +
                "\n" +
                "Después de conocerlo en persona, Isabel se enamora de Wallace. Advertido de la inminente invasión por Isabel -el príncipe Eduardo había ordenado levas y el Rey las había reorganizado para invadir Escocia-, Wallace implora a la nobleza escocesa que tome medidas inmediatas para contrarrestar la amenaza y recuperar el país. Liderando al ejército inglés él mismo, el Rey Eduardo se enfrenta a los escoceses en Falkirk, donde los nobles Lochlan y Mornay, después de haber sido sobornados por el rey inglés, traicionan a Wallace, causando que los escoceses pierdan la batalla tras una lluvia de flechas galesas que mataron indiscriminadamente en el fragor de la melé. Cuando Wallace, con un pedazo de flecha clavada en el hombro carga contra El Zanquilargo a caballo, es interceptado por uno de los lanceros del rey, que resulta ser Robert Bruce, pero lleno de remordimiento, Bruce lleva a Wallace a un lugar seguro antes de que los ingleses puedan capturarlo. Wallace mata a Lochlan y Mornay por su traición y libra una guerra de guerrillas contra los ingleses durante los próximos siete años con la ayuda de Isabel con quien finalmente tiene una aventura amorosa. Robert establece una reunión con Wallace en Edimburgo, pero el padre de Robert ha conspirado con otros nobles para capturar y entregar a Wallace a los ingleses. Al enterarse de su traición, Robert -vapuleado en su intento de salvar a Wallace- rechaza a su padre. Isabel se venga del rey Eduardo, que ahora padece una enfermedad terminal, diciéndole que su linaje será destruido después de su muerte, ya que ahora está embarazada del hijo de Wallace.\n" +
                "\n" +
                "En Londres, Wallace es llevado ante un magistrado inglés, juzgado por alta traición y condenado a ser torturado y decapitado públicamente. Incluso mientras es ahorcado, arrastrado y descuartizado, Wallace se niega a someterse al rey mientras que la multitud que al principio lo abucheaba e injuriaba mira después horrorizada su suplicio. Conforme los gritos pidiendo misericordia para él -darle muerte inmediatamente para que deje de sufrir- provienen de la multitud que mira profundamente conmovida por el valor del escocés, el magistrado le ofrece una última oportunidad, pidiéndole que pronuncie la palabra \"misericordia\" y que se le concederá una muerte rápida. Wallace grita, \"¡Libertad!\", y el juez ordena su muerte considerando que ya es inútil que sufra más. Momentos antes de ser decapitado, Wallace tiene una visión de Murron en la multitud sonriéndole, pero Wallace no muere en vano Eduardo I muere quedando como sucesor del trono su hijo el débil Eduardo II.\n";
        
                this.pelicula=new Pelicula("Braveheart", s);
           String b1="Mel Gibson es hijo de Hutton Gibson y de Anne Reilly Gibson. Su abuela materna fue una cantante de ópera australiana, Eva Mylott. Es el sexto de once hijos. Uno de sus hermanos menores, Donald, también es actor.\n" +
"\n" +
"Su nombre, Mel, proviene del fundador de la diócesis de Ardagh, un santo irlandés del siglo V, mientras que su nombre Columcille, también ha sido vinculado a un santo irlandés.5​ Columcille es el nombre de la parroquia irlandesa del condado de Longford donde nació y creció su madre, Anne Reilly.\n" +
"\n" +
"Mel Gibson nació y vivió sus primeros años en Estados Unidos, donde el padre de Mel trabajaba para la compañía de ferrocarriles New York Central, cuando sufrió una lesión por la que demandó a la empresa, en febrero de 1968. El jurado le concedió indemnizaciones por 145.000 $.6​ Luego, la familia Gibson se fue a vivir a Australia debido a las protestas de Hutton Gibson contra la Guerra de Vietnam, en la que los hermanos mayores de Mel se arriesgaban a ser reclutados. También se debió a que Hutton pensaba que los cambios en los Estados Unidos se estaban volviendo inmorales. ";
                
         Actor a1=new Actor("Mell", "Gibson", b1);
         String b2="Sophie Danièle Sylvie Maupu (París, Francia, 17 de noviembre de 1966), más conocida como Sophie Marceau, es una actriz, directora y escritora francesa. En su adolescencia, Marceau cosechó popularidad con su actuación en las películas La Boum (1980) y La Boum 2 (1982), recibiendo un Premio César a la mejor actriz revelación. Se convirtió en una estrella en Europa tras una sucesión de exitosas películas como L'Étudiante (1988), Pacific Palisades (1990), Fanfan (1993) y La hija de D’Artagnan (1994). Marceau logró repercusión internacional por su participación en producciones como Braveheart (1995), Firelight (1997) y la película del agente secreto James Bond The World Is Not Enough (1999).";
         
         Actor a2=new Actor("Sophie", "Maupu", b2);
         
         String b3="Brendan Gleeson (Dublín, 29 de marzo de 1955) es un actor irlandés que ha trabajado en películas como Braveheart, The General, Gangs of New York, Troya, In Bruges y la saga de Harry Potter. Es padre del también actor Domhnall Gleeson.\n" +
"Biografía\n" +
"\n" +
"Nació en Dublín (Irlanda), y tuvo una vida alejada de la actuación hasta que terminó la universidad, aunque su primer papel importante lo obtuvo con 34 años, en la película irlandesa The Field, en 1990, una de las primeras en las que trabajó. Antes de dedicarse a la actuación fue profesor de secundaria en un instituto en Dublín.\n" +
"\n" +
"Debido a The Field consiguió papeles en Hollywood de bajo presupuesto, haciendo siempre de inglés o irlandés, incluso en la pequeña pantalla con la serie The Teatry, producida por la RTÉ One, donde interpretó a Michael Collins. Por su participación en esta película recibió el Jacob's Award, en 1992.\n" +
"\n" +
"En 1995 intervino en la galardonada y épica Braveheart dando vida a Hamish, el recio y robusto escocés, mano derecha y fiel amigo de William Wallace (Mel Gibson). Gracias a este papel fue más conocido y pudo cambiar un poco de roles, interviniendo en Turbulence, Misión: Imposible II y A.I. Inteligencia Artificial. ";
         
         Actor a3=new Actor("Bendan","Glesson",b3);
         pelicula.addActor(a1);
         pelicula.addActor(a2);
         pelicula.addActor(a3);
    }
    
    

    public LogicApp(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
    
    public String[] getListadoActores(){
        List<String> milista=new ArrayList();
        
        List<Actor> reparto = this.pelicula.getReparto();
        
        for(Actor a : reparto){
            milista.add(a.getActorNombreApellidos());
        }
        
        String [] miarray =new String[milista.size()];
        miarray=milista.toArray(miarray);
        
        return miarray;
    }
}
