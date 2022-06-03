package Abstract;

public class Bola1{
    double LuasPermukaan;
    double Volume;
    int R;

    public void setR(int R){
        this.R = R;
    }

    void getLuasPermukaan(){
        LuasPermukaan = (4*3.14*R*R);
        System.out.println("Luas Permukaan Bola Adalah: " +LuasPermukaan);
    }

    void getVolume(){
        Volume = (3.14*R*R*R*4/3);
        System.out.println("Volume Bola Adalah: " +Volume);
    }
}
