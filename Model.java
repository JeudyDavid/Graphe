//package Graphe.functiongrapher.grapher;
//
//import javax.swing.*;
//
//public class Model {
//
//    private static double windowX, windowY, windowWidth, windowHeight;
//    public static final int WIDTH = 1024;
//    public  static final int HEIGHT = 768;
//    private JTextField textField = new JTextField();
//
//    public int getHEIGHT() {
//        return HEIGHT;
//    }
//
//    public int getWIDTH() {
//        return WIDTH;
//    }
//
//    public JTextField getTextField() {
//        return textField;
//    }
//
//    public void setTextField(JTextField textField) {
//        this.textField = textField;
//    }
//    private static double bottom() {
//        return windowY - halfWindowHeight();
//    }
//
//    private double right() {
//        return windowX - halfWindowWidth();
//    }
//
////    static double toRealX(int screenX) {
////        return screenX / (double)WIDTH * windowWidth + right();
////    }
////
////    private double toRealY(int screenY) {
////        return (HEIGHT - screenY) / (double)HEIGHT * windowHeight + bottom();
////    }
////
////    static int toScreenX(double realX) {
////        return (int) ((realX - right()) / windowWidth * WIDTH);
////    }
//
//    static int toScreenY(double realY) {
//        return HEIGHT - (int) ((realY - bottom()) / windowHeight * HEIGHT);
//    }
//
//    private double halfWindowWidth() {
//        return windowWidth / 2.0;
//    }
//
//    private static double halfWindowHeight() {
//        return windowHeight / 2.0;
//    }
//
//}
