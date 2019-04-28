package java知识.effctive_java_3.a2;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @create: 2019/04/28 18:46
 */
public class Calzone extends Pizza {
    private final boolean sauceInside; // 酱

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; // Default

        public Builder sauceInside() {
            sauceInside  = true;
            return this;
        }


        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
