package JavaRush15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface CanFly {
    void fly();
}

class Plane implements CanFly{
    public Plane(int x) {
    }
    public void fly(){

    }
}


class Helicopter implements CanFly{
    public void fly(){

    }
}

public class Med11 {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if(s.equals("helicopter")){
            result = new Helicopter();
        }
        if(s.equals("plane")){
            int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            result = new Plane(a);
        }
        reader.close();
    }
}
