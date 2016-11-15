package Business.PlayMusic;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class PlayMusic {

    private FileInputStream fis;
    private BufferedInputStream bis;
    public long pauseLocation;
    public long songTotalLength;
    public Player player;
    public String fileLocation;
    
    public void stop() {
        if(player != null) {
            player.close();
        }
    }
    
    public void Pause() {
        if(player != null) {
            try {
                pauseLocation = fis.available();
            } catch (IOException ex) {
                
            }
            player.close();
        }
    }
    
    public void Play(String path) {
        try {
            fis = new FileInputStream(path);
            bis = new BufferedInputStream(fis);
            try {
                player = new Player(bis);
                songTotalLength = fis.available();
                fileLocation = path +"";
            } catch (JavaLayerException ex) {
                
            } catch (IOException ex) {
                
            }
        } catch (FileNotFoundException ex) {
            
        }
        
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                    
                }
            }
        }.start();
        
    }
    
    
    public void resume() {
        try {
            fis = new FileInputStream(fileLocation);
            bis = new BufferedInputStream(fis);
            try {
                player = new Player(bis);
                fis.skip(songTotalLength-pauseLocation);
            } catch (JavaLayerException ex) {
                
            } catch (IOException ex) {
                
            }
        } catch (FileNotFoundException ex) {
            
        }
        
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                    
                }
            }
        }.start();
    }
    
}
