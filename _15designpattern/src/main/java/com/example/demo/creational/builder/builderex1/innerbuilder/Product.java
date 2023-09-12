package com.example.demo.creational.builder.builderex1.innerbuilder;

public class Product {
    private String part1;
    private String part2;

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                '}';
    }

    public static class Builder
    {
        private String part1;
        private String part2;

        public Builder withPart1(String part1) {
            this.part1 = part1;
            return this; // Mengembalikan builder itu sendiri
        }

        public Builder withPart2(String part2) {
            this.part2 = part2;
            return this; // Mengembalikan builder itu sendiri
        }

        public Product build() {
            Product product = new Product();
            product.part1 = this.part1;
            product.part2 = this.part2;
            return product;
        }

    }
}
