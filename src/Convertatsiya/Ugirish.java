package Convertatsiya;

public class Ugirish implements BaseConverter {
    @Override
    public double selsiy() {
        return 10;
    }

    public void selsiyKelvin(){
        double kelvin;
        kelvin = selsiy() + 273.15;
        System.out.println(selsiy() + " selsiy " + kelvin + " kelvin bo'ladi");
    }
    public void selsiyFarengeyt(){
        double Farengeyt ;
        Farengeyt  = (9.0 / 5.0) * selsiy() + 32;
        System.out.println(selsiy() + " selsiy " + Farengeyt  + " Farengeyt bo'ladi");
    }
}
