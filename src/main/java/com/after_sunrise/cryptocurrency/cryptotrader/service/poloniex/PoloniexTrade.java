package com.after_sunrise.cryptocurrency.cryptotrader.service.poloniex;

import com.after_sunrise.cryptocurrency.cryptotrader.framework.Trade;
import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * @author takanori.takase
 * @version 0.0.1
 */
@Getter
@Builder
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PoloniexTrade implements Trade {

    @SerializedName("date")
    private Instant timestamp;

    @SerializedName("rate")
    private BigDecimal price;

    @SerializedName("amount")
    private BigDecimal size;

}
