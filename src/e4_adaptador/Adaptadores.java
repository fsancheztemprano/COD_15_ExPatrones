package e4_adaptador;

public class Adaptadores {

    public static void main(String[] args) {
        MediaPlayer player = new MP3();
        player.play("file.mp3");
        player = new FormatAdapter(new MP4());
        player.play("file.mp4");
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
        
        
        /*
        instanciamos un objeto de la interfaz MediaDivX
        */
        MediaDivX dx = new DivX();
        dx.playFilm("video1.divx");
        
        /*
        instanciamos un objeto de la interfaz MediaPackage 
        clase MP4 utilizando el DivXAdapter para poder 
        llamar al metodo playFilm()
        */
        dx = new DivXAdapter(new MP4());//
        dx.playFilm("video2.mp4");
        
        /*
        instanciamos un objeto de la interfaz MediaPackage 
        clase VLC utilizando el DivXAdapter para poder 
        llamar al metodo playFilm()
        */        
        dx = new DivXAdapter(new VLC());
        dx.playFilm("video3.vlc");
    }

    private static class FormatAdapter implements MediaPlayer {

        private MediaPackage media;

        public FormatAdapter(MediaPackage m) {
            media = m;
        }

        @Override
        public void play(String filename) {
            System.out.print("Using Adapter --> ");
            media.playFile(filename);
        }
    }
    /**
     * Adapter:
     * adapta cualquier clase que implemente mediaPackage 
     * para adaptarla a una clase DIVX
     */
    private static class DivXAdapter implements MediaDivX{
        /*
        recibimos el obj MediaPackage como un atributo del 
        constructor para hacer un llamado a su 
        metodo playFile()
        */
        private MediaPackage media;
        
        public DivXAdapter(MediaPackage m){
            media = m;
        }

        @Override
        public void playFilm(String filename) {
            System.out.print("Using Adapter --> ");
            media.playFile(filename);
        }
        
    }
}
