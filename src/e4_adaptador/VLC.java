package e4_adaptador;

public class VLC implements MediaPackage{

    @Override
    public void playFile(String filename) {
        System.out.println("Playing VLC File " + filename);
    }
    
}
