package second_watcher.swing;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> System.out.println("AngelListener"));
        button.addActionListener(event -> System.out.println("DevilListener"));
    }
}
//
//class AngelListener implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("AngelListener");
//    }
//}
//class DevilListener implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("DevilListener");
//    }
//}

