// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val products = this.customers.flatMap { it.orders.flatMap { o -> o.products } }.toSet()
    return products.fold(emptySet(), { acc: Set<Product>, product ->
        if (this.customers.all { product in it.orders.flatMap { o -> o.products } }) acc + product else acc })
}
