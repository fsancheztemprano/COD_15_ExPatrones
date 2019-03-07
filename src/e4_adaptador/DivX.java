package e4_adaptador;
/**
 * @author fsancheztemprano
 */
public class DivX implements MediaDivX {

    @Override
    public void playFilm(String filename) {
        System.out.println("Playing DivX file " + filename);
    }

}
