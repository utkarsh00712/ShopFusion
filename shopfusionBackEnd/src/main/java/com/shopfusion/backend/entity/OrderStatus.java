package com.shopfusion.backend.entity;

public enum OrderStatus {
    PENDING,
    CONFIRMED,
    PROCESSING,
    SHIPPED,
    OUT_FOR_DELIVERY,
    DELIVERED,
    SUCCESS,
    CANCELLED,
    RETURN_REQUESTED,
    RETURN_APPROVED,
    REFUNDED,
    FAILED
}
