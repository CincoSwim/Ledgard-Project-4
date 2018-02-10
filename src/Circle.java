import javax.swing.*;

public class Circle {
    static double x;
    static double y;
    static String input;
    static double leng;

    public static class InputPane {
        JFrame f;
        InputPane(){
            f = new JFrame();

            input = JOptionPane.showInputDialog(f,"Enter X Coordinate:");
            x = Double.parseDouble(input);

            input = JOptionPane.showInputDialog(f,"Enter Y Coordinate:");
            y = Double.parseDouble(input);

        }

    }
    public static class OutputTestTrue {
        JFrame f;
        OutputTestTrue(){
            f = new JFrame();
            JOptionPane.showMessageDialog(f,"Point (" + (int) x + ", " + (int) y + ") is in the circle.","Hooray!", JOptionPane.WARNING_MESSAGE);

        }
    }
    public static class OutputTestFalse {
        JFrame f;
        OutputTestFalse(){
            f = new JFrame();
            f = new JFrame();
            JOptionPane.showMessageDialog(f,"Point (" + (int) x + ", " + (int) y + ") is not in the circle.","Alert!", JOptionPane.WARNING_MESSAGE);

        }
    }
    public static void main (String[] args){
       new InputPane();

       leng = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

       if (leng < 10.0)
           new OutputTestTrue();
       else
           new OutputTestFalse();

    }
}
