import java.util.Scanner;
import javax.swing.*;
import static javax.swing.JDialog.setDefaultLookAndFeelDecorated;

public class Rhai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
setDefaultLookAndFeelDecorated(true);

        String name = JOptionPane.showInputDialog("What is your name?");


        JOptionPane.showMessageDialog(null, "Happy birthday, " + name + "!");

        JOptionPane.showMessageDialog(null, """
                 welcome to the 19 year old club! KEME HAHAHHAHHAHHHAH
                 I know na you're facing different kinds of people everyday, and ang wish ko is di mo
                 kami malimutan and please don't change your self para lang ma-please yung ibang tao.
                 Sana din happy ang iyong heart! Nako sasapakin ko yon pag sinaktan ka non, alam ko kung pano
                 ka masaktan and ayoko maulit yon. You are one of my most cherished friends, and I won't have doubts
                 na isa ka din sa pinakaiingatan kong kaibigan. I wish nothing but the best, whether sa academics man
                 yan, family and everything. Miss you! See you soon! Love na love kita, always <3""");

        JOptionPane.showMessageDialog(null, """
                 copy mo tong link na 2 beh, utos yan hindi suggestion HAHHAHAHA LOVE U 
                 kung ayaw macopy, chat mo q HAHHAHA SEND Q NA LANG LINK SAU MWA
                 https://gifft.me/3d#UaVorImEpYc3SJ6zBbYa""");

        input.close();
    }
}
