package oop3;

public class PtinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer(50, true);
		System.out.println("Initial Page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + printer.getPagesPrinted());
		
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + printer.getPagesPrinted());
		System.out.println("-----------------------");
		
		Printer printer2 = new Printer(50,false);
		pagesPrinted = printer2.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + printer2.getPagesPrinted());
		pagesPrinted = printer2.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + printer2.getPagesPrinted());

	}

}
