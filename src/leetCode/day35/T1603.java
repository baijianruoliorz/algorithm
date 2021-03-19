package leetCode.day35;

/**
 * @author liqiqi_tql
 * @date 2021/3/19 -8:53
 */
public class T1603 {
    class ParkingSystem {
        int big;
        int medium;
        int small;
        public ParkingSystem(int big, int medium, int small) {
            this.big=big;
            this.medium=medium;
            this.small=small;
        }

        public boolean addCar(int carType){
            if (carType==3){
                this.big--;
                if (this.big<0){
                    return false;
                }else {
                    return true;
                }
            }
            if (carType==2){
                this.medium--;
                if (medium<0){
                    return false;
                }else {
                    return true;
                }
            }
            if (carType==1) {
                this.small--;
                if (small < 0) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
