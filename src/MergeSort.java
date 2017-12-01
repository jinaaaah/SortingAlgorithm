
import java.util.List;

class MergeSort extends Sort {

    private int[] temp;

    public MergeSort(List<Bar> bars) {
        super(bars);
        temp = new int[bars.size()];
    }

    @Override
    public void run() {
        try {
            sort(0, bars.size() - 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void sort(int lowerIndex, int higherIndex) throws InterruptedException {
        if (lowerIndex < higherIndex) {

            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            sort(lowerIndex, middle);

            sort(middle + 1, higherIndex);

            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) throws InterruptedException {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            temp[i] = bars.get(i).getY();
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (temp[i] <= temp[j]) {
                bars.get(k).setY(temp[i]);
                i++;
            } else {
                bars.get(k).setY(temp[j]);
                j++;
            }
            k++;
            sleep(2);

        }
        while (i <= middle) {
            bars.get(k).setY(temp[i]);
            k++;
            i++;

        }

    }

}
