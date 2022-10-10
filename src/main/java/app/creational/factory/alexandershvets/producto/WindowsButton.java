package app.creational.factory.alexandershvets.producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Producto concreto
public class WindowsButton implements Button {

    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    @Override
    public void render() {
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        this.panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        this.frame.getContentPane().add(this.panel);

        this.panel.add(label);

        this.onClick();

        this.panel.add(this.button);

        this.frame.setSize(320, 200);
        this.frame.setVisible(true);

        this.onClick();
    }

    @Override
    public void onClick() {
        this.button = new JButton("Exit");
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
