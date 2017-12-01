import java.util.List;

public class SelectionSort extends Sort {

    public SelectionSort(List<Bar> bars) {
        super(bars);
    }

    @Override
    public void run() {
        for (int i = 0; i < bars.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < bars.size(); j++) {
                try {
                    sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (bars.get(j).getY() < bars.get(index).getY()) {
                    index = j;
                }

            }

            swap(index, i);

        }


    }

}
