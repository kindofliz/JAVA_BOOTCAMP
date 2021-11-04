import { Component, OnInit } from '@angular/core';
import { EcommerceServiceService } from '../ecommerce-service.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  constructor(private ecommerceService: EcommerceServiceService) { }

  ngOnInit(): void {

    this.ecommerceService.getAllProducts()
    .subscribe((products) => {
      console.log(products);
    })
  }

}
