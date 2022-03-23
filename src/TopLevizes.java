/** TopLevizes e modelon nje top qe leviz */
public class TopLevizes
{   private int x_poz; // x-pozita e qendres se topit
    private int y_poz;// y-pozita e qendres se topit
    private int rrezja; // rrezja e topit
    private int x_shpejtesia = +5; // shpejtesia horizontale; pozitive = djathtas
    private int y_shpejtesia = +2; // shpejtesia vertikale; pozitive = teposhte
    private Kuti mbajtesi; // mbajtesi ne te cilin udheton topi
    /** Konstruktori TopLevizes e konstrukton topin.
     * @param x_fillues - qendra horizontale e pozites filluese te topit
     * @param y_fillues - qendra vertikale e pozites filluese te topit
     * @param r - rrezja e topit
     * @param kutia - permbajetesi ne te cilin udheton topi */
    public TopLevizes(int x_fillues, int y_fillues, int r, Kuti kutia)
    { x_poz = x_fillues;
        y_poz = y_fillues;
        rrezja = r;
        mbajtesi = kutia;
    }
    /** xPozita e kthen poziten horizontale momentale te topit */
    public int xPozita()
    { return x_poz; }
    /** yPozita e kthen poziten vertikale momentale te topit */
    public int yPozita()
    { return y_poz; }
    /** rrezjaE e kthen rrezen e topit */
    public int rrezjaE()
    { return rrezja; }
    /** levize e leviz topin
     * @param njesi_kohe - sasia e kohes prejse eshte levizur topi
     * heren e fundit */
    public void leviz(int njesi_kohe)
    { x_poz = x_poz + (x_shpejtesia * njesi_kohe);
        if ( mbajtesi.neKontaktHorizontal(x_poz + rrezja) )
        { x_shpejtesia = -x_shpejtesia; } // ktheje drejtimin horizontal prapa
        y_poz = y_poz + (y_shpejtesia * njesi_kohe);
        if ( mbajtesi.neKontaktHorizontal(y_poz + rrezja) )
        { y_shpejtesia = -y_shpejtesia; } // ktheje drejtimin vertikal prapa
    }
    public static void main(String[] args)
    { Kuti kutia = new Kuti(50); // me madhesi 50 piksela me 50 piksela
        TopLevizes topi = new TopLevizes(25, 25, 10, kutia); // rrezja = 10 piksela
        while ( true )
        { topi.leviz(1); // 1 njesi te kohes se kaluar
            System.out.println("x = " + topi.xPozita()
                    + "; y = " + topi.yPozita());
        }
    }
}
