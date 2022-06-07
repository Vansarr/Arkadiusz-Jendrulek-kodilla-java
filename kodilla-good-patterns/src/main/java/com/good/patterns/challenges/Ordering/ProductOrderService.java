package com.good.patterns.challenges.Ordering;

public class ProductOrderService {

    private InformationService informationService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        informationService.informBuyer(orderRequest.getBuyer());

        orderRepository.saveOrder(orderRequest.getBuyer(), orderRequest.getSeller(),
                orderRequest.getOrderedProducts(), orderRequest.getOrderPrice());

        return new OrderDto(orderRequest.getBuyer(),orderRequest.getSeller(),
                orderRequest.getOrderedProducts(), orderRequest.getOrderPrice());
    }
}
