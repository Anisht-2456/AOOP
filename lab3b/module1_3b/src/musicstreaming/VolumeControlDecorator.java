package musicstreaming;

public class VolumeControlDecorator extends PlaybackDecorator {

    public VolumeControlDecorator(Playback decoratedPlayback) {
        super(decoratedPlayback);
    }

    @Override
    public void play() {
        super.play();
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Volume adjusted.");
    }
}