package JavaRush11_12_13_14;

interface Country {
    String UKRAINE = "Ukraine";
    String RUSSIA = "Russia";
    String MOLDOVA = "Moldova";
    String BELARUS = "Belarus";
}

class Med15 {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if(country.equals(Country.RUSSIA)){
                hen = new RussianHen();
            }
            if(country.equals(Country.UKRAINE)){
                hen = new UkrainianHen();
            }
            if(country.equals(Country.MOLDOVA)){
                hen = new MoldovanHen();
            }
            if(country.equals(Country.BELARUS)){
                hen = new BelorusianHen();
            }
            return hen;
        }
    }


}
abstract class Hen {
    abstract int getCountOfEggsPerMonth();
    public String getDescription(){
        return "Я - курица.";
    }
}
class RussianHen extends Hen{
    int getCountOfEggsPerMonth() {
        return 21;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна " + Country.RUSSIA + " Я несу " + this.getCountOfEggsPerMonth() + " в месяц";
    }
}

class UkrainianHen extends Hen{
    int getCountOfEggsPerMonth() {
        return 32;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна " + Country.UKRAINE + " Я несу " + this.getCountOfEggsPerMonth() + " в месяц";
    }
}

class MoldovanHen extends Hen{
    int getCountOfEggsPerMonth() {
        return 12;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна " + Country.MOLDOVA + " Я несу " + this.getCountOfEggsPerMonth() + " в месяц";
    }
}

class BelorusianHen extends Hen{
    int getCountOfEggsPerMonth() {
        return 55;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна " + Country.BELARUS + " Я несу " + this.getCountOfEggsPerMonth() + " в месяц";
    }
}
