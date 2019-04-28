package java知识.effctive_java_3.a2;

import java.util.Objects;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @create: 2019/04/28 15:11
 */
public class NyPizza extends Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    // 构造函数
    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
