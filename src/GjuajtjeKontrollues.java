/** GjuajtjeKontrollues e kontrollon nje top levizes brenda nje kutie. */
public class GjuajtjeKontrollues
{ private TopLevizes topi; // objekti model
    private VizatuesAnimacioni vizatuesi; // objekti i pamjes-dalese
    /** Konstruktori GjuajtjeKontrollues e nis kontrolluesin
     * @param t - objekti model
     * @param v - objekti i pamjes dalese */
    public GjuajtjeKontrollues(TopLevizes t, VizatuesAnimacioni v)
    { topi = t;
        vizatuesi = v;
    }
    /** niseAnimacionin e nis animacionin sipas ores se brendshme */
    public void niseAnimacionin()
    { int njesia_e_kohes = 1; // njesia e kohes per secilin hap te animacionit
        int vonesa_e_vizatimit = 20; // sa te vonohet ndermjet dy rivizatimeve
        while ( true )
        { prit(vonesa_e_vizatimit);
            topi.leviz(njesia_e_kohes);
            System.out.println(topi.xPozita() + ", " + topi.yPozita());
            vizatuesi.repaint(); // rishfaqe kutine dhe topin
        }
    }
    /** prit e ndal ekzekutimin per 'sa' milisekonda */
    private void prit(int sa)
    { try { Thread.sleep(sa); }
    catch (InterruptedException e) { }
    }
}
