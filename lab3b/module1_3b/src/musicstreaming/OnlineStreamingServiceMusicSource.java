package musicstreaming;

public class OnlineStreamingServiceMusicSource implements MusicSource {
    private String url;

    public OnlineStreamingServiceMusicSource(String url) {
        this.url = url;
    }

    @Override
    public void play() {
        System.out.println("Streaming from URL: " + url);
    }
}