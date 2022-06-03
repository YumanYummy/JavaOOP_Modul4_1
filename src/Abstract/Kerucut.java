package Abstract;


public class Kerucut extends Bangunruang{
    double LuasPermukaan;
    double Volume;
    int R , S, T;

    public void setR(int R){
        this.R = R;
    }

    public void setS(int S){
        this.S = S;
    }

    public void setT(int T){
        this.T = T;
    }
    void getLuasPermukaan(){
        LuasPermukaan = (3.14*R*R)+(3.14*R*S);
        System.out.println("Luas Kerucut Permukaan Adalah: " +LuasPermukaan);
    }

    void getVolume(){
        Volume = (3.14*R*R*T*1/3);
        System.out.println("Volume Kerucut Adalah: " +Volume);
    }

}
