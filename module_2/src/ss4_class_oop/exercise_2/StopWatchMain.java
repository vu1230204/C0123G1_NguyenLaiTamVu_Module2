package ss4_class_oop.exercise_2;


public class StopWatchMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        StopWatch stopWatch = new StopWatch(startTime, endTime);
        System.out.println("Start time:" + stopWatch.getStartTime());
        stopWatch.start();
        for (int i = 0; i < 100000; i++) {
            System.out.println("C0123G1");
        }
        stopWatch.stop();
        System.out.println("End time:" + stopWatch.getEndTime());
        System.out.println("Time to run:" + stopWatch.getElapsedTime());


    }


}
