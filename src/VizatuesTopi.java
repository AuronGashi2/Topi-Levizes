import java.awt.*;
/** VizatuesTopi e paraqet ne ekran nje top levizes */
public class VizatuesTopi
{ private TopLevizes topi; // objekti top i paraqitur (adresa e vet)
    private Color ngjyra_e_topit;
    /** Konstruktori VizatuesTopi
     * @param x - topi qe do te paraqitet
     * @param n - ngjyra e tij */
    public VizatuesTopi(TopLevizes x, Color n)
    { topi = x;
        ngjyra_e_topit = n;
    }
    /** vizato e vizaton topin ne pamje (ekran)
     * @param g - penda grafike e perdorur per ta vizatuar topin */
    public void vizato(Graphics g)
    { g.setColor(ngjyra_e_topit);
        int rrezja = topi.rrezjaE();
        g.fillOval(topi.xPozita() - rrezja, topi.yPozita() - rrezja,
                rrezja * 2, rrezja * 2);
    }
}