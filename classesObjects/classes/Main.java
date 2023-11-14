package classesObjects.classes;

import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(10, 1, 1, 2);
        System.out.println("before modification" + mountainBike.toString());


        modifyReferenceValue(mountainBike);
        System.out.println("after modification" + mountainBike.toString());
    }

    public static void modifyReferenceValue(MountainBike mountainBike){
        mountainBike.setHeight(15);
    }
}


/*
* - i think that it is not good to modify object field inside method, code can be dificul to debug
*
* */