import singletone.SingleToneSample;

import java.util.logging.Logger;

/**
 * Created by Flop Coder on 7/8/14.
 */
public class Main {
    static Logger log = Logger.getLogger(
            Main.class.getName());
    public static void main(String[] args) {

        SingleToneSample singleToneSample = SingleToneSample.getSingleToneSample();
        SingleToneSample ex2 = SingleToneSample.getSingleToneSample();

       log.info("Here Log Example");
    }
}
