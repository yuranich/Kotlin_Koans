// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = this.customers
        .partition { it.orders.count { o -> !o.isDelivered } > it.orders.count {o -> o.isDelivered} }
        .first.toSet()
