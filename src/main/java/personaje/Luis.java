package personaje;

import personaje.abstract_clases.AbstractPlayer;
import personaje.interfaces.Ienemy;

public class Luis extends AbstractPlayer {

    //Constructor de clase del personaje Marco
    public Luis(){
        super(1, 2, 1.5, 20, 50);
    }

    @Override
    public void attack(Ienemy p1, AttackType t1) {
        if(t1==AttackType.MARTILLO){
            usoFP(2);
            p1.siendoAtacadoLuis(this, t1);
        }else {
            usoFP(1);
            p1.siendoAtacadoLuis(this, t1);
        }
    }
    @Override
    public void siendoAtacadoporBoo(Boo b){
        this.atacado(b);
    }
    @Override
    public void siendoAtacadoporGoomba(Goomba g){
        this.atacado(g);
    }
    @Override
    public void siendoAtacadoporSpiny(Spiny s){
        this.atacado(s);
    }
}
