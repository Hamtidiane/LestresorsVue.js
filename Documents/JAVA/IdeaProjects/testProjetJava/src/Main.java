public class Main {
    public static void main(String[] args) {
        int nbTtlCar = 34;
        int nbTtlTruck = 9;
        int nbTtlVoy = nbTtlCar / nbTtlTruck;
        for (int i = 0; i <= nbTtlVoy; i++) {
            int carTrans = Math.min(nbTtlTruck, nbTtlCar);
            nbTtlCar -= carTrans;
            System.out.println(" un voyage de " +carTrans+ " cartons ");
            }
        }

    }



