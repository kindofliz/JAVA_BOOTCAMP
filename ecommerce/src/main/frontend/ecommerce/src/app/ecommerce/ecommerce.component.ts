import { Component, OnInit, ViewChild } from '@angular/core';
import { OrdersComponent } from './orders/orders.component';
import { ProductsComponent } from './products/products.component';
import { ShoppingCartComponent } from './shopping-cart/shopping-cart.component';

@Component({
    selector: 'app-ecommerce',
    templateUrl: './ecommerce.component.html',
    styleUrls: ['./ecommerce.component.css']
})
export class EcommerceComponent implements OnInit {
    public collapsed = true;
    orderFinished = false;

    ngOnInit() {
    }

    @ViewChild('productsC')
    productsC!: ProductsComponent;

    @ViewChild('shoppingCartC')
    shoppingCartC!: ShoppingCartComponent;

    @ViewChild('ordersC')
    ordersC!: OrdersComponent;

    toggleCollapsed(): void {
        this.collapsed = !this.collapsed;
    }

    finishOrder(orderFinished: any) {
        this.orderFinished = orderFinished;
    }

    reset() {
        this.orderFinished = false;
        this.productsC.reset();
        this.shoppingCartC.reset();
        this.ordersC.paid = false;
    }
}
