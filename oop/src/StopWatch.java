public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();
        for (int i = 0; i < 100000; i++) {
            for (int j = i + 1; j < 100000; j++) {
                for (int k = i + 1; k < 100000; k++) {
                    //code
                }
            }
        }
        sw.stop();
        System.out.printf("Thời gian thực thi của thuật toán sắp xếp là: %d ms", sw.getElapsedTime());
    }
}
