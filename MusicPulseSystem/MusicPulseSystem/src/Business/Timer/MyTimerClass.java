package Business.Timer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimerTask;

public class MyTimerClass extends TimerTask {

    @Override
    public void run() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    }
    
}
