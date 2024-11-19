package musicstreaming;

public class EqualizerDecorator extends PlaybackDecorator {

    public EqualizerDecorator(Playback decoratedPlayback) {
        super(decoratedPlayback);
    }

    @Override
    public void play() {
        super.play();
        addEqualizer();
    }

    private void addEqualizer() {
        System.out.println("Equalizer settings applied.");
    }
}