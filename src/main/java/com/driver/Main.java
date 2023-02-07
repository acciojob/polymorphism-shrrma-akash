package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y){
            int c= x*y;
            return c;
        }
        public int product(int x, int y, int z){
            int c= x*y*z;
            return c;
        }
        public double product(double x, double y){
            double c= x*y;
            return c;
        }
    }
    public static void main(String[] args) {
        Product p= new Product();

        p.product(1, 2);
        p.product(1, 2, 3);
        p.product(1.5, 2.6);

    }

}