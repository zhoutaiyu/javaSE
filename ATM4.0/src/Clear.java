import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Clear {
	// public class Clear{
	public static void clear() {
		try {
			Robot r = new Robot();
			r.mousePress(InputEvent.BUTTON3_MASK); // ��������Ҽ�
			r.mouseRelease(InputEvent.BUTTON3_MASK); // �ͷ�����Ҽ�
			r.keyPress(KeyEvent.VK_CONTROL); // ����Ctrl��
			r.keyPress(KeyEvent.VK_R); // ����R��
			r.keyRelease(KeyEvent.VK_R); // �ͷ�R��
			r.keyRelease(KeyEvent.VK_CONTROL); // �ͷ�Ctrl��
			r.delay(100);
		} catch (AWTException awt) {
			awt.printStackTrace();
		}
	}
}