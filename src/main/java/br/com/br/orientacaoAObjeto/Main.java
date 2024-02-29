package br.com.br.orientacaoAObjeto;

public class Main {
    public static void main(String[] args) {
        Product p2 = new Product();
        p2.name = "Cream";
        p2.price = 50;
        p2.discount = 0.10;

        Product p3 = new Product("Clock", 150, 0.10);
        System.out.println(p3.returnResumeProduct());

        System.out.println("----------");
        System.out.println("Cream with discount: " + p2.calculatingDiscount());
        System.out.println("Cream with addicional discount: " + p2.calculatingDiscount(0.10));
        System.out.println("Cream with additional discount and promotion: " + p2.calculatingDiscount(0.10, 0.10));


//        Product product = new Product(); //instantiating the object
//        product.name = "Notebook"; //declaring the attributes
//        product.price = 5000;
//        product.discount = 0.10;
//
//        Product p1 = new Product();
//        p1.name = "Shampoo";
//        p1.price = 20;
//        p1.discount = 0.25;
//
//        System.out.println(product.returnResumeProduct());
//
//        product.showNameProduct(); //don't need sout because the method already have a print, and it's a void

    }
}