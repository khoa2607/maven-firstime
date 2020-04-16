package com.khoa;



import io.silverspoon.bulldog.beagleboneblack.BBBNames;
import io.silverspoon.bulldog.core.gpio.DigitalOutput;
import io.silverspoon.bulldog.core.platform.Board;
import io.silverspoon.bulldog.core.platform.Platform;
import io.silverspoon.bulldog.core.util.BulldogUtil;

public class Main {

	public static void main(String [] args) 
	{
		
		System.out.println("Hello world");
		//Detect the board we are running on
	    Board board = Platform.createBoard();
	    
	    //Set up a digital output
	    DigitalOutput output = board.getPin(BBBNames.P8_12).as(DigitalOutput.class);

	    // Blink the LED
	    output.high();
	    BulldogUtil.sleepMs(1000);
	    output.low();
	    }
		
}

