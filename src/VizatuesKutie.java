import java.awt.*;
/** VizatuesKutie e paraqet nje kuti */
public class VizatuesKutie
{ private Kuti kutia; // objekti kuti qe do te paraqitet
    /** Konstruktori VizatuesKutie e paraqet kutine
     * @param k - kutia qe paraqitet */
    public VizatuesKutie(Kuti k)
    { kutia = k; }
    /** vizato e vizaton kutine
     * @param g - the penda grafike e perdorur per ta vizatuar kutine */
    public void vizato(Graphics g)
    { int madhesia = kutia.madhesiaE();
        g.setColor(Color.white);
        g.fillRect(0, 0, madhesia, madhesia);
        g.setColor(Color.black);
        g.drawRect(0, 0, madhesia, madhesia);
    }
}