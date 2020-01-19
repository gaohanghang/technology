package java知识.公众号.JavaGuide.a2020.a1_16;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-01-18 01:39
 **/
public class Pizza {

    private PizzaStatus status;
    public enum PizzaStatus {
        ORDERED (5){
            @Override
            public boolean isOrdered() {
                return true;
            }
        },
        READY (2){
            @Override
            public boolean isReady() {
                return true;
            }
        },
        DELIVERED (0){
            @Override
            public boolean isDelivered() {
                return true;
            }
        };

        private int timeToDelivery;

        public boolean isOrdered() {return false;}

        public boolean isReady() {return false;}

        public boolean isDelivered(){return false;}

        public int getTimeToDelivery() {
            return timeToDelivery;
        }

        PizzaStatus (int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }
    }

    public boolean isDeliverable() {
        return this.status.isReady();
    }

    //public void printTimeToDeliver() {
    //    System.out.println("Time to delivery is " +
    //            this.getStatus().getTimeToDelivery());
    //}

    // Methods that set and get the status variable.

}
