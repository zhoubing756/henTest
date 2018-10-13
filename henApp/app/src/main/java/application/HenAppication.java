package application;

import android.app.Application;

public class HenAppication extends Application {

    private HenAppication(){

    }

    private static class Holder{
        private static  HenAppication instance = new HenAppication();

    }

    public static HenAppication getIntance(){
        return  Holder.instance;

    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
