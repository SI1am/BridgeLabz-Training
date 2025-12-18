package Level1;
public class VolumeOfEarth {
    public static void main(String[] args){
        int radi=6378;
        float radim=6378*1.6f;
        System.out.println("The Volume of earth in Cubic Kilometers is "+((4/3)*3.14*radi*radi*radi)+"and in Cubic Miles is "+((4/3)*3.14*radim*radim*radim));
    }
    
}
