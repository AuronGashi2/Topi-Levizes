import java.awt.*;
/** GjuajeTopin i konstrukton dhe i nis objektet e animacionit. */
public class GjuajeTopin
{ public static void main(String[] args)
{ // konstrukto objektet e modelit:
    int madhesia_e_kutise = 200;
    int rrezja_e_topit = 6;
    Kuti kutia = new Kuti(madhesia_e_kutise);
// vendose topin jo mu ne qender te kutise, po afer 3/5 e pozites:
    TopLevizes topi = new TopLevizes((int)(madhesia_e_kutise / 3.0),
            (int)(madhesia_e_kutise / 5.0),
            rrezja_e_topit, kutia);
    VizatuesTopi vizatuesi_i_topit = new VizatuesTopi(topi, Color.red);
    VizatuesKutie vizatuesi_i_kutise = new VizatuesKutie(kutia);
    VizatuesAnimacioni vizatuesi
            = new VizatuesAnimacioni(vizatuesi_i_kutise, vizatuesi_i_topit,
            madhesia_e_kutise);
// konstruktoje kontrolluesin dhe nise:
    new GjuajtjeKontrollues(topi, vizatuesi).niseAnimacionin();
}
}