//package Graphe.functiongrapher.grapher;
//
//import Graphe.functiongrapher.grapher.expression.Function;
//import Graphe.functiongrapher.grapher.transfrom.ExpressionParser;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.awt.image.BufferedImage;
//import java.util.ArrayList;
//import java.util.List;
//
//public class View extends JPanel{
//
//        public static final int WIDTH = 1024;
//        public static final int HEIGHT = 768;
//
//
//    private BufferedImage buff;
//        private Graphics2D g2d;
//
//        private ExpressionParser parser;
//        private Function function;
//
//        private double windowX, windowY, windowWidth, windowHeight;
//        private Point mousePt;
//
//        private String textField;
//        public  JTextField textField = new JTextField();
//
//        public View() {
//            addMouseWheelListener(new Controller());
//            addKeyListener(new Controller());
//            this.addMouseListener(new MouseAdapter() {
//                @Override
//                public void mousePressed(MouseEvent e) {
//                    mousePt = e.getPoint();
//                    repaint();
//                }
//            });
//            this.addMouseMotionListener(new MouseMotionAdapter() {
//                @Override
//                public void mouseDragged(MouseEvent e) {
//                    int dx = e.getX() - mousePt.x;
//                    int dy = e.getY() - mousePt.y;
//                    windowX -= dx / (double) WIDTH * windowWidth;
//                    windowY += dy / (double) HEIGHT * windowHeight;
//                    mousePt = e.getPoint();
//                    repaint();
//                }
//            });
//
//            requestFocusInWindow();
//            setPreferredSize(new Dimension(WIDTH, HEIGHT));
//            setMinimumSize(new Dimension(WIDTH, HEIGHT));
//            setMaximumSize(new Dimension(WIDTH, HEIGHT));
//
//            buff = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
//            g2d = buff.createGraphics();
//
//            parser = new ExpressionParser();
//            textField.setPreferredSize(new Dimension(150,40));
//            textField.setText("0");
//            textField = "0";
//            function = parser.parse(textField.getText());
//
//            windowX = 0.0;
//            windowY = 0.0;
//            windowHeight = 2.0;
//            windowWidth = windowHeight * WIDTH / HEIGHT;
//        }
//
//
//
//    private double yVar = 0.0;
//    private double zVar = 0.0;
//    private synchronized void updateDT(double dt) {
//        yVar += dt;
//        zVar = Math.sin(yVar);
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        g2d.setColor(Color.WHITE);
//        g2d.fillRect(0, 0, WIDTH, HEIGHT);
//
//        synchronized (this) {
//            java.util.List<Double> xs = new ArrayList<>();
//            List<Double> ys = new ArrayList<>();
//
//            for (int x = 0; x < WIDTH; x++) {
//                double xx = Model.toRealX(x);
//
//                double yy = 0.0;
//                if (function != null) yy = function.evaluateAt(xx, yVar, zVar);
//
//                double scaledX = x;
//                double scaledY = Model.toScreenY(yy);
//                scaledY = Math.min(Math.max(scaledY, -5), HEIGHT + 5);
//
//                xs.add(scaledX);
//                ys.add(scaledY);
//            }
//
//            int[] xa = new int[xs.size()];
//            int[] ya = new int[ys.size()];
//            for (int i = 0; i < xa.length; i++) {
//                xa[i] = xs.get(i).intValue();
//            }
//            for (int i = 0; i < ya.length; i++) {
//                ya[i] = ys.get(i).intValue();
//            }
//
//            g2d.setColor(Color.BLACK);
//            int xAxisY = Model.toScreenY(0.0);
//            g2d.drawLine(0, xAxisY, WIDTH, xAxisY);
//            int yAxisX = Model.toScreenX(0.0);
//            g2d.drawLine(yAxisX, 0, yAxisX, HEIGHT);
//
//            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//            g2d.setColor(new Color(50, 50, 180));
//            g2d.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND));
//            g2d.drawPolyline(xa, ya, xa.length);
//
//            g2d.setFont(new Font("courier new", Font.ITALIC, 40));
//            g2d.setColor(Color.LIGHT_GRAY);
//            g2d.fillRect(0, HEIGHT - g2d.getFontMetrics().getHeight(), WIDTH, HEIGHT);
//            g2d.setColor(Color.BLACK);
//            g2d.drawString("f(x) = " + textField, 0.0f, HEIGHT - 10.0f);
//
//            g2d.drawString("x", 0, xAxisY - 10);
//            g2d.drawString("y", yAxisX + 10, g2d.getFontMetrics().getHeight() - 20);
//        }
//
//        g.drawImage(buff, 0, 0, null);
//    }
//
//
//
//}
