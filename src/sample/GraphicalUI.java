package sample;
import javax.swing.*;
import java.util.Scanner;

public class GraphicalUI {
    private transient Scanner s = new Scanner(System.in);
    public void showMessege (String st){
        JOptionPane.showMessageDialog(null,st);
    }
    public void showError (String st){
        JOptionPane.showMessageDialog(null,st,"Error",JOptionPane.ERROR_MESSAGE);
    }

}
