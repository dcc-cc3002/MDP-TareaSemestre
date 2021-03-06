package personaje;

import personaje.abstract_clases.AbstractEnemy;
import personaje.interfaces.Ipersonaje;

//Clase del enemigo Goomba
public class Goomba extends AbstractEnemy {
    //Constructor de la clase, usa el mismo de AbstractEnemy
    public Goomba(){
        super( 1, 2, 4, 7);
    }

    @Override
    public void siendoAtacadoLuis(Ipersonaje p1, AttackType t1) {
        if(t1 == AttackType.MARTILLO){
            atacadoporMartillo(p1);
        }
        else if (t1 == AttackType.SALTO){
            atacadoporSalto(p1);
        }
    }
    @Override
    public void siendoAtacadoMarco(Ipersonaje p1, AttackType t1) {
        if(t1 == AttackType.MARTILLO){
            atacadoporMartillo(p1);
        }
        else if (t1 == AttackType.SALTO){
            atacadoporSalto(p1);
        }
    }

    @Override
    public void attack(Ipersonaje p1) {
        p1.siendoAtacadoporGoomba(this);
    }
}
