import java.awt.*;
import javax.swing.*;
/** VizatuesAnimacioni2 e paraqet nje kuti me dy topa ne te. */
public class VizatuesAnimacioni2 extends JPanel
{ private VizatuesKutie vizatuesi_i_kutise; // pamja dalese e kutise
    private VizatuesTopi vizatuesi_i_topit1; // pamja dalese e topit1 ne kuti
    private VizatuesTopi vizatuesi_i_topit2; // pamja dalese e topit2 ne kuti
    /** Konstruktori VizatuesAnimacioni e konstrukton pamjen e kutise dhe topit
     * @param k - vizatuesi i kutise
     * @param t1 - vizatuesi i topit te pare
     * @param t2 - vizatuesi i topit te dyte
     * @param madhesia - madhesia e kornizes */
    public VizatuesAnimacioni2(VizatuesKutie k,
                               VizatuesTopi t1,
                               VizatuesTopi t2,
                               int madhesia)
    { vizatuesi_i_kutise = k;
        vizatuesi_i_topit1 = t1;
        vizatuesi_i_topit2 = t2;
        JFrame korniza_ime = new JFrame();
        korniza_ime.getContentPane().add(this);
        korniza_ime.setTitle("Gjuaje");
        korniza_ime.setSize(madhesia, madhesia);
        korniza_ime.setVisible(true);
    }
    /** paintComponent paints the box and ball
     * @param g - the graphics pen */
    public void paintComponent(Graphics g)
    { vizatuesi_i_kutise.vizato(g);
        vizatuesi_i_topit1.vizato(g);
        vizatuesi_i_topit2.vizato(g);
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