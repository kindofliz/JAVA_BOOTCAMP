export class Product {
    id: number;
    name: string;
    price: number;
    pictureUrl: string;

    // all arguments constructor
    constructor(id: number, name: string, price: number, pictureUrl: string){
        this.id = id;
        this.name = name;
        this.price = price;
        this.pictureUrl  = pictureUrl;

    }
}
