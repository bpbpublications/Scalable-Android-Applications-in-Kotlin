import java.util.ArrayList;
import java.util.List;

class ErasedType52 {

    void untransformed() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        String value = list.get(0);
    }

    void transformed() {
        List list = new ArrayList();
        list.add("Hello");
        String value = (String) list.get(0);
    }
}
