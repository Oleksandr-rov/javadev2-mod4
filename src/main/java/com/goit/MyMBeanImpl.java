package com.goit;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class MyMBeanImpl implements MyMBean {
    private static final Logger logger = Logger.getLogger(MyMBeanImpl.class);

    @Override
    public void setIsLoger(boolean isLoger) {
        IsLoger.getInstance().setValue(isLoger);
        if (isLoger){
            LogManager.getRootLogger().setLevel(Level.DEBUG);
            logger.debug("Логування увімкнено!");
        }
        else {
            LogManager.getRootLogger().setLevel(Level.OFF);
            logger.log(logger.getChainedPriority(),"Логування вимкнено!");
        }
    }

    @Override
    public boolean getIsLoger() {
        logger.trace("request value");
        return IsLoger.getInstance().getValue();
    }

    @Override
    public void changeLogLevelInfo() {
        LogManager.getRootLogger().setLevel(Level.INFO);
        logger.info("Рівень логування змінено на info");
    }

    @Override
    public void changeLogLevelDebug() {
        LogManager.getRootLogger().setLevel(Level.DEBUG);
        logger.debug("Рівень логування змінено на debug");
    }

    public static void inputString() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            logger.info("Введіть текст або натисніть Enter для завершення:");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                logger.info("Ви натиснули Enter. Вихід з програми.");
                break;
            } else {
                logger.debug("Вхідний рядок: " + input);
                logger.debug("Змінений рядок: " + TextConversion.conversionText(input));
            }
        }
        scanner.close();
    }
}