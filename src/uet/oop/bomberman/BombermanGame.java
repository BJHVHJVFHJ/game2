package uet.oop.bomberman;

import uet.oop.bomberman.gui.Frame;
import uet.oop.bomberman.gui.GameMenuGui;
import uet.oop.bomberman.sound.Sound;

public class BombermanGame {
	public static void main(String[] args) {
		// Bắt đầu phát nhạc nền
		Sound.play("soundtrack");

		// Hiển thị menu
		GameMenuGui menu = new GameMenuGui();
		menu.showMenu(() -> {
			// Khi nhấn "Play", chạy game chính
			new Frame();
		});
	}
}
