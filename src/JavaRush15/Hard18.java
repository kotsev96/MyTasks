package JavaRush15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Planet {
    static String SUN = "sun";
    static String MOON = "moon";
    static String EARTH = "earth";
}
public class Hard18 {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if(s.equals(Planet.SUN)) thePlanet = Sun.getInstance();
        else if(s.equals(Planet.MOON)) thePlanet = Moon.getInstance();
        else if(s.equals(Planet.EARTH)) thePlanet = Earth.getInstance();
        else thePlanet = null;
    }
}

class Earth implements Planet{
    private static Earth instance;
    private Earth(){}
    public static Earth getInstance(){ // #3
        if(instance == null){		//если объект еще не создан
            instance = new Earth();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}

class Sun implements Planet{
    private static Sun instance;
    private Sun(){}
    public static Sun getInstance(){ // #3
        if(instance == null){		//если объект еще не создан
            instance = new Sun();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}

class Moon implements Planet{
    private static Moon instance;
    private Moon(){}
    public static Moon getInstance(){ // #3
        if(instance == null){		//если объект еще не создан
            instance = new Moon();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}
