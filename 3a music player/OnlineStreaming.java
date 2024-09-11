// Main.java

public class OnlineStreaming {
    public static void main(String[] args) {
        // Local Music
        MusicPlayer localPlayer = new LocalMusicPlayer("song.mp3");

        // Online Streaming
        MusicPlayer onlinePlayer = new OnlineStreamingAdapter("http://example.com/stream");

        // Radio Station
        MusicPlayer radioPlayer = new RadioStationAdapter("Classic Rock FM");

        // Decorate Local Music Player with Equalizer and Volume Control
        MusicPlayer equalizedLocalPlayer = new EqualizerDecorator(localPlayer);
        MusicPlayer volumeControlledLocalPlayer = new VolumeControlDecorator(equalizedLocalPlayer, 75);

        // Demonstrate functionality
        System.out.println("Playing local music:");
        volumeControlledLocalPlayer.play();

        System.out.println("\nPlaying online stream:");
        onlinePlayer.play();

        System.out.println("\nPlaying radio station:");
        radioPlayer.play();
    }
}
