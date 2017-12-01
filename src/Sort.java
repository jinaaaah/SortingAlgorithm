import java.util.List;

class Sort extends Thread {

    protected List<Bar> bars;

    public Sort(List<Bar> bars) {
        this.bars = bars;
    }

    protected void swap(int i, int j) {
        int tmp = bars.get(i).getY();
        bars.get(i).setY(bars.get(j).getY());
        bars.get(j).setY(tmp);
    }

}
