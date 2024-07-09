package Topic6;

public class temperatureAverage {

	    public static void main(String[] args) {
	        // Zweidimensionales Array mit täglichen Temperaturen für 3 Städte (7 Tage)
	        double[][] temperatures = {
	            {20.5, 22.3, 19.8, 21.0, 23.1, 20.4, 18.7}, // Stadt 1
	            {15.5, 17.2, 16.3, 14.8, 15.7, 16.0, 14.9}, // Stadt 2
	            {25.5, 24.1, 26.3, 27.2, 23.8, 24.9, 25.0}  // Stadt 3
	        };

	        // Array für die durchschnittlichen Temperaturen
	        double[] averageTemperatures = new double[temperatures.length];

	        // Berechnung der durchschnittlichen Temperaturen für jede Stadt
	        for (int city = 0; city < temperatures.length; city++) {
	            double sum = 0;
	            for (int day = 0; day < temperatures[city].length; day++) {
	                sum += temperatures[city][day];
	            }
	            averageTemperatures[city] = sum / temperatures[city].length;
	        }

	        // Ausgabe der durchschnittlichen Temperaturen für jede Stadt
	        for (int city = 0; city < averageTemperatures.length; city++) {
	            System.out.printf("Durchschnittliche Temperatur für Stadt %d: %.2f°C%n", city + 1, averageTemperatures[city]);
	        }
	    }
	}