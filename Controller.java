//package Graphe.functiongrapher.grapher;
//
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.awt.event.MouseWheelEvent;
//import java.awt.event.MouseWheelListener;
//
//public class Controller implements MouseWheelListener, KeyListener, Runnable {
//    Model model;
//    View view;
//
//    Controller(){
//        model.getWIDTH();
//
//    }
//
//
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//
//    }
//
//    @Override
//    public void mouseWheelMoved(MouseWheelEvent e) {
//    }
//
//    @Override
//    public void run() {
//        boolean running = true;
//
//        long oldTime = 0;
//        double dt = 0.0;
//
//        while (running) {
//
//            long newTime = System.nanoTime();
//            dt = (newTime - oldTime) / 1000000000.0;
//            oldTime = newTime;
//
////            view.updateDT();
////            repaint();
//
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
