package ro.mta.facc.selab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> carti;


    public void sort()
    {
        Collections.sort(carti);
    }



    public Biblioteca() {
        carti = new ArrayList<Carte>();
    }

    public void add(Carte carte)
    {
        carti.add(carte);
    }

    public void removeBook(Carte c)
    {
        carti.remove(c);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Biblioteca contine: \n");

        for(Carte c:carti)
        {
            builder.append(c.toString());
            builder.append('\n');
        }
        return builder.toString();
    }
}
