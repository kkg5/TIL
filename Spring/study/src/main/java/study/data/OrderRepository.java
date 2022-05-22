package study.data;

import study.Order;

public interface OrderRepository {
    Order save(Order order);
}
