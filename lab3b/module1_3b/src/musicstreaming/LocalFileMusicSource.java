package musicstreaming;

public class LocalFileMusicSource implements MusicSource {
    private String fileName;

    public LocalFileMusicSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing local file: " + fileName);
    }
}
