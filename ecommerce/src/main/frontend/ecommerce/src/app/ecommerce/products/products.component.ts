import { Component, OnInit } from '@angular/core';
import { EcommerceServiceService } from '../ecommerce-service.service';
import { Product } from '../models/Product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

products!: Array<Product>;

  constructor(private ecommerceService: EcommerceServiceService) { }

  ngOnInit(): void {

    this.ecommerceService.getAllProducts()
    .subscribe((products) => {
      console.log(products);
      this.products = products;
    })
  }

}
