import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
    private JTextArea commandTextArea;
    private JTextArea resultTextArea;
    private JButton executeButton;
    // Add other GUI components here

    public GUI() {
        setTitle("MySQL Command Executor");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize GUI components and add them to the frame
        commandTextArea = new JTextArea();
        resultTextArea = new JTextArea();
        executeButton = new JButton("Execute");

        // Add action listener to the execute button
        executeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                executeSQLCommand(commandTextArea.getText());
            }
        });

        // Add components to the frame
        // ...

        setVisible(true);
    }

    private void executeSQLCommand(String command) {
        // Implement database connection and execution of the command here
        // Display results in resultTextArea
    }

    public static void main(String[] args) {
        new GUI();
    }
}
