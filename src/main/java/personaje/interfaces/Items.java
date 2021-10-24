package personaje.interfaces;

import java.util.ArrayList;

public interface Items {

    //Metodo que se emplea para hacer uso del item, que luego llama al metodo del personaje en cuestion que lo ocupa
    void use(Ipersonaje p1);
    //Metodo para eleminar el objeto del baul luego de ser usado
    void deleteBaul(ArrayList<Items> baul);
}