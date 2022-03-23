/** GjuajtjeKontrollues i kontrollon dy topa levizes brenda nje kutie. */
public class GjuajtjeKontrollues2
{ private TopLevizes topi1; // objekt model
    private TopLevizes topi2; // objekt model
    private VizatuesAnimacioni2 vizatuesi; // objekti i pamjes-dalese
    /** Konstruktori GjuajtjeKontrollues e nis kontrolluesin
     * @param t1 - top
     * @param t2 - top tjeter
     * @param v - objekti i pamjes dalese */
    public GjuajtjeKontrollues2(TopLevizes t1, TopLevizes t2,
                                VizatuesAnimacioni2 v)
    { topi1 = t1;
        topi2 = t2;
        vizatuesi = v;
    }
    /** niseAnimacionin e nis animacionin sipas ores se brendshme */
    public void niseAnimacionin()
    { int njesia_e_kohes = 1; // njesia e kohes per secilin hap te animacionit
        int vonesa_e_vizatimit = 20; // sa te vonohet ndermjet dy rivizatimeve
        while ( true )
        { prit(vonesa_e_vizatimit);
            topi1.leviz(njesia_e_kohes);
            topi2.leviz(njesia_e_kohes);
// System.out.println(topi.xPozita() + ", " + topi.yPozita());
            vizatuesi.repaint(); // rishfaqe kutine dhe topin
        }
    }
    /** prit e ndal ekzekutimin per 'sa' milisekonda */
    private void prit(int sa)
    { try { Thread.sleep(sa); }
    catch (InterruptedException e) { }
    }
}
