package musicstreaming;

public class BasicPlayback extends Playback {

    public BasicPlayback(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        musicSource.play();
    }
}