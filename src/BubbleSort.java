import java.util.List;

class BubbleSort extends Sort {

    public BubbleSort(List<Bar> bars) {
        super(bars);
    }

    @Override
    public void run() {
        for (int j = bars.size(); j >= 0; j--) {
            for (int i = 0; i < bars.size() - 1; i++) {
                try {
                    sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (bars.get(i).getY() > bars.get(i + 1).getY()) {
                    swap(i + 1, i);
                }
            }
        }

    }
}
