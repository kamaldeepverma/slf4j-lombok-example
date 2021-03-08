package org.sl4j.lombok;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@Slf4j
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        log.info("Hello from logger info level");
        log.debug("Hello from logger debug level");
        log.trace("Hello from logger trace level");

    }
}
