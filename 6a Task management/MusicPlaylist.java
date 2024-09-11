import java.util.LinkedList;

public class MusicPlaylist {
    private LinkedList<String> playlist;

    public MusicPlaylist() {
        playlist = new LinkedList<>();
    }

    public void addSong(String song) {
        playlist.add(song);
    }

    public void removeSong(String song) {
        playlist.remove(song);
    }

    public void moveSong(String song, int newPosition) {
        if (playlist.remove(song)) {
            playlist.add(newPosition, song);
        } else {
            System.out.println("Song not found in the playlist.");
        }
    }

    public void displayPlaylist() {
        System.out.println("Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(i + ": " + playlist.get(i));
        }
    }

    public static void main(String[] args) {
        MusicPlaylist mp = new MusicPlaylist();
        mp.addSong("Song A");
        mp.addSong("Song B");
        mp.displayPlaylist();

        mp.moveSong("Song A", 1);
        mp.removeSong("Song B");
        mp.displayPlaylist();
    }
}
