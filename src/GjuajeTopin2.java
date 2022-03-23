import java.awt.*;
/** GjuajeTopin i konstrukton dhe i nis objektet ne animacion. */
public class GjuajeTopin2
{ public static void main(String[] args)
{ // konstrukto objektet e modelit:
    int madhesia_e_kutise = 400;
    int rrezja_e_topit = 10;
    Kuti kutia = new Kuti(madhesia_e_kutise);
    TopLevizes topi1 = new TopLevizes((int)(madhesia_e_kutise / 2.0),
            (int)(madhesia_e_kutise / 5.0),
            rrezja_e_topit, kutia);
    TopLevizes topi2 = new TopLevizes((int)(madhesia_e_kutise / 5.0),
            (int)(madhesia_e_kutise / 2.0),
            rrezja_e_topit, kutia);
// konstrukto objektet e pamjes dalese:
    VizatuesTopi vizatuesi_i_topit1 = new VizatuesTopi(topi1, Color.red);
    VizatuesKutie vizatuesi_i_kutise = new VizatuesKutie(kutia);
    VizatuesTopi vizatuesi_i_topit2 = new VizatuesTopi(topi2, Color.blue);
    VizatuesAnimacioni2 vizatuesi
            = new VizatuesAnimacioni2(vizatuesi_i_kutise,
            vizatuesi_i_topit1, vizatuesi_i_topit2,
            madhesia_e_kutise);
// konstruktoje kontrolluesin dhe nise:
    new GjuajtjeKontrollues2(topi1, topi2, vizatuesi).niseAnimacionin();
}
}