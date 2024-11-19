package musicstreaming;

public abstract class PlaybackDecorator extends Playback {
    protected Playback decoratedPlayback;

    public PlaybackDecorator(Playback decoratedPlayback) {
        super(decoratedPlayback.musicSource);
        this.decoratedPlayback = decoratedPlayback;
    }

    @Override
    public void play() {
        decoratedPlayback.play();
    }
}