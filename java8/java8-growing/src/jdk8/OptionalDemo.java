import java.util.Optional;

/**
 * Optional
 *
 * @author: Gao HangHang
 * @date 2018/10/05
 */
public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println("Full Name is set? " + fullName.isPresent());
        System.out.println("Full Name: " + fullName.orElse("[none]"));
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));

        Optional<String> firstName = Optional.of("Tom");
        System.out.println("First Name is set? " + firstName.isPresent());
        System.out.println("First Name: " + firstName.orElseGet(() -> "[none]"));
        System.out.println(firstName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
        System.out.println();

    }

}
