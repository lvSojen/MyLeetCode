// Link
// https://leetcode.com/submissions/detail/715869808/
class ParkingSystem {
    int big;
    int medium;
    int small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium =medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1) {
            this.big -= 1;
            return this.big >=0;
        } else if(carType == 2) {
            this.medium -= 1;
            return this.medium >=0;
        } else if(carType == 3) {
            this.small -= 1;
            return this.small >=0;
        }
        return false;
    }
}
// Alternative
class ParkingSystem {
    int big , medium , small;
    public ParkingSystem(int big, int medium, int small) {
        this.big =big;
        this.medium = medium;
        this.small = small;

    }

    public boolean addCar(int carType) {
        if(carType == 1)
           {
               if(big == 0)
               {
                   return false;
               }
            big--;
           }
        else if(carType == 2)
        {
            if(medium == 0)
            {
                return false;
            }
            medium--;
        }
        else if(carType == 3)
        {
            if(small == 0)
            {
                return false;
            }
            small--;
        }
        return true;
    }
}