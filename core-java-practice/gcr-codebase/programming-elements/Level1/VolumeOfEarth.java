package Level1;
public class VolumeOfEarth {
    public static void main(String[] args){
        int radiusOfEarth=6378;
        float radiusOfEarthInMiles=6378*.63f;
        System.out.println("The Volume of earth in Cubic Kilometers is "+((4/3)*3.14*radiusOfEarth*radiusOfEarth*radiusOfEarth)+"and in Cubic Miles is "+((4/3)*3.14*radiusOfEarthInMiles*radiusOfEarthInMiles*radiusOfEarthInMiles));
    }
    
}
