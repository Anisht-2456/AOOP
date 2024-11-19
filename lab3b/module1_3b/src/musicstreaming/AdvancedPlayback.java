package musicstreaming;

public class AdvancedPlayback extends Playback {

    public AdvancedPlayback(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        musicSource.play();
        addAdvancedFeatures();
    }

    private void addAdvancedFeatures() {
        System.out.println("Adding advanced playback features.");
    }
}