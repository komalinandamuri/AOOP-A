// MusicStreamingApp.java

// Common Interface
interface MusicPlayer {
    void play();
}

// Local Music Adapter
class LocalMusicPlayer implements MusicPlayer {
    private String filePath;

    public LocalMusicPlayer(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void play() {
        System.out.println("Playing local file: " + filePath);
    }
}

// Online Streaming Adapter
class OnlineStreamingPlayer {
    private String streamUrl;

    public OnlineStreamingPlayer(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    public void startStreaming() {
        System.out.println("Streaming online from: " + streamUrl);
    }
}

class OnlineStreamingAdapter implements MusicPlayer {
    private OnlineStreamingPlayer streamingPlayer;

    public OnlineStreamingAdapter(String streamUrl) {
        this.streamingPlayer = new OnlineStreamingPlayer(streamUrl);
    }

    @Override
    public void play() {
        streamingPlayer.startStreaming();
    }
}

// Radio Station Adapter
class RadioStationPlayer {
    private String stationName;

    public RadioStationPlayer(String stationName) {
        this.stationName = stationName;
    }

    public void tuneIn() {
        System.out.println("Tuning in to radio station: " + stationName);
    }
}

class RadioStationAdapter implements MusicPlayer {
    private RadioStationPlayer radioPlayer;

    public RadioStationAdapter(String stationName) {
        this.radioPlayer = new RadioStationPlayer(stationName);
    }

    @Override
    public void play() {
        radioPlayer.tuneIn();
    }
}

// Decorator Base Class
abstract class MusicPlayerDecorator implements MusicPlayer {
    protected MusicPlayer decoratedPlayer;

    public MusicPlayerDecorator(MusicPlayer decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
    }
}

// Equalizer Decorator
class EqualizerDecorator extends MusicPlayerDecorator {
    public EqualizerDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        decoratedPlayer.play();
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Applying equalizer settings...");
    }
}

// Volume Control Decorator
class VolumeControlDecorator extends MusicPlayerDecorator {
    private int volume;

    public VolumeControlDecorator(MusicPlayer decoratedPlayer, int volume) {
        super(decoratedPlayer);
        this.volume = volume;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
        setVolume();
    }

    private void setVolume() {
        System.out.println("Setting volume to: " + volume);
    }
}
