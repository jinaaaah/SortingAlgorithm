import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program extends PApplet {
    private List<Bar> bBars;
    private List<Bar> qBars;
    private List<Bar> sBars;
    private List<Bar> mBars;

    private void initBar(int num) {

        int barSize = 480 / num;
        Random random = new Random();

        bBars = new ArrayList<>();
        qBars = new ArrayList<>();
        sBars = new ArrayList<>();
        mBars = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            bBars.add(new Bar(this, i * barSize, random.nextInt(300), barSize, 20));
            qBars.add(new Bar(this, i * barSize + 480, random.nextInt(300), barSize, 20));
            sBars.add(new Bar(this, i * barSize, random.nextInt(300), barSize, 360));
            mBars.add(new Bar(this, i * barSize + 480, random.nextInt(300), barSize, 360));
        }
    }

    @Override
    public void settings() {
        size(960, 640);
        initBar(240);

        BubbleSort bubbleSort = new BubbleSort(bBars);
        bubbleSort.start();

        MergeSort mergeSort = new MergeSort(mBars);
        mergeSort.start();

        SelectionSort selectionSort = new SelectionSort(sBars);
        selectionSort.start();

        QuickSort quickSort = new QuickSort(qBars);
        quickSort.start();

    }


    @Override
    public void draw() {
        background(0);

        text("Bubble Sort", 400, 20);
        text("Quick Sort", 880, 20);
        text("Selection Sort", 380, 340);
        text("Merge Sort", 880, 340);

        for (Bar bar : bBars) {
            bar.draw();
        }

        for (Bar bar : qBars) {
            bar.draw();
        }
        for (Bar bar : sBars) {
            bar.draw();
        }
        for (Bar bar : mBars) {
            bar.draw();
        }

    }

    @Override
    public void setup() {
        background(0);
    }

    public static void main(String[] args) {
        PApplet.main("Program");
    }
}
