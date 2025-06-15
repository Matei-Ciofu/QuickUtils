package com.ciofu.quickutils;

import java.util.Random;

public class RandomNumbers {
   private static Random random = new Random();
	
	public static int randomInt(int min, int max)
	{
		 int range = max + 1 - min;
		 int casual = random.nextInt(range);
		 return casual + min;
	}
	
	public static double randomDouble(double min, double max)
	{
	 double range = max - min;
	 double casual = random.nextDouble();
	 
	 double posEstratto = range*casual;
	 
	 return posEstratto + min;
	} 
}

