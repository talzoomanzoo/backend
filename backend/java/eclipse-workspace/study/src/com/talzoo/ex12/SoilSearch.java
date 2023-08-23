package com.talzoo.ex12;

public class SoilSearch {
    
	
	public static void main(String[] args) {
		String [] elements = getElements(args[0]);

		printElement(elements);

		double[][] samples = getSamples(args[1]);

		printSamples(samples);
	}


	public static String[] getElements(String inputElementString) {
		String [] element = inputElementString.split(",");
		return element;
		}


	public static double[][] getSamples(String inputElementString) {
		
		String [] sample_group1 = new String[5];
		/* String [] sample_group2 = new String[6]; */
		double [] sample_group3 = new double[30];
		System.out.println(sample_group1.length);
		System.out.println(sample_group3.length);

		for (int i= 0; i <sample_group1.length; i++ ) {
			sample_group1[i] = inputElementString.split("<>")[i];
				for (int j=0; j < sample_group1[i].split(",").length; j++) {
					System.out.println("==================");
					System.out.println(i+":" +j);
					sample_group3[6*i+j] = Double.parseDouble(sample_group1[i].split(",")[j]);
				}
		}

		double [][] sample_group4 = new double[5][6];
		System.out.println(sample_group4.length);

				int k=0;
				for (int i = 0; i < sample_group4.length; i++) {
					for (int j =0; j < sample_group4[0].length; j++) {
							sample_group4[i][j] = sample_group3[k];
						k++;
					}
				}
		return sample_group4;
	}

	public static void printElement(String[] array) {
		for (String element : array) {
			System.out.print(element + " ");
		}
	}

	public static void printSamples(double[][] array) {
		for (double[] element : array) {
			for (double element_final : element) {
				System.out.println(element_final);
			}
		}
	}
}

