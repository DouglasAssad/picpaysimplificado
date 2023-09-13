package com.picpaydesafio.dtos;

import java.math.BigDecimal;

public record TransactioDTO(BigDecimal value, Long senderId, Long receiverId) {
}
