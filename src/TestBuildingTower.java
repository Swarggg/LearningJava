public class TestBuildingTower {
    public static void main(String[] args) {
        BuildingTower tower1 =new BuildingTower();

        for (int i=5;i<125; i=i+20) {
            tower1.towerHeiht=i;
            System.out.println("Heihgt "+tower1.towerHeiht);
            tower1.buildTower();
            System.out.println();
        }


        /*
        tower1.towerHeiht = 120;


        tower1.towerHeiht=80;
        System.out.println("Heihgt "+tower1.towerHeiht);
        tower1.buildTower();

        tower1.towerHeiht=30;
        System.out.println("Heihgt "+tower1.towerHeiht);
        tower1.buildTower();

        tower1.towerHeiht=10;
        System.out.println("Heihgt "+tower1.towerHeiht);
        tower1.buildTower();

         */
    }
}
