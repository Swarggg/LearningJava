public class BuildingTower {
    int towerHeiht;

    void buildTower () {
        if (towerHeiht>100){
            System.out.println("Tower will building 2 years");
        } else if(towerHeiht>50) {
            System.out.println("Tower will building 1,5 years");
        } else if (towerHeiht>20) {
            System.out.println("Tower will building 1 year");
        } else if (towerHeiht>0) {
            System.out.println("Tower will building near 1 year");
        }
    }
}

