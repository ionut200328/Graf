import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame frame = new JFrame("Graph");
    JButton button1 = new JButton("Nonoriented Graph");
    JButton button2 = new JButton("Oriented Graph");
    static int buttonPressed = 0;

    public Main() {
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the preferred size of the buttons
        Dimension buttonSize = new Dimension(200, 50);  // You can adjust this value
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        panel.add(button1, gbc);
        panel.add(Box.createRigidArea(new Dimension(0, 100)), gbc);  // Add 100px vertical space
        panel.add(button2, gbc);

        frame.add(panel, BorderLayout.CENTER);

        button1.addActionListener(e -> {
            buttonPressed = 1;
            frame.getContentPane().removeAll();
            frame.add(new Frame());
            frame.revalidate();
            frame.repaint();
        });

        button2.addActionListener(e -> {
            buttonPressed = 2;
            frame.getContentPane().removeAll();
            frame.add(new Frame());
            frame.revalidate();
            frame.repaint();
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
