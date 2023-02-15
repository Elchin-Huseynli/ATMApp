package atmApp.util;
import static atmApp.util.InputUtil.inputTypeInt;
public class MenuUtil {
    public static int entry() {
        System.out.println(
                "\n[1] Cashing out (Nəğdləşdirmə)" +
                "\n[2] Exit \n"
        );
        return inputTypeInt("Option: ");
    }
}
