public class CigarParty {
    public static void main(String[] args) {
        CigarParty p = new CigarParty();
        System.out.println(p.cigarParty(30, false));
        System.out.println(p.cigarParty(50, false));
        System.out.println(p.cigarParty(70, true));
        System.out.println(p.cigarParty(30, true));
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }
}
