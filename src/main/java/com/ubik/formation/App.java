package com.ubik.formation;

import com.ubik.formation.creational.singleton.tp.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration config = Configuration.getInstance();

        System.out.println(config.getSetting("SQL_LOGIN"));
    }
}
