package com.goit;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class App {
    private static MBeanServer madeMBeanServer() throws NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, MalformedObjectNameException {
        // Створення MBean сервера
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        // Створення об'єкта MBean
        StandardMBean mbean = new StandardMBean(new MyMBeanImpl(), MyMBean.class);

        //Створення ObjectName для реєстрації MBean
        ObjectName mbeanName = new ObjectName("com.goit:type=MyMBean");

        // Реєстрація MBean в MBean-сервері
        mbs.registerMBean(mbean, mbeanName);
        return mbs;
    }

    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        madeMBeanServer();
        MyMBeanImpl.inputString();
    }

}

