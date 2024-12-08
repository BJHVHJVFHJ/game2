package uet.oop.bomberman.gui;

import javax.swing.*;
import java.awt.*;

public class GameMenuGui {
    private JFrame frame;

    // Hàm hiển thị menu, nhận một hành động (Runnable) để chạy khi nhấn "Bắt đầu"
    public void showMenu(Runnable onStartGame) {
        frame = new JFrame("BombermanMenu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        // Tạo bảng chứa nút
        JPanel panel = new BackgroundPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 450));

        // Tạo nút "Bắt đầu" với hình ảnh
        JButton startButton = new JButton(new ImageIcon("res/menu/Play.png"));
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setFocusPainted(false);
        startButton.setPreferredSize(new Dimension(245, 66));

        // Thêm sự kiện bấm nút
        startButton.addActionListener(e -> {
            frame.dispose(); // Đóng menu
            onStartGame.run(); // Chạy game chính
        });

        panel.add(startButton);

        // Thêm panel vào frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // Lớp vẽ nền (ảnh nền menu)
    static class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel() {
            // Đường dẫn tới ảnh nền
            backgroundImage = new ImageIcon("res/menu/background.png").getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
