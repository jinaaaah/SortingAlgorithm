import java.util.List;

class QuickSort extends Sort {

    public QuickSort(List<Bar> bars) {
        super(bars);
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

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = bars.get(lowerIndex + (higherIndex - lowerIndex) / 2).getY();

        while (i <= j) {
            while (bars.get(i).getY() < pivot) {
                i++;
                sleep(2);
            }
            while (bars.get(j).getY() > pivot) {
                j--;
                sleep(2);
            }
            if (i <= j) {
                swap(i, j);

                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            sort(lowerIndex, j);
        if (i < higherIndex)
            sort(i, higherIndex);
    }
}
