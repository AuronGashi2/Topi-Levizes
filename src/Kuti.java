/** Kuti e modelon nje kuti ne te cilen jetojne objektet levizese */
public class Kuti
{ private int madhesia_e_kutise;
    /** Konstruktori Kuti e nderton kutine
     * param madhesia - madhesia e kutise */
    public Kuti(int madhesia)
    { madhesia_e_kutise = madhesia; }
    /** neKontaktHorizontal pergjigjjet:
     * a ka kontaktuar pozita momentale ndonje mur horizontal?
     * @param x_pozita - pozita qe testohet
     * @return (kthen) true, nese x_pozita eshte baraz ose i kalon pozitat
     * e mureve horizontale; perndryshe return (kthen) false */
    public boolean neKontaktHorizontal(int x_pozita)
    { return ( x_pozita <= 0 ) || (x_pozita >= madhesia_e_kutise); }
    /** neKontaktVertikal pergjigjet: a ka kontaktuar pozita ndonje mur vertikal
     * @param y_pozita - pozita e testuar
     * return (kthen) true, nese y_pozita eshte baraz ose i tejkalon pozitat
     * e mureve vertikale; perndryshe, return (kthen) false */
    public boolean neKontaktVertikal(int y_pozita)
    { return (y_pozita <= 0) || (y_pozita >= madhesia_e_kutise); }
    /** madhesiaE e kthen madhesine e kutise */
    public int madhesiaE()
    { return madhesia_e_kutise; }
}