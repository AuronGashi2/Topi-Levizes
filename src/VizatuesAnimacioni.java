import java.awt.*;
import javax.swing.*;
/** VizatuesAnimacioni e paraqet nje kuti me nje top ne te. */
public class VizatuesAnimacioni extends JPanel
{ private VizatuesKutie vizatuesi_i_kutise; // pamja dalese e kutise
    private VizatuesTopi vizatuesi_i_topit; // pamja dalese e topit ne kuti
    /** Konstruktori VizatuesAnimacioni e konstrukton pamjen e kutise dhe te topit
     * @param k - vizatuesi i kutise
     * @param t - vizatuesi i topit
     * @param madhesia - madhesia e kornizes */
    public VizatuesAnimacioni(VizatuesKutie k, VizatuesTopi t, int madhesia)
    { vizatuesi_i_kutise = k;
        vizatuesi_i_topit = t;
        JFrame korniza_ime = new JFrame();
        korniza_ime.getContentPane().add(this);
        korniza_ime.setTitle("Gjuajtja e Topit");
        korniza_ime.setSize(madhesia, madhesia);
        korniza_ime.setVisible(true);
    }
    /** paintComponent paints the box and ball
     * @param g - the graphics pen */
    public void paintComponent(Graphics g)
    { vizatuesi_i_kutise.vizato(g);
        vizatuesi_i_topit.vizato(g);
    }
    /** main - vetem per testim */
    public static void main(String[] args)
    { Kuti k = new Kuti(200);
        TopLevizes t = new TopLevizes(50, 50, 10, k);
        VizatuesKutie vk = new VizatuesKutie(k);
        VizatuesTopi vt = new VizatuesTopi(t, Color.red);
        new VizatuesAnimacioni(vk, vt, 50);
    }
}