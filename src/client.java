import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class client {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Music Player");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create the music player panel
            MusicPlayerPanel musicPlayerPanel = new MusicPlayerPanel();
            frame.getContentPane().add(musicPlayerPanel);

            frame.pack();
            frame.setVisible(true);
        });
    }
}
