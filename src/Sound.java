import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

import java.applet.AudioClip;
import java.io.*;
import java.io.FileInputStream;

/**
 * Created by el on 04/12/2016.
 */
public class Sound {

    public static void music() {
        AudioPlayer MusicBackground = AudioPlayer.player;
        AudioStream BackGroundMusic;
        AudioData MusicData;
        ContinuousAudioDataStream loop = null;

        try {
            BackGroundMusic = new AudioStream(new FileInputStream("blurp.wav"));
            MusicData = BackGroundMusic.getData();
            loop = new ContinuousAudioDataStream(MusicData);
        }catch (IOException error){
            System.out.println("error");
        }
        MusicBackground.start(loop);
    }
}
