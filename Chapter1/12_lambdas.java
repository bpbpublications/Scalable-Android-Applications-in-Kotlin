import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Lambdas12 {

    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> evenNums = nums.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
}
