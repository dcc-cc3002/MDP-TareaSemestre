package personaje;

import personaje.abstract_clases.AbstractPlayer;
import personaje.interfaces.Ienemy;

public class Marco extends AbstractPlayer {

    //Constructor de clase del personaje Marco
    public Marco(){
        super(1, 4, 5, 10, 50);
    }

    @Override
    public void attack(Ienemy p1, AttackType t1) {
        if(t1==AttackType.MARTILLO){
            usoFP(2);
            p1.siendoAtacadoMarco(this, t1);
        }else {
            usoFP(1);
            p1.siendoAtacadoMarco(this, t1);
        }
    }

    @Override
    public void siendoAtacadoporGoomba(Goomba g){
        this.atacado(g);
    }
    @Override
    public void siendoAtacadoporSpiny(Spiny s){
        this.atacado(s);
    }

    @Override
    public void siendoAtacadoporBoo(Boo boo) {

    }
}

