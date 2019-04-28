package java知识.effctive_java_3.a2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @create: 2019/04/28 14:37
 */

// Builder patern for class hierarchies
public abstract class Pizza {

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE} // HAM，蘑菇，洋葱，胡椒，香肠
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // Subclasses must override this method to return "this" 子类必须重写此方法才能返回“this”
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); // See Item 50
    }
}
