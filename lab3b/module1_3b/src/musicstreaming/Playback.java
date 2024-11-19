package musicstreaming;

public abstract class Playback {
    protected MusicSource musicSource;

    public Playback(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    public abstract void play();
}
