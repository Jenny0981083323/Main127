import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements KeyListener {//KeyListener接收鍵盤事件(擊鍵)的偵聽器介面
    Sheep s;
    public  Main(){
        s=new Sheep(40,40);
        addKeyListener(this);
    }

    public void  paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());//長方形,顏色添滿視窗
        s.drawSheep(g);
        requestFocusInWindow();

    }
    public static void main(String[] args) {
        JFrame window=new JFrame();
        window.setContentPane(new Main());

        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {//釋放某個鍵時呼叫此方法

    }

    @Override
    public void keyPressed(KeyEvent e) {//keyPressed按下某個鍵時呼叫此方法。
        int k=e.getKeyCode();
        System.out.println(k);
        if(k==KeyEvent.VK_UP){
            s.walk(0,-5);
        }
        if(k==KeyEvent.VK_DOWN){
            s.walk(0,5);

        }
        if(k==KeyEvent.VK_LEFT){
            s.walk(-5,0);

        }
        if(k==KeyEvent.VK_RIGHT){
            s.walk(5,0);
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {//鍵入某個鍵時呼叫此方法

    }
}
