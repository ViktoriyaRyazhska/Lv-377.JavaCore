package HomeworkArrayLoops;

import java.util.Scanner;

public class HWArrayLoops {
/////Task1
	private int[] mounth = new int[12];

	public int[] getMounth() {
		return mounth;
	}

	public void setMounth(int[] mounth) {
		this.mounth = mounth;
	}

	public HWArrayLoops() {
		calculateDay(mounth);
	}

	public HWArrayLoops(int mounthNumber) {
		calculateDay(mounth);
		outputQuantityDay(mounthNumber);
	}

	public void calculateDay(int[] mounth) {
		this.mounth = mounth;
		for (int i = 0; i < mounth.length; i++) {
			if (i < 7) {
				if (i == 1) {
					this.mounth[i] = 28;
					continue;
				}
				if (i % 2 == 0 || i == 0)
					this.mounth[i] = 31;
				else
					this.mounth[i] = 30;
			}
			if (i >= 7) {
				if (i % 2 == 0)
					this.mounth[i] = 30;
				else
					this.mounth[i] = 31;
			}
		}
	}

	public void outputQuantityDay(int mounthNumber) {
		System.out.println("Mounth: " + mounthNumber + " have: " + mounth[mounthNumber - 1] + " days!");

	}

////////Task2
	public int lenghtArrayNumber;
	private int[] numbers = new int[lenghtArrayNumber];

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public void inputNumbers(int lenghtArrayNumber, Scanner sc) {
		this.lenghtArrayNumber = lenghtArrayNumber;
		int[] numbers = new int[lenghtArrayNumber];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			setNumbers(numbers);
		}
	}

	public void outputNumber() {
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= 0 && i < (numbers.length / 2)) {
				result = result + numbers[i];
			} else if (numbers[i] < 0) {
				i = numbers.length / 2;
				result = 1;
			}
			if ((numbers.length / 2) == i) {
				if (result > 1) {
					break;
				}
			}
			if (i >= numbers.length / 2) {
				result = result * numbers[i];
			}
		}
		System.out.println("Result final:" + result);
	}
////////Task3
	public int lenghtArFind;
	private int[] number = new int[lenghtArrayNumber];

	public int[] getNumber() {
		return number;
	}

	public void setNumber(int[] number) {
		this.number = number;
	}
	public void inputFindNumber(int lenghtArFind, Scanner sc) {
		this.lenghtArFind = lenghtArFind;
		int[] number = new int[lenghtArFind];
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
			setNumber(number);
		}
	}
	
	public void find() {
		int temp;
		int calc=0;
		int min=number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i]>=0) {
				calc++;
				temp=i;
				if (calc == 2) {
					System.out.println("Second positive number in array : position: "+temp);
					break;
				}
			}
		}
		for (int i = 1; i < number.length; i++) {
			if (number[i]<min) {
				min=number[i];
				calc = i;
			}
		}
		System.out.println("Min number in array: "+min+" ,position: "+calc);
		}

}
