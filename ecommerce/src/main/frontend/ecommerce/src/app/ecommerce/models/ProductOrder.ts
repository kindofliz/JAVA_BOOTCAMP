import { Product } from "./Product";

export class ProductOrder {
    product: Product;
    quantity = 0;

    // all arguments constructor
    constructor(product: Product, quantity: number) {
        this.product = product;
    }
}
