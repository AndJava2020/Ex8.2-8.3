package ru.AndJava2020.Ex823;

public class ThreadAnimation implements Runnable {
    private Window mainWindow;
    private String []cmdArgs;
    private static int counter=0;

    ThreadAnimation(String []args){
        cmdArgs=args;

        mainWindow=new Window(args[0]);
        while (true)
            run();


    }


    @Override
    public void run() {

        try {
            Thread.sleep(1000);
            counter=(counter+1)%cmdArgs.length;
            mainWindow.selectPicture(cmdArgs[counter]);
            mainWindow.paint(mainWindow.getGraphics());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
