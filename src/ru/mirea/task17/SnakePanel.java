package ru.mirea.task17;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
enum position {
    up,down,left,right;
}
public class SnakePanel extends JPanel implements ActionListener {
    static class NameException extends Exception {
        public NameException(String name) {
            super(name);
        }
    }
    Image up;
    Image down;
    Image left;
    Image right;
    Image body;
    Image feed;
    int[] snakex = new int[750];
    int[] snakey = new int[750];
    Random rand = new Random();
    Date date = new Date();
    int foodx = rand.nextInt(34) * 25;
    int foody = rand.nextInt(24) * 25;
    int len = 3;
    int score = 0;
    int max_score = 10;
    position direction = position.right;
    boolean isStarted = false;
    boolean isFailed = false;
    boolean ready = true;
    String name = "NoName";
    String path = "C:\\Users\\Alex\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task17\\skins\\";
    Timer timer = new Timer(100, this);
    private  MainWindow game;
    java.util.List<String> scoreboard = new ArrayList<>();
    String regex = "^[a-zA-Z]*$";
    Pattern pattern = Pattern.compile(regex);
    public SnakePanel(MainWindow s) {
        game = s;
        JFrame frame = new JFrame("Snake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
        JLabel gameName = new JLabel("SNAKE");
        gameName.setFont(new Font("",Font.ITALIC, 28));
        gameName.setBounds(150, 43, 150, 30);
        frame.add(gameName);
        JLabel gamePic = new JLabel(new ImageIcon(path + "Snake.jpg"));
        gamePic.setBounds(200, 30, 150, 50);
        frame.add(gamePic);
        JTextField Input = new JTextField(10);
        Input.setBounds(175, 150, 100, 30);
        frame.add(Input);
        JLabel Name = new JLabel("Input your nickname:");
        Name.setBounds(175, 100, 150, 30);
        frame.add(Name);
        JLabel score = new JLabel("Input max. score:");
        score.setBounds(350, 100, 150, 30);
        frame.add(score);
        JTextField maxscore = new JTextField(10);
        maxscore.setBounds(350, 150, 100, 30);
        maxscore.setText("");
        frame.add(maxscore);
        JButton ok = new JButton("Start Game");
        ok.setBounds(175, 300, 150, 30);
        frame.add(ok);
        JLabel skin = new JLabel("Choice your Skin:");
        skin.setBounds(30, 100, 150, 30);
        frame.add(skin);
        JButton blue = new JButton("Blue");
        blue.setBounds(30, 150, 100, 30);
        frame.add(blue);
        JButton red = new JButton("Red");
        red.setBounds(30, 200, 100, 30);
        frame.add(red);
        JButton green = new JButton("Green");
        green.setBounds(30, 250, 100, 30);
        frame.add(green);
        frame.setVisible(true);
        green.setEnabled(true);
        red.setEnabled(true);
        blue.setEnabled(false);
        PaintBlue();
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Input.getText().length() != 0) {
                        name = Input.getText();
                        Matcher matcher = pattern.matcher(name);
                        if (matcher.matches() == false) throw new NameException(name);
                    }
                    max_score = Integer.parseInt(maxscore.getText());
                    setFocusable(true);
                    addKeyListener(new FieldKeyLiestener());
                    setup();
                    game.setVisible(true);
                    frame.dispose();
                }
                catch (NumberFormatException | NameException ex) {
                    JOptionPane.showMessageDialog(null, "Incorrect Name/Max. score!", "alert", JOptionPane.ERROR_MESSAGE);
                    Input.setText("NoName");
                    maxscore.setText("20");
                }
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blue.setEnabled(false);
                green.setEnabled(true);
                red.setEnabled(true);
                PaintBlue();
            }
        });
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                green.setEnabled(false);
                red.setEnabled(true);
                blue.setEnabled(true);
                PaintGreen();
            }
        });
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                red.setEnabled(false);
                green.setEnabled(true);
                blue.setEnabled(true);
                PaintRed();
            }
        });
    }

    public void paint(Graphics g) {
        this.setBackground(Color.BLACK);
        g.fillRect(0, 0, 900, 725);
        g.setColor(Color.WHITE);
        g.drawString("Score: " + score, 20, 20);
        if (direction == position.right)
            g.drawImage(right, snakex[0], snakey[0], this);
        else if (direction == position.left)
            g.drawImage(left, snakex[0], snakey[0], this);
        else if (direction == position.up)
            g.drawImage(up, snakex[0], snakey[0], this);
        else if (direction == position.down)
            g.drawImage(down, snakex[0], snakey[0], this);
        for (int i = 1; i < len; i++)
            g.drawImage(body, snakex[i], snakey[i], this);
        g.drawImage(feed, foodx, foody, this);
    }

    public void setup() {
        isStarted = false;
        isFailed = false;
        ready = true;
        timer.start();
        direction = position.right;
        len = 3;
        score = 0;
        snakex[0] = 100;
        snakex[1] = 75;
        snakex[2] = 50;
        snakey[0] = 100;
        snakey[1] = 100;
        snakey[2] = 100;
    }

    public void CreateApple() {
        foodx = rand.nextInt(34) * 25 + 25;
        foody = rand.nextInt(24) * 25 + 75;
        for (int i = 0; i < len; i++) {
            if (foodx == snakex[i] && foody == snakey[i])
                CreateApple();
        }
    }

    class FieldKeyLiestener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int KeyCode = e.getKeyCode();
            if (ready) {
                if (KeyCode == KeyEvent.VK_SPACE) {
                    isStarted = true;
                    isFailed = false;
                } else if (KeyCode == KeyEvent.VK_UP && direction != position.down)
                    direction = position.up;
                else if (KeyCode == KeyEvent.VK_DOWN && direction != position.up)
                    direction = position.down;
                else if (KeyCode == KeyEvent.VK_RIGHT && direction != position.left)
                    direction = position.right;
                else if (KeyCode == KeyEvent.VK_LEFT && direction != position.right)
                    direction = position.left;
                ready = false;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if (isStarted) {
            for (int i = len; i > 0; i--) {
                snakex[i] = snakex[i - 1];
                snakey[i] = snakey[i - 1];
            }
            if (direction == position.right) {
                snakex[0] = snakex[0] + 25;
                if (snakex[0] > 875) snakex[0] = 0;
            } else if (direction == position.left) {
                snakex[0] = snakex[0] - 25;
                if (snakex[0] < 0) snakex[0] = 875;
            } else if (direction == position.up) {
                snakey[0] = snakey[0] - 25;
                if (snakey[0] < 0) snakey[0] = 675;
            } else if (direction == position.down) {
                snakey[0] = snakey[0] + 25;
                if (snakey[0] > 675) snakey[0] = 0;
            }
            ready = true;
            if (snakex[0] == foodx && snakey[0] == foody) {
                score++;
                len++;
                if (score == max_score){
                    NickWrite();
                    timer.stop();
                    isStarted = false;
                    game.dispose();
                    JOptionPane.showMessageDialog(this, "You Win!!!");
                    System.exit(0);
                }
                CreateApple();
            }
            for (int i = 1; i < len; i++) {
                if (snakex[0] == snakex[i] && snakey[0] == snakey[i]) {
                    NickWrite();
                    setup();
                    timer.stop();
                    RestartMenu();
                }
            }
        }
        repaint();
    }

    void NickWrite() {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Alex\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task17\\Test.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("Player: " + name + "|" + "Score: " + score + "|" + "Max score: " + max_score + "|" + "Date: " + date + "|" + "Your personal session code: "+ game.hashCode() + "\n");
            scoreboard.add("Player: " + name + "|" + "Score: " + score + "|" + "Max score: " + max_score + "|" + "Date: " + date + "\n");
            bufferWriter.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    void PaintBlue() {
        ImageIcon image_up = new ImageIcon(path + "\\Blue\\upBlue.png");
        up = image_up.getImage();
        ImageIcon image_down = new ImageIcon(path + "\\Blue\\downBlue.png");
        down = image_down.getImage();
        ImageIcon image_left = new ImageIcon(path + "\\Blue\\leftBlue.png");
        left = image_left.getImage();
        ImageIcon image_right = new ImageIcon(path + "\\Blue\\rightBlue.png");
        right = image_right.getImage();
        ImageIcon image_body = new ImageIcon(path + "\\Blue\\bodyBlue.png");
        body = image_body.getImage();
        ImageIcon image_feed = new ImageIcon(path + "\\food.png");
        feed = image_feed.getImage();
    }

    void PaintRed() {
        ImageIcon image_up = new ImageIcon(path + "\\Red\\upRed.png");
        up = image_up.getImage();
        ImageIcon image_down = new ImageIcon(path + "\\Red\\downRed.png");
        down = image_down.getImage();
        ImageIcon image_left = new ImageIcon(path + "\\Red\\leftRed.png");
        left = image_left.getImage();
        ImageIcon image_right = new ImageIcon(path + "\\Red\\rightRed.png");
        right = image_right.getImage();
        ImageIcon image_body = new ImageIcon(path + "\\Red\\bodyRed.png");
        body = image_body.getImage();
        ImageIcon image_feed = new ImageIcon(path + "\\food.png");
        feed = image_feed.getImage();
    }

    void PaintGreen() {
        ImageIcon image_up = new ImageIcon(path + "\\Green\\upGreen.png");
        up = image_up.getImage();
        ImageIcon image_down = new ImageIcon(path + "\\Green\\downGreen.png");
        down = image_down.getImage();
        ImageIcon image_left = new ImageIcon(path + "\\Green\\leftGreen.png");
        left = image_left.getImage();
        ImageIcon image_right = new ImageIcon(path + "\\Green\\rightGreen.png");
        right = image_right.getImage();
        ImageIcon image_body = new ImageIcon(path + "\\Green\\bodyGreen.png");
        body = image_body.getImage();
        ImageIcon image_feed = new ImageIcon(path + "\\food.png");
        feed = image_feed.getImage();
    }

    void RestartMenu(){
        JFrame restart_frame = new JFrame("Game Over!");
        restart_frame.getContentPane().setBackground(Color.white);
        restart_frame.setSize(400, 300);
        restart_frame.setLocationRelativeTo(null);
        restart_frame.setLayout(null);
        JLabel over = new JLabel("Game Over!");
        over.setBounds(150, 30, 150, 30);
        restart_frame.add(over);
        JButton restart = new JButton("Try again");
        restart.setBounds(30, 150, 100, 30);
        restart_frame.add(restart);
        JButton exit = new JButton("Exit");
        exit.setBounds(255, 150, 100, 30);
        restart_frame.add(exit);
        restart_frame.setVisible(true);
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setup();
                restart_frame.dispose();
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}