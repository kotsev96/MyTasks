package JavaRush17;

public class Med5 {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    }
}

class OurPresident {

    private static OurPresident president;

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
    static{
        synchronized (OurPresident.class) {
            president = new OurPresident();
        }
    }
}
