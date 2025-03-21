import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GeneratedGUI extends JFrame {

    private JButton clickMeButton;
    private JLabel messageLabel;
    private JPanel mainPanel;
    private JPanel inputPanel;
    private JTextField inputField;
    private JButton processButton;
    private JTextArea outputArea;
    private Random random;

    public GeneratedGUI() {
        setTitle("Interactive Avant-Garde GUI");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        random = new Random();

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        clickMeButton = new JButton("Generate Random Message");
        messageLabel = new JLabel("Welcome to the Avant-Garde GUI!");
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] messages = {
                        "Hii...... everyone!",
			"Iam AMULYA VARMA!",
			"WELCOME to the GUI!",
                        "Java is awesome!",
                        "Learn and try coding!",
                        "Enjoy the view of the page!",
                        "A random string appears!",
                        "The button has been clicked again and again...",
                        "This message is completely superb.",
                        "A new message is shown.",
                        "Try typing something in the text field!",
                        "This GUI is getting more advanced.",
                        "Random colors are fun!",
                        "The output area will show your input.",
                        "Input processing is now active."
                };
                int randomIndex = random.nextInt(messages.length);
                messageLabel.setText(messages[randomIndex]);

                float red = random.nextFloat();
                float green = random.nextFloat();
                float blue = random.nextFloat();
                Color randomColor = new Color(red, green, blue);
                mainPanel.setBackground(randomColor);
            }
        });

        buttonPanel.add(clickMeButton);

        inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        inputField = new JTextField(20);
        processButton = new JButton("Process Input");
        outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);

        processButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                outputArea.append("Input: " + input + "\n");
                inputField.setText("");
            }
        });

        inputPanel.add(inputField);
        inputPanel.add(processButton);

        mainPanel.add(messageLabel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(outputArea), BorderLayout.EAST);

        add(mainPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GeneratedGUI());
    }
}