package ro.tatacalu.rxjava.demo;

import io.reactivex.Flowable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application entry point.
 */
public class RxJavaDemoMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(RxJavaDemoMain.class);

    public  static void main(String[] args) {
        Flowable.just("RxJava Demo - Hello world!").subscribe(LOGGER::info);
    }
}
