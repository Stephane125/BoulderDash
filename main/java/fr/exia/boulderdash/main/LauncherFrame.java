package fr.exia.boulderdash.main;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import javax.sound.sampled.*;

public class LauncherFrame extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6569522214535602488L;

	private Clip audioClip;

    public LauncherFrame() {
        setTitle("BoulderDash Launcher");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\paoss\\Desktop\\BoulderDash.png");
        JLabel imageLabel = new JLabel(imageIcon);
        panel.add(imageLabel, BorderLayout.CENTER);

        JButton playButton = new JButton("Play");
        JButton quitButton = new JButton("Quit");

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                launchGame();
            }
        });

        JComboBox<String> mapComboBox = new JComboBox<>(new String[]{"L1", "L2", "L3", "L4", "L5"});
        mapComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedMap = Objects.requireNonNull(mapComboBox.getSelectedItem()).toString();
                loadMap(selectedMap);
            }
        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopMusic();
                System.exit(0);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(playButton);
        buttonPanel.add(mapComboBox);
        buttonPanel.add(quitButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                stopMusic();
                System.exit(0);
            }
        });

        setVisible(true);

        playMusic();
    }

    private void playMusic() {
        try {
            File audioFile = new File("E:\\SONGS\\Java\\run.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
            audioClip.start();

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    private void stopMusic() {
        if (audioClip != null && audioClip.isRunning()) {
            audioClip.stop();
        }
    }

    private void launchGame() {
        new GameFrame();
        dispose();
    }

    private void loadMap(String mapName) {
         System.out.println("Selected Map: " + mapName);
     }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LauncherFrame());
    }
}
