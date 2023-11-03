package lotto;

import java.util.Arrays;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
    public List<Integer> getNumbers() {
        return numbers;
    }

    public void printLottoList(List<Integer> numbers) {
        int[] num = new int[numbers.size()];
        for (int i = 0; i < num.length; i++) {
            num[i] = numbers.get(i);
        }
        System.out.println(Arrays.toString(num));
    }
}
